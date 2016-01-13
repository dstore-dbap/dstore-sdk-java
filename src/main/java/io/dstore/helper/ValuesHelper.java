package io.dstore.helper;

import com.google.protobuf.ByteString;
import com.google.protobuf.util.TimeUtil;
import io.dstore.Values;

import java.io.IOException;
import java.io.InputStream;
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

    public static Values.bytesValue value(byte[] value) {
        return Values.bytesValue.newBuilder().setValue(ByteString.copyFrom(value)).build();
    }

    public static Date toDate(Values.timestampValue value) {
        return new Date(TimeUtil.toMillis(value.getValue()));
    }

    public static BigDecimal toBigDecimal(Values.decimalValue value) {
        return new BigDecimal(value.getValue());
    }

    public static byte[] toByteArray(Values.bytesValue value) {
        return value.getValue().toByteArray();
    }

    public static Object convertToObject(Values.ValueOrBuilder value) {

        switch (value.getValueCase()) {
            case BOOLEAN_VALUE:
                return (value.getBooleanValue().getValue());
            case STRING_VALUE:
                return (value.getStringValue().getValue());
            case TIMESTAMP_VALUE:
                return (ValuesHelper.toDate(value.getTimestampValue()));
            case LONG_VALUE:
                return (value.getLongValue().getValue());
            case INTEGER_VALUE:
                return (value.getIntegerValue().getValue());
            case DECIMAL_VALUE:
                return (ValuesHelper.toBigDecimal(value.getDecimalValue()));
            case BYTE_VALUE:
                return (ValuesHelper.toByteArray(value.getByteValue()));
            case DOUBLE_VALUE:
                return (value.getDoubleValue().getValue());
            case VALUE_NOT_SET:
                return null;
            default:
                throw new IllegalStateException("Unkown value case " + value.getValueCase().toString());
        }
    }

    public static Values.Value convertToValue(Object value) {

        Values.Value.Builder valueBuilder = Values.Value.newBuilder();

        if (value instanceof String)
            valueBuilder.setStringValue(ValuesHelper.value((String) value));
        else if (value instanceof Integer)
            valueBuilder.setIntegerValue(ValuesHelper.value((Integer) value));
        else if (value instanceof Date)
            valueBuilder.setTimestampValue(ValuesHelper.value((Date) value));
        else if (value instanceof BigDecimal)
            valueBuilder.setDecimalValue(ValuesHelper.value((BigDecimal) value));
        else if (value instanceof Boolean)
            valueBuilder.setBooleanValue(ValuesHelper.value((Boolean) value));
        else if (value instanceof Double)
            valueBuilder.setDoubleValue(ValuesHelper.value((Double) value));
        else if (value instanceof Long)
            valueBuilder.setLongValue(ValuesHelper.value((Long) value));
        else if (value instanceof InputStream) {
            try {
                valueBuilder.setByteValue(Values.bytesValue.newBuilder().setValue(ByteString.readFrom((InputStream) value)));
            } catch (IOException ex) {
                throw new RuntimeException("Error reading from InputStream", ex);
            }
        } else if (value == null) {
        } else
            throw new RuntimeException("Datatype for " + value.getClass().getName() + " unimplemented");

        return valueBuilder.build();
    }

}
