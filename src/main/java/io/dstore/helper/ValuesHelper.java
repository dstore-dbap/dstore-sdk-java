package io.dstore.helper;

import com.google.protobuf.ByteString;
import com.google.protobuf.util.Timestamps;
import io.dstore.values.*;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bdolkemeier on 04.08.15.
 */
public class ValuesHelper {

    public static IntegerValue value(int value) {
        return IntegerValue.newBuilder().setValue(value).build();
    }

    public static StringValue value(String value) {
        return StringValue.newBuilder().setValue(value).build();
    }

    public static DoubleValue value(double value) {
        return DoubleValue.newBuilder().setValue(value).build();
    }

    public static BooleanValue value(boolean value) {
        return BooleanValue.newBuilder().setValue(value).build();
    }

    public static LongValue value(long value) {
        return LongValue.newBuilder().setValue(value).build();
    }

    public static DecimalValue value(BigDecimal value) {
        return DecimalValue.newBuilder().setValue(value.toString()).build();
    }

    public static TimestampValue value(Date value) {
        return TimestampValue.newBuilder().setValue(Timestamps.fromMillis(value.getTime())).build();
    }

    public static BytesValue value(byte[] value) {
        return BytesValue.newBuilder().setValue(ByteString.copyFrom(value)).build();
    }

    public static Date toDate(TimestampValue value) {
        return new Date(Timestamps.toMillis(value.getValue()));
    }

    public static BigDecimal toBigDecimal(DecimalValue value) {
        return new BigDecimal(value.getValue());
    }

    public static byte[] toByteArray(BytesValue value) {
        return value.getValue().toByteArray();
    }

    public static Object convertToObject(ValueOrBuilder value) {

        if (value == null)
            return null;

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

    public static Value convertToValue(Object value) {

        Value.Builder valueBuilder = Value.newBuilder();

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
                valueBuilder.setByteValue(BytesValue.newBuilder().setValue(ByteString.readFrom((InputStream) value)));
            } catch (IOException ex) {
                throw new RuntimeException("Error reading from InputStream", ex);
            }
        } else if (value == null) {
        } else
            throw new RuntimeException("Datatype for " + value.getClass().getName() + " unimplemented");

        return valueBuilder.build();
    }

}
