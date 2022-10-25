package com.tencent.beacon.pack;

import java.io.Serializable;

public final class ValueType implements Serializable {
    public static final ValueType BYTE = new ValueType(1, 1, "BYTE");
    public static final int BYTE_VAL = 1;
    public static final ValueType MAP = new ValueType(0, 0, "MAP");
    public static final int MAP_VAL = 0;
    public static final ValueType UNKNOWN = new ValueType(2, 2, "UNKNOWN");
    public static final int UNKNOWN_VAL = 2;
    private static ValueType[] values = new ValueType[3];
    private String t;
    private int value;

    private ValueType(int i2, int i3, String str) {
        this.t = str;
        this.value = i3;
        values[i2] = this;
    }

    public static ValueType convert(int i2) {
        for (ValueType valueType : values) {
            if (valueType.value() == i2) {
                return valueType;
            }
        }
        return null;
    }

    public static ValueType convert(String str) {
        for (ValueType valueType : values) {
            if (valueType.toString().equals(str)) {
                return valueType;
            }
        }
        return null;
    }

    public String toString() {
        return this.t;
    }

    public int value() {
        return this.value;
    }
}
