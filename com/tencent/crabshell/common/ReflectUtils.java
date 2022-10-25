package com.tencent.crabshell.common;

import java.lang.reflect.Field;
import m.b.a.a.b.f;

public class ReflectUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(6398864324427038178L, "com/tencent/crabshell/common/ReflectUtils", 11);
        $jacocoData = a;
        return a;
    }

    public ReflectUtils() {
        $jacocoInit()[0] = true;
    }

    public static Field getField(Class<?> cls, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            Field declaredField = cls.getDeclaredField(str);
            $jacocoInit[1] = true;
            declaredField.setAccessible(true);
            $jacocoInit[2] = true;
            return declaredField;
        } catch (NoSuchFieldException e2) {
            $jacocoInit[3] = true;
            e2.printStackTrace();
            $jacocoInit[4] = true;
            return null;
        }
    }

    public static void setFieldObject(Class<?> cls, Object obj, String str, Object obj2) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            Field declaredField = cls.getDeclaredField(str);
            $jacocoInit[5] = true;
            declaredField.setAccessible(true);
            $jacocoInit[6] = true;
            declaredField.set(obj, obj2);
            $jacocoInit[7] = true;
        } catch (Exception e2) {
            $jacocoInit[8] = true;
            e2.printStackTrace();
            $jacocoInit[9] = true;
        }
        $jacocoInit[10] = true;
    }
}
