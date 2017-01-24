package io.dstore;

import com.google.protobuf.util.Timestamps;
import io.dstore.helper.ValuesHelper;
import io.dstore.values.Value;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bdolkemeier on 07.10.15.
 */
public class ValuesHelperTest {

    @Test
    public void testInteger() {
        Assert.assertEquals(ValuesHelper.value(1).getValue(),1);
    }

    @Test
    public void testString() {
        Assert.assertEquals(ValuesHelper.value("abc").getValue(),"abc");
    }

    @Test
    public void testDecimal() {
        BigDecimal test = new BigDecimal("2345.5623");
        Assert.assertEquals(new BigDecimal(ValuesHelper.value(test).getValue()),new BigDecimal("2345.5623"));
    }

    @Test
    public void testConvertToObject() {
        Assert.assertTrue((Boolean)ValuesHelper.convertToObject(Value.newBuilder().setBooleanValue(ValuesHelper.value(true)))) ;
    }

    @Test
    public void testTimestamp() {
        Date now = new Date();
        Assert.assertEquals(Timestamps.toMillis(ValuesHelper.value(now).getValue()),now.getTime());
    }

}
