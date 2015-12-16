package io.dstore.elastic;

import com.google.protobuf.util.TimeUtil;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * Created by bdolkemeier on 07.10.15.
 */
public class ValuesHelperTest {

    @Test
    public void testInteger() {
        assert (Long) ValuesHelper.convertToObject(ValuesHelper.convertToValue(23L)) == 23L;
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void testUnknownDatatype() {
        assert ValuesHelper.convertToValue(new StringBuilder("abc")).getBooleanValue();
    }

    @Test
    public void testTimestamp() {
        Date now = new Date();
        assert TimeUtil.toMillis(ValuesHelper.convertToValue(now).getTimestampValue()) == now.getTime();
        assert ((Date) ValuesHelper.convertToObject(ValuesHelper.convertToValue(now))).getTime() == now.getTime();
    }
}
