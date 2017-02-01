package io.dstore.helper;

import io.dstore.elastic.Field;
import io.dstore.elastic.item.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Created by bdolkemeier on 01.02.17.
 */
public class ConverterTest {

    @Test
    public void toItemXml() {

        Item item = Item.newBuilder()
                .setDocumentId("doc123")
                .setIndexName("items_123")
                .setLastUpdated(ValuesHelper.value(new Date(12345678)))
                .setNode(
                        Item.Node.newBuilder()
                                .setActive(true)
                                .setTreeNodeId(123)
                                .addPredecessorTreeNodeId(999)
                                .addPredecessorTreeNodeId(555)
                                .addPredecessorTreeNodeId(444)
                                .putFields("6", Field.newBuilder().setName("6").addValue(ValuesHelper.convertToValue(666)).build())
                )
                .addVariantNode(
                        Item.Node.newBuilder()
                                .setActive(true)
                                .setTreeNodeId(127)
                                .addPredecessorTreeNodeId(999)
                                .addPredecessorTreeNodeId(555)
                                .addPredecessorTreeNodeId(444)
                                .addPredecessorTreeNodeId(123)
                                .putFields("7-details", Field.newBuilder().setName("7-details").addValue(ValuesHelper.convertToValue("agf55555")).build())
                )
                .build();

        Assert.assertEquals(Converter.toItemXml(item),
                "<item><variantNode><active>true</active><treeNodeId>127</treeNodeId><predecessorTreeNodeId>999</predecessorTreeNodeId><predecessorTreeNodeId>555</predecessorTreeNodeId><predecessorTreeNodeId>444</predecessorTreeNodeId><predecessorTreeNodeId>123</predecessorTreeNodeId><fields><id_7-details><name>7-details</name><value><stringValue><value>agf55555</value></stringValue></value></id_7-details></fields></variantNode><node><active>true</active><treeNodeId>123</treeNodeId><predecessorTreeNodeId>999</predecessorTreeNodeId><predecessorTreeNodeId>555</predecessorTreeNodeId><predecessorTreeNodeId>444</predecessorTreeNodeId><fields><id_6><name>6</name><value><integerValue><value>666</value></integerValue></value></id_6></fields></node><indexName>items_123</indexName><lastUpdated><value>1970-01-01T03:25:45.678Z</value></lastUpdated><documentId>doc123</documentId></item>");
    }
}
