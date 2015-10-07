package io.dstore.helper;

import com.google.protobuf.util.TimeUtil;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bdolkemeier on 07.10.15.
 */
public class ValuesHelperTest {

    @Test
    public void testInteger() {
        assert ValuesHelper.value(1).getValue() == 1;
    }

    @Test
    public void testString() {
        assert ValuesHelper.value("abc").getValue().equals("abc");
    }

    @Test
    public void testDecimal() {
        BigDecimal test = new BigDecimal("2345.5623");
        assert new BigDecimal(ValuesHelper.value(test).getValue()).equals(new BigDecimal("2345.5623"));
    }

    @Test
    public void testTimestamp() {
        Date now = new Date();
        assert TimeUtil.toMillis(ValuesHelper.value(now).getValue()) == now.getTime();
    }

}
