package io.dstore.helper;

import com.google.protobuf.util.TimeUtil;
import io.dstore.engine.Values;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bdolkemeier on 04.08.15.
 */
public class ValuesHelper {

    public static Values.integerValue value(int value) {
        return Values.integerValue.newBuilder().setValue(value).build();
    }

    public static Values.stringValue value(String value) {
        return Values.stringValue.newBuilder().setValue(value).build();
    }

    public static Values.doubleValue value(double value) {
        return Values.doubleValue.newBuilder().setValue(value).build();
    }

    public static Values.booleanValue value(boolean value) {
        return Values.booleanValue.newBuilder().setValue(value).build();
    }

    public static Values.longValue value(long value) {
        return Values.longValue.newBuilder().setValue(value).build();
    }

    public static Values.decimalValue value(BigDecimal value) {
        return Values.decimalValue.newBuilder().setValue(value.toString()).build();
    }

    public static Values.timestampValue value(Date value) {
        return Values.timestampValue.newBuilder().setValue(TimeUtil.createTimestampFromMillis(value.getTime())).build();
    }

    //TODO ByteValues

}
