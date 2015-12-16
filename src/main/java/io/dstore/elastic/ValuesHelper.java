package io.dstore.elastic;

import com.google.protobuf.Timestamp;
import com.google.protobuf.util.TimeUtil;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bdolkemeier on 16.12.15.
 */
public class ValuesHelper {

    public static Date toDate(Timestamp value) {
        return new Date(TimeUtil.toMillis(value));
    }

    public static Object convertToObject(Elastic.Value value) {

        switch (value.getValueCase()) {
            case BOOLEAN_VALUE:
                return (value.getBooleanValue());
            case STRING_VALUE:
                return (value.getStringValue());
            case TIMESTAMP_VALUE:
                return (toDate(value.getTimestampValue()));
            case INTEGER_VALUE:
                return (value.getIntegerValue());
            case DOUBLE_VALUE:
                return (value.getDoubleValue());
            case VALUE_NOT_SET:
                return null;
            default:
                throw new IllegalStateException("Unkown value case " + value.getValueCase().toString());
        }
    }

    public static Elastic.Value convertToValue(Object value) {

        Elastic.Value.Builder valueBuilder = Elastic.Value.newBuilder();

        if (value instanceof String)
            valueBuilder.setStringValue((String) value);
        else if (value instanceof Integer)
            valueBuilder.setIntegerValue((Integer) value);
        else if (value instanceof Date)
            valueBuilder.setTimestampValue(TimeUtil.createTimestampFromMillis(((Date) value).getTime()));
        else if (value instanceof BigDecimal)
            valueBuilder.setDoubleValue(((BigDecimal) value).doubleValue());
        else if (value instanceof Boolean)
            valueBuilder.setBooleanValue((Boolean) value);
        else if (value instanceof Double)
            valueBuilder.setDoubleValue((Double) value);
        else if (value instanceof Long)
            valueBuilder.setIntegerValue((Long) value);
        else if (value == null) {
        } else
            throw new RuntimeException("Datatype for " + value.getClass().getName() + " unimplemented");

        return valueBuilder.build();
    }
}
