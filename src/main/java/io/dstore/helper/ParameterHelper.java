package io.dstore.helper;

import io.dstore.engine.Values;

/**
 * Created by bdolkemeier on 04.08.15.
 */
public class ParameterHelper {

    public static Values.integerValue value(int value) {
        return Values.integerValue.newBuilder().setValue(value).build();
    }

    public static Values.stringValue value(String value) {
        return Values.stringValue.newBuilder().setValue(value).build();
    }

}
