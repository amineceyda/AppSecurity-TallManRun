package com.tencent.crabshell.loader;

import android.content.Context;
import g.a.a.a.a;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import m.b.a.a.b.f;

public class ShareReflectUtil {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = f.a(-8757529099883205269L, "com/tencent/crabshell/loader/ShareReflectUtil", 85);
        $jacocoData = a;
        return a;
    }

    public ShareReflectUtil() {
        $jacocoInit()[0] = true;
    }

    public static void expandFieldArray(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        boolean[] $jacocoInit = $jacocoInit();
        Field findField = findField(obj, str);
        $jacocoInit[54] = true;
        Object[] objArr2 = (Object[]) findField.get(obj);
        $jacocoInit[55] = true;
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        $jacocoInit[56] = true;
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        $jacocoInit[57] = true;
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        $jacocoInit[58] = true;
        findField.set(obj, objArr3);
        $jacocoInit[59] = true;
    }

    public static Constructor<?> findConstructor(Object obj, Class<?>... clsArr) throws NoSuchMethodException {
        boolean[] $jacocoInit = $jacocoInit();
        Class cls = obj.getClass();
        $jacocoInit[42] = true;
        while (cls != null) {
            try {
                $jacocoInit[43] = true;
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
                $jacocoInit[44] = true;
                if (declaredConstructor.isAccessible()) {
                    $jacocoInit[45] = true;
                } else {
                    $jacocoInit[46] = true;
                    declaredConstructor.setAccessible(true);
                    $jacocoInit[47] = true;
                }
                $jacocoInit[48] = true;
                return declaredConstructor;
            } catch (NoSuchMethodException unused) {
                $jacocoInit[49] = true;
                cls = cls.getSuperclass();
                $jacocoInit[50] = true;
            }
        }
        StringBuilder i2 = a.i("Constructor with parameters ");
        $jacocoInit[51] = true;
        i2.append(Arrays.asList(clsArr));
        i2.append(" not found in ");
        $jacocoInit[52] = true;
        i2.append(obj.getClass());
        NoSuchMethodException noSuchMethodException = new NoSuchMethodException(i2.toString());
        $jacocoInit[53] = true;
        throw noSuchMethodException;
    }

    public static Field findField(Class<?> cls, String str) throws NoSuchFieldException {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[11] = true;
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                $jacocoInit[12] = true;
                Field declaredField = cls2.getDeclaredField(str);
                $jacocoInit[13] = true;
                if (declaredField.isAccessible()) {
                    $jacocoInit[14] = true;
                } else {
                    $jacocoInit[15] = true;
                    declaredField.setAccessible(true);
                    $jacocoInit[16] = true;
                }
                $jacocoInit[17] = true;
                return declaredField;
            } catch (NoSuchFieldException unused) {
                $jacocoInit[18] = true;
                cls2 = cls2.getSuperclass();
                $jacocoInit[19] = true;
            }
        }
        NoSuchFieldException noSuchFieldException = new NoSuchFieldException("Field " + str + " not found in " + cls);
        $jacocoInit[20] = true;
        throw noSuchFieldException;
    }

    public static Field findField(Object obj, String str) throws NoSuchFieldException {
        boolean[] $jacocoInit = $jacocoInit();
        Class cls = obj.getClass();
        $jacocoInit[1] = true;
        while (cls != null) {
            try {
                $jacocoInit[2] = true;
                Field declaredField = cls.getDeclaredField(str);
                $jacocoInit[3] = true;
                if (declaredField.isAccessible()) {
                    $jacocoInit[4] = true;
                } else {
                    $jacocoInit[5] = true;
                    declaredField.setAccessible(true);
                    $jacocoInit[6] = true;
                }
                $jacocoInit[7] = true;
                return declaredField;
            } catch (NoSuchFieldException unused) {
                $jacocoInit[8] = true;
                cls = cls.getSuperclass();
                $jacocoInit[9] = true;
            }
        }
        StringBuilder n = a.n("Field ", str, " not found in ");
        n.append(obj.getClass());
        NoSuchFieldException noSuchFieldException = new NoSuchFieldException(n.toString());
        $jacocoInit[10] = true;
        throw noSuchFieldException;
    }

    public static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        boolean[] $jacocoInit = $jacocoInit();
        Class<? super Object> cls2 = cls;
        while (cls2 != null) {
            try {
                $jacocoInit[33] = true;
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                $jacocoInit[34] = true;
                if (declaredMethod.isAccessible()) {
                    $jacocoInit[35] = true;
                } else {
                    $jacocoInit[36] = true;
                    declaredMethod.setAccessible(true);
                    $jacocoInit[37] = true;
                }
                $jacocoInit[38] = true;
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                $jacocoInit[39] = true;
                Class<? super Object> superclass = cls2.getSuperclass();
                $jacocoInit[40] = true;
                cls2 = superclass;
            }
        }
        StringBuilder n = a.n("Method ", str, " with parameters ");
        n.append(Arrays.asList(clsArr));
        n.append(" not found in ");
        n.append(cls2);
        NoSuchMethodException noSuchMethodException = new NoSuchMethodException(n.toString());
        $jacocoInit[41] = true;
        throw noSuchMethodException;
    }

    public static Method findMethod(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        boolean[] $jacocoInit = $jacocoInit();
        Class cls = obj.getClass();
        $jacocoInit[21] = true;
        while (cls != null) {
            try {
                $jacocoInit[22] = true;
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                $jacocoInit[23] = true;
                if (declaredMethod.isAccessible()) {
                    $jacocoInit[24] = true;
                } else {
                    $jacocoInit[25] = true;
                    declaredMethod.setAccessible(true);
                    $jacocoInit[26] = true;
                }
                $jacocoInit[27] = true;
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                $jacocoInit[28] = true;
                cls = cls.getSuperclass();
                $jacocoInit[29] = true;
            }
        }
        StringBuilder n = a.n("Method ", str, " with parameters ");
        $jacocoInit[30] = true;
        n.append(Arrays.asList(clsArr));
        n.append(" not found in ");
        $jacocoInit[31] = true;
        n.append(obj.getClass());
        NoSuchMethodException noSuchMethodException = new NoSuchMethodException(n.toString());
        $jacocoInit[32] = true;
        throw noSuchMethodException;
    }

    public static Object getActivityThread(Context context, Class<?> cls) {
        boolean[] $jacocoInit = $jacocoInit();
        if (cls != null) {
            try {
                $jacocoInit[66] = true;
            } catch (Throwable unused) {
                $jacocoInit[81] = true;
                return null;
            }
        } else {
            $jacocoInit[67] = true;
            cls = Class.forName("android.app.ActivityThread");
            $jacocoInit[68] = true;
        }
        Method method = cls.getMethod("currentActivityThread", new Class[0]);
        $jacocoInit[69] = true;
        method.setAccessible(true);
        $jacocoInit[70] = true;
        Object invoke = method.invoke((Object) null, new Object[0]);
        if (invoke != null) {
            $jacocoInit[71] = true;
        } else if (context == null) {
            $jacocoInit[72] = true;
        } else {
            $jacocoInit[73] = true;
            Field field = context.getClass().getField("mLoadedApk");
            $jacocoInit[74] = true;
            field.setAccessible(true);
            $jacocoInit[75] = true;
            Object obj = field.get(context);
            $jacocoInit[76] = true;
            Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
            $jacocoInit[77] = true;
            declaredField.setAccessible(true);
            $jacocoInit[78] = true;
            invoke = declaredField.get(obj);
            $jacocoInit[79] = true;
        }
        $jacocoInit[80] = true;
        return invoke;
    }

    public static int getValueOfStaticIntField(Class<?> cls, String str, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        try {
            Field findField = findField(cls, str);
            $jacocoInit[82] = true;
            int i3 = findField.getInt((Object) null);
            $jacocoInit[83] = true;
            return i3;
        } catch (Throwable unused) {
            $jacocoInit[84] = true;
            return i2;
        }
    }

    public static void reduceFieldArray(Object obj, String str, int i2) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        boolean[] $jacocoInit = $jacocoInit();
        if (i2 <= 0) {
            $jacocoInit[60] = true;
            return;
        }
        Field findField = findField(obj, str);
        $jacocoInit[61] = true;
        Object[] objArr = (Object[]) findField.get(obj);
        int length = objArr.length - i2;
        if (length <= 0) {
            $jacocoInit[62] = true;
            return;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
        $jacocoInit[63] = true;
        System.arraycopy(objArr, i2, objArr2, 0, length);
        $jacocoInit[64] = true;
        findField.set(obj, objArr2);
        $jacocoInit[65] = true;
    }
}
