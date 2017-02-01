package io.dstore.helper;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import io.dstore.elastic.item.Item;
import org.json.JSONObject;
import org.json.XML;

/**
 * Created by bdolkemeier on 01.02.17.
 */
public class Converter {

    public static String toItemXml(Item item) {

        if (item == null)
            throw new IllegalArgumentException("item is null");

        try {
            String jsonString = JsonFormat.printer().omittingInsignificantWhitespace().print(item);
            // need to replace: field name may start with a number and elements starting with a number are not allowed in xml
            JSONObject jsonObject = new JSONObject(jsonString.replaceAll("\"([0-9]+(-details)?)\":\\{\"name\":", "\"id_" + "$1\":{\"name\":"));
            return ("<item>" + XML.toString(jsonObject) + "</item>");
        } catch (InvalidProtocolBufferException ex) {
            throw new IllegalArgumentException("unable to convert item with documentId " + item.getDocumentId(), ex);
        }

    }
}
