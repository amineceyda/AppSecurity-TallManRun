package com.tencent.raft.raftframework.remote;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.tencent.raft.raftannotation.RRemote;
import com.tencent.raft.raftframework.exception.RAFTIPCNotSupportException;
import com.tencent.raft.raftframework.log.RLog;
import g.a.a.a.a;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoteProxyUtil {
    public static final String KEY_CALL_API = "callRaft";
    public static final String KEY_RESULT = "result";
    public static final String KEY_RESULT_TYPE = "resultType";
    public static final String SPLIT_CHAR = "$";
    private static final Class<?>[] SUPPORTED_CLASS = {Short.TYPE, Integer.TYPE, Long.TYPE, Double.TYPE, Float.TYPE, Boolean.TYPE, Character.TYPE, Byte.TYPE, String.class, Boolean.class, Parcelable.class, Serializable.class};
    private static final String TAG = "RemoteProxyUtil";

    private RemoteProxyUtil() {
    }

    public static void checkCurrentThread(Class<?> cls, Method method) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            StringBuilder i2 = a.i("IPC Dynamic class ");
            i2.append(cls.getName());
            i2.append("#");
            i2.append(method.getName());
            i2.append(" can't invoke in MainThread");
            throw new RAFTIPCNotSupportException(i2.toString(), RAFTIPCNotSupportException.Reason.UNSUPPORTED_THREAD);
        }
    }

    public static void checkMethodAndParameter(Method method, boolean z, Object[] objArr) {
        if (method.isAnnotationPresent(RRemote.class)) {
            Class[] parameterTypes = method.getParameterTypes();
            int i2 = 0;
            while (true) {
                Object obj = null;
                if (i2 < parameterTypes.length) {
                    if (objArr != null) {
                        obj = objArr[i2];
                    }
                    if (isSupportedClass(parameterTypes[i2], obj)) {
                        i2++;
                    } else {
                        RLog.w(TAG, getMethodExceptionString(method) + " has unsupported param:" + parameterTypes[i2].getName());
                        throw new RAFTIPCNotSupportException(getMethodExceptionString(method) + " has unsupported param:" + parameterTypes[i2].getName(), RAFTIPCNotSupportException.Reason.UNSUPPORTED_METHOD);
                    }
                } else if (!method.getReturnType().equals(Void.TYPE) && !isSupportedClass(method.getReturnType(), (Object) null)) {
                    RLog.w(TAG, getMethodExceptionString(method) + " has unsupported return type:" + method.getReturnType());
                    throw new RAFTIPCNotSupportException(getMethodExceptionString(method) + " has unsupported return type:" + method.getReturnType(), RAFTIPCNotSupportException.Reason.UNSUPPORTED_METHOD);
                } else {
                    return;
                }
            }
        } else if (z) {
            RLog.w(TAG, a.f(new StringBuilder(), getMethodExceptionString(method), " has not RRemote annotation"));
            throw new RAFTIPCNotSupportException(a.f(new StringBuilder(), getMethodExceptionString(method), " has not RRemote annotation"), RAFTIPCNotSupportException.Reason.UNSUPPORTED_METHOD);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object getBundleParameter(android.os.Bundle r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "RemoteProxyUtil"
            java.lang.String r1 = "void"
            boolean r1 = r10.endsWith(r1)
            r2 = 0
            if (r1 == 0) goto L_0x000c
            return r2
        L_0x000c:
            r10.hashCode()
            r1 = 1
            r3 = 0
            r4 = -1
            int r5 = r10.hashCode()
            switch(r5) {
                case -1402722386: goto L_0x00ae;
                case -1325958191: goto L_0x00a3;
                case -1114099497: goto L_0x0098;
                case 104431: goto L_0x008d;
                case 3039496: goto L_0x0082;
                case 3052374: goto L_0x0077;
                case 3327612: goto L_0x006c;
                case 64711720: goto L_0x0061;
                case 65821278: goto L_0x0053;
                case 97526364: goto L_0x0045;
                case 109413500: goto L_0x0037;
                case 344809556: goto L_0x0029;
                case 1195259493: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x00b8
        L_0x001b:
            java.lang.String r5 = "java.lang.String"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x0025
            goto L_0x00b8
        L_0x0025:
            r4 = 12
            goto L_0x00b8
        L_0x0029:
            java.lang.String r5 = "java.lang.Boolean"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x0033
            goto L_0x00b8
        L_0x0033:
            r4 = 11
            goto L_0x00b8
        L_0x0037:
            java.lang.String r5 = "short"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x0041
            goto L_0x00b8
        L_0x0041:
            r4 = 10
            goto L_0x00b8
        L_0x0045:
            java.lang.String r5 = "float"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x004f
            goto L_0x00b8
        L_0x004f:
            r4 = 9
            goto L_0x00b8
        L_0x0053:
            java.lang.String r5 = "java.util.List"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x005d
            goto L_0x00b8
        L_0x005d:
            r4 = 8
            goto L_0x00b8
        L_0x0061:
            java.lang.String r5 = "boolean"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x006a
            goto L_0x00b8
        L_0x006a:
            r4 = 7
            goto L_0x00b8
        L_0x006c:
            java.lang.String r5 = "long"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x0075
            goto L_0x00b8
        L_0x0075:
            r4 = 6
            goto L_0x00b8
        L_0x0077:
            java.lang.String r5 = "char"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x0080
            goto L_0x00b8
        L_0x0080:
            r4 = 5
            goto L_0x00b8
        L_0x0082:
            java.lang.String r5 = "byte"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x008b
            goto L_0x00b8
        L_0x008b:
            r4 = 4
            goto L_0x00b8
        L_0x008d:
            java.lang.String r5 = "int"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x0096
            goto L_0x00b8
        L_0x0096:
            r4 = 3
            goto L_0x00b8
        L_0x0098:
            java.lang.String r5 = "java.util.ArrayList"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x00a1
            goto L_0x00b8
        L_0x00a1:
            r4 = 2
            goto L_0x00b8
        L_0x00a3:
            java.lang.String r5 = "double"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x00ac
            goto L_0x00b8
        L_0x00ac:
            r4 = 1
            goto L_0x00b8
        L_0x00ae:
            java.lang.String r5 = "java.util.HashMap"
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r4 = 0
        L_0x00b8:
            switch(r4) {
                case 0: goto L_0x0174;
                case 1: goto L_0x016b;
                case 2: goto L_0x0166;
                case 3: goto L_0x015d;
                case 4: goto L_0x0154;
                case 5: goto L_0x014b;
                case 6: goto L_0x0142;
                case 7: goto L_0x0139;
                case 8: goto L_0x0166;
                case 9: goto L_0x0130;
                case 10: goto L_0x0127;
                case 11: goto L_0x0139;
                case 12: goto L_0x0122;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            java.lang.Class r4 = java.lang.Class.forName(r10)     // Catch:{ Exception -> 0x00cb }
            java.lang.Class[] r5 = r4.getInterfaces()     // Catch:{ Exception -> 0x00cb }
            int r5 = r5.length     // Catch:{ Exception -> 0x00cb }
            if (r5 <= 0) goto L_0x00d4
            java.lang.Class[] r4 = r4.getInterfaces()     // Catch:{ Exception -> 0x00cb }
            goto L_0x00d5
        L_0x00cb:
            r4 = move-exception
            r4.printStackTrace()
            java.lang.String r5 = "getBundleParameter error"
            com.tencent.raft.raftframework.log.RLog.w(r0, r5, r4)
        L_0x00d4:
            r4 = r2
        L_0x00d5:
            if (r4 == 0) goto L_0x0114
            int r5 = r4.length
            r6 = 0
        L_0x00d9:
            if (r6 >= r5) goto L_0x0114
            r7 = r4[r6]
            java.lang.Class<android.os.Parcelable> r8 = android.os.Parcelable.class
            boolean r8 = r7.isAssignableFrom(r8)
            if (r8 == 0) goto L_0x00ea
            android.os.Parcelable r9 = r9.getParcelable(r11)
            return r9
        L_0x00ea:
            java.lang.Class<java.io.Serializable> r8 = java.io.Serializable.class
            boolean r8 = r7.isAssignableFrom(r8)
            if (r8 == 0) goto L_0x00f7
            java.io.Serializable r9 = r9.getSerializable(r11)
            return r9
        L_0x00f7:
            java.lang.Class<java.util.Collection> r8 = java.util.Collection.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 == 0) goto L_0x0104
            java.lang.Object r9 = getListObject(r9, r11)
            return r9
        L_0x0104:
            java.lang.Class<java.util.HashMap> r8 = java.util.HashMap.class
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L_0x0111
            java.io.Serializable r9 = r9.getSerializable(r11)
            return r9
        L_0x0111:
            int r6 = r6 + 1
            goto L_0x00d9
        L_0x0114:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r11 = "getBundleParameter unSupportClass="
            java.lang.String r10 = g.a.a.a.a.w(r11, r10)
            r9[r3] = r10
            com.tencent.raft.raftframework.log.RLog.w(r0, r9)
            return r2
        L_0x0122:
            java.lang.String r9 = r9.getString(r11)
            return r9
        L_0x0127:
            short r9 = r9.getShort(r11)
            java.lang.Short r9 = java.lang.Short.valueOf(r9)
            return r9
        L_0x0130:
            float r9 = r9.getFloat(r11)
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            return r9
        L_0x0139:
            boolean r9 = r9.getBoolean(r11)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L_0x0142:
            long r9 = r9.getLong(r11)
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            return r9
        L_0x014b:
            char r9 = r9.getChar(r11)
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            return r9
        L_0x0154:
            byte r9 = r9.getByte(r11)
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            return r9
        L_0x015d:
            int r9 = r9.getInt(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            return r9
        L_0x0166:
            java.lang.Object r9 = getListObject(r9, r11)
            return r9
        L_0x016b:
            double r9 = r9.getDouble(r11)
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            return r9
        L_0x0174:
            java.io.Serializable r9 = r9.getSerializable(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.raft.raftframework.remote.RemoteProxyUtil.getBundleParameter(android.os.Bundle, java.lang.String, java.lang.String):java.lang.Object");
    }

    public static Class<?> getClassFromName(String str) throws ClassNotFoundException {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1402722386:
                if (str.equals("java.util.HashMap")) {
                    c = 0;
                    break;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    c = 1;
                    break;
                }
                break;
            case -1114099497:
                if (str.equals("java.util.ArrayList")) {
                    c = 2;
                    break;
                }
                break;
            case -361922034:
                if (str.equals("android.os.Parcelable")) {
                    c = 3;
                    break;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    c = 4;
                    break;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    c = 5;
                    break;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    c = 6;
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    c = 7;
                    break;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    c = 8;
                    break;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    c = 9;
                    break;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    c = 10;
                    break;
                }
                break;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    c = 11;
                    break;
                }
                break;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    c = 12;
                    break;
                }
                break;
            case 1832181019:
                if (str.equals("java.io.Serializable")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return HashMap.class;
            case 1:
                return Double.TYPE;
            case 2:
                return ArrayList.class;
            case 3:
                return Parcelable.class;
            case 4:
                return Integer.TYPE;
            case 5:
                return Byte.TYPE;
            case 6:
                return Character.TYPE;
            case 7:
                return Long.TYPE;
            case 8:
                return Boolean.TYPE;
            case 9:
                return Float.TYPE;
            case 10:
                return Short.TYPE;
            case 11:
                return Boolean.class;
            case 12:
                return String.class;
            case ConnectionResult.CANCELED:
                return Serializable.class;
            default:
                return Class.forName(str);
        }
    }

    private static Object getListObject(Bundle bundle, String str) {
        Serializable parcelableArrayList = bundle.getParcelableArrayList(str);
        if (parcelableArrayList == null) {
            parcelableArrayList = bundle.getStringArrayList(str);
        }
        if (parcelableArrayList == null) {
            parcelableArrayList = bundle.getIntegerArrayList(str);
        }
        if (parcelableArrayList == null) {
            parcelableArrayList = bundle.getSerializable(str);
        }
        if (parcelableArrayList == null) {
            RLog.w(TAG, a.w("getListObject unSupportList, key=", str));
        }
        return parcelableArrayList;
    }

    private static String getMethodExceptionString(Method method) {
        StringBuilder i2 = a.i("RRemote Annotation Method ");
        i2.append(method.getClass().getName());
        i2.append("#");
        i2.append(method.getName());
        return i2.toString();
    }

    private static boolean isDeclareAssignableFrom(Class<?> cls, Class<?> cls2) {
        try {
            cls.asSubclass(cls2);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public static boolean isSupportedClass(Class<?> cls, Object obj) {
        for (Class<?> cls2 : SUPPORTED_CLASS) {
            if (cls.isAssignableFrom(cls2) || isDeclareAssignableFrom(cls, cls2)) {
                return true;
            }
        }
        return isSupportedListClass(cls, obj);
    }

    private static boolean isSupportedListClass(Class<?> cls, Object obj) {
        if (!isDeclareAssignableFrom(cls, List.class)) {
            return false;
        }
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        return list.isEmpty() || (list.get(0) instanceof String) || (list.get(0) instanceof Integer) || (list.get(0) instanceof Parcelable) || (obj instanceof Serializable);
    }

    private static void putListObject(Bundle bundle, String str, Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (!list.isEmpty()) {
                if (list.get(0) instanceof String) {
                    bundle.putStringArrayList(str, (ArrayList) obj);
                    return;
                } else if (list.get(0) instanceof Integer) {
                    bundle.putIntegerArrayList(str, (ArrayList) obj);
                    return;
                } else if (list.get(0) instanceof Parcelable) {
                    bundle.putParcelableArrayList(str, (ArrayList) obj);
                    return;
                } else if (!(obj instanceof Serializable)) {
                    return;
                }
            } else if (!(obj instanceof Serializable)) {
                return;
            }
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public static void setBundleParameter(Bundle bundle, String str, String str2, Object obj) {
        if ("int".equals(str)) {
            bundle.putInt(str2, ((Integer) obj).intValue());
        } else if ("java.lang.String".equals(str)) {
            bundle.putString(str2, (String) obj);
        } else {
            if (!"java.lang.Boolean".equals(str)) {
                if ("long".equals(str)) {
                    bundle.putLong(str2, ((Long) obj).longValue());
                    return;
                } else if ("byte".equals(str)) {
                    bundle.putByte(str2, ((Byte) obj).byteValue());
                    return;
                } else if ("double".equals(str)) {
                    bundle.putDouble(str2, ((Double) obj).doubleValue());
                    return;
                } else if ("short".equals(str)) {
                    bundle.putShort(str2, ((Short) obj).shortValue());
                    return;
                } else if ("float".equals(str)) {
                    bundle.putFloat(str2, ((Float) obj).floatValue());
                    return;
                } else if ("char".equals(str)) {
                    bundle.putChar(str2, ((Character) obj).charValue());
                    return;
                } else if (!"boolean".equals(str)) {
                    if ("java.util.List".equals(str)) {
                        putListObject(bundle, str2, obj);
                        return;
                    } else if (obj instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj);
                        return;
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                        return;
                    } else {
                        return;
                    }
                }
            }
            bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
        }
    }

    public static void setMethodAndParameter(Method method, Object[] objArr, Bundle bundle) {
        Class[] parameterTypes = method.getParameterTypes();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            String r = a.r("__arg+", i2, "__");
            String name = parameterTypes[i2].getName();
            arrayList.add(name);
            setBundleParameter(bundle, name, r, objArr[i2]);
        }
        bundle.putStringArrayList("__parameterTypes__", arrayList);
    }

    public static void verifyClass(Class<?> cls) {
        for (Method checkMethodAndParameter : cls.getDeclaredMethods()) {
            checkMethodAndParameter(checkMethodAndParameter, false, (Object[]) null);
        }
    }
}
