package g.e.a.b.f.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;
import g.c.b.b.f;
import g.e.a.b.b.c;
import g.e.a.b.b.h.e;
import g.e.a.b.b.i.b;
import g.e.a.b.e.c.c1;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public final class q9 extends i5 {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f3314g = {"firebase_", "google_", "ga_"};

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f3315h = {"_err"};
    public SecureRandom c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicLong f3316d = new AtomicLong(0);

    /* renamed from: e  reason: collision with root package name */
    public int f3317e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f3318f = null;

    public q9(n4 n4Var) {
        super(n4Var);
    }

    public static boolean U(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean V(String str) {
        f.k(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean W(Context context) {
        ActivityInfo receiverInfo;
        Objects.requireNonNull(context, "null reference");
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean X(Context context) {
        Objects.requireNonNull(context, "null reference");
        return f0(context, Build.VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean Y(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static final boolean b0(Bundle bundle, int i2) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i2);
        return true;
    }

    public static boolean e0(String str, String[] strArr) {
        for (String Y : strArr) {
            if (Y(str, Y)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r3 = r1.getServiceInfo(new android.content.ComponentName(r3, r4), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f0(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0019 }
            r2.<init>(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r3 == 0) goto L_0x0019
            r3 = 1
            return r3
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.q9.f0(android.content.Context, java.lang.String):boolean");
    }

    public static long m0(byte[] bArr) {
        Objects.requireNonNull(bArr, "null reference");
        int length = bArr.length;
        int i2 = 0;
        if (length > 0) {
            int i3 = length - 1;
            long j2 = 0;
            while (i3 >= 0 && i3 >= bArr.length - 8) {
                j2 += (((long) bArr[i3]) & 255) << i2;
                i2 += 8;
                i3--;
            }
            return j2;
        }
        throw new IllegalStateException();
    }

    public static MessageDigest r() {
        int i2 = 0;
        while (i2 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static ArrayList t(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzab zzab = (zzab) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzab.zza);
            bundle.putString("origin", zzab.zzb);
            bundle.putLong("creation_timestamp", zzab.zzd);
            bundle.putString("name", zzab.zzc.zzb);
            Object c2 = zzab.zzc.c();
            Objects.requireNonNull(c2, "null reference");
            e.G(bundle, c2);
            bundle.putBoolean("active", zzab.zze);
            String str = zzab.zzf;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzau zzau = zzab.zzg;
            if (zzau != null) {
                bundle.putString("timed_out_event_name", zzau.zza);
                zzas zzas = zzau.zzb;
                if (zzas != null) {
                    bundle.putBundle("timed_out_event_params", zzas.f());
                }
            }
            bundle.putLong("trigger_timeout", zzab.zzh);
            zzau zzau2 = zzab.zzi;
            if (zzau2 != null) {
                bundle.putString("triggered_event_name", zzau2.zza);
                zzas zzas2 = zzau2.zzb;
                if (zzas2 != null) {
                    bundle.putBundle("triggered_event_params", zzas2.f());
                }
            }
            bundle.putLong("triggered_timestamp", zzab.zzc.zzc);
            bundle.putLong("time_to_live", zzab.zzj);
            zzau zzau3 = zzab.zzk;
            if (zzau3 != null) {
                bundle.putString("expired_event_name", zzau3.zza);
                zzas zzas3 = zzau3.zzb;
                if (zzas3 != null) {
                    bundle.putBundle("expired_event_params", zzas3.f());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void w(y6 y6Var, Bundle bundle, boolean z) {
        if (!(bundle == null || y6Var == null)) {
            if (!bundle.containsKey("_sc") || z) {
                String str = y6Var.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = y6Var.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", y6Var.c);
                return;
            }
            z = false;
        }
        if (bundle != null && y6Var == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void A(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                this.a.d().f3141k.c("Not putting event parameter. Invalid value type. name, type", this.a.f3264m.e(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void B(c1 c1Var, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            c1Var.a(bundle);
        } catch (RemoteException e2) {
            this.a.d().f3139i.b("Error returning boolean value to wrapper", e2);
        }
    }

    public final void C(c1 c1Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            c1Var.a(bundle);
        } catch (RemoteException e2) {
            this.a.d().f3139i.b("Error returning bundle list to wrapper", e2);
        }
    }

    public final void D(c1 c1Var, Bundle bundle) {
        try {
            c1Var.a(bundle);
        } catch (RemoteException e2) {
            this.a.d().f3139i.b("Error returning bundle value to wrapper", e2);
        }
    }

    public final void E(c1 c1Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            c1Var.a(bundle);
        } catch (RemoteException e2) {
            this.a.d().f3139i.b("Error returning byte array to wrapper", e2);
        }
    }

    public final void F(c1 c1Var, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            c1Var.a(bundle);
        } catch (RemoteException e2) {
            this.a.d().f3139i.b("Error returning int value to wrapper", e2);
        }
    }

    public final void G(c1 c1Var, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            c1Var.a(bundle);
        } catch (RemoteException e2) {
            this.a.d().f3139i.b("Error returning long value to wrapper", e2);
        }
    }

    public final void H(c1 c1Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            c1Var.a(bundle);
        } catch (RemoteException e2) {
            this.a.d().f3139i.b("Error returning string value to wrapper", e2);
        }
    }

    public final void I(String str, String str2, String str3, Bundle bundle, List list, boolean z) {
        int i2;
        String str4;
        int i3;
        String str5 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            f fVar = this.a.f3258g;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                String str6 = (String) it.next();
                if (list2 == null || !list2.contains(str6)) {
                    i2 = !z ? j0(str6) : 0;
                    if (i2 == 0) {
                        i2 = i0(str6);
                    }
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    v(bundle2, i2, str6, i2 == 3 ? str6 : null);
                    bundle2.remove(str6);
                } else {
                    if (S(bundle2.get(str6))) {
                        this.a.d().f3141k.d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str5, str3, str6);
                        i3 = 22;
                        str4 = str6;
                    } else {
                        String str7 = str3;
                        str4 = str6;
                        i3 = N(str, str2, str6, bundle2.get(str6), bundle, list, z, false);
                    }
                    if (i3 != 0 && !"_ev".equals(str4)) {
                        v(bundle2, i3, str4, bundle2.get(str4));
                    } else if (V(str4) && !e0(str4, l5.f3240d) && (i4 = i4 + 1) > 0) {
                        this.a.d().f3138h.c("Item cannot contain custom parameters", this.a.f3264m.d(str5), this.a.f3264m.b(bundle2));
                        b0(bundle2, 23);
                    }
                    bundle2.remove(str4);
                }
            }
        }
    }

    public final boolean J(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Objects.requireNonNull(str, "null reference");
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (this.a.h()) {
                this.a.d().f3138h.b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", f3.t(str));
            }
            return false;
        } else if (!TextUtils.isEmpty(str2)) {
            Objects.requireNonNull(str2, "null reference");
            if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            this.a.d().f3138h.b("Invalid admob_app_id. Analytics disabled.", f3.t(str2));
            return false;
        } else {
            if (this.a.h()) {
                this.a.d().f3138h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    public final boolean K(String str, int i2, String str2) {
        if (str2 == null) {
            this.a.d().f3138h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        } else {
            this.a.d().f3138h.d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        }
    }

    public final boolean L(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.a.d().f3138h.b("Name is required and can't be null. Type", str);
            return false;
        }
        String[] strArr3 = f3314g;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(strArr3[i2])) {
                this.a.d().f3138h.c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !e0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && e0(str2, strArr2)) {
            return true;
        }
        this.a.d().f3138h.c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean M(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i2) {
                this.a.d().f3141k.d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int N(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List r20, boolean r21, boolean r22) {
        /*
            r14 = this;
            r7 = r14
            r8 = r17
            r0 = r18
            r1 = r19
            r14.h()
            boolean r2 = r14.S(r0)
            r3 = 0
            java.lang.String r4 = "param"
            if (r2 == 0) goto L_0x00a9
            if (r22 == 0) goto L_0x00a6
            java.lang.String[] r2 = g.e.a.b.f.b.l5.c
            boolean r2 = e0(r8, r2)
            if (r2 != 0) goto L_0x0020
            r0 = 20
            return r0
        L_0x0020:
            g.e.a.b.f.b.n4 r2 = r7.a
            g.e.a.b.f.b.f8 r2 = r2.y()
            r2.h()
            r2.i()
            boolean r5 = r2.p()
            if (r5 != 0) goto L_0x0033
            goto L_0x0045
        L_0x0033:
            g.e.a.b.f.b.n4 r2 = r2.a
            g.e.a.b.f.b.q9 r2 = r2.A()
            int r2 = r2.l0()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r5) goto L_0x0045
            r0 = 25
            return r0
        L_0x0045:
            g.e.a.b.f.b.n4 r2 = r7.a
            g.e.a.b.f.b.f r2 = r2.f3258g
            boolean r2 = r0 instanceof android.os.Parcelable[]
            if (r2 == 0) goto L_0x0052
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r5 = r5.length
            goto L_0x005d
        L_0x0052:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x00a9
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
        L_0x005d:
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 <= r6) goto L_0x00a9
            g.e.a.b.f.b.n4 r9 = r7.a
            g.e.a.b.f.b.f3 r9 = r9.d()
            g.e.a.b.f.b.d3 r9 = r9.f3141k
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "Parameter array is too long; discarded. Value kind, name, array length"
            r9.d(r10, r4, r8, r5)
            g.e.a.b.f.b.n4 r5 = r7.a
            g.e.a.b.f.b.f r5 = r5.f3258g
            if (r2 == 0) goto L_0x0088
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r5 = r2.length
            if (r5 <= r6) goto L_0x00a1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r6)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x00a1
        L_0x0088:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x00a1
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x00a1
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r3, r6)
            r5.<init>(r2)
            r1.putParcelableArrayList(r8, r5)
        L_0x00a1:
            r1 = 17
            r9 = 17
            goto L_0x00aa
        L_0x00a6:
            r0 = 21
            return r0
        L_0x00a9:
            r9 = 0
        L_0x00aa:
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f r1 = r1.f3258g
            g.e.a.b.f.b.r2 r2 = g.e.a.b.f.b.s2.S
            r10 = r15
            boolean r1 = r1.u(r15, r2)
            if (r1 == 0) goto L_0x00bd
            boolean r1 = U(r16)
            if (r1 != 0) goto L_0x00c3
        L_0x00bd:
            boolean r1 = U(r17)
            if (r1 == 0) goto L_0x00ca
        L_0x00c3:
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f r1 = r1.f3258g
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00d0
        L_0x00ca:
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f r1 = r1.f3258g
            r1 = 100
        L_0x00d0:
            boolean r1 = r14.M(r4, r8, r1, r0)
            if (r1 == 0) goto L_0x00d7
            return r9
        L_0x00d7:
            if (r22 == 0) goto L_0x0163
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00ef
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.I(r1, r2, r3, r4, r5, r6)
            goto L_0x0162
        L_0x00ef:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0122
            r11 = r0
            android.os.Parcelable[] r11 = (android.os.Parcelable[]) r11
            int r12 = r11.length
            r13 = 0
        L_0x00f8:
            if (r13 >= r12) goto L_0x0162
            r0 = r11[r13]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x010f
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.f3141k
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            goto L_0x014b
        L_0x010f:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.I(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x00f8
        L_0x0122:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0163
            r11 = r0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r12 = r11.size()
            r13 = 0
        L_0x012e:
            if (r13 >= r12) goto L_0x0162
            java.lang.Object r0 = r11.get(r13)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x014f
            g.e.a.b.f.b.n4 r1 = r7.a
            g.e.a.b.f.b.f3 r1 = r1.d()
            g.e.a.b.f.b.d3 r1 = r1.f3141k
            if (r0 == 0) goto L_0x0147
            java.lang.Class r0 = r0.getClass()
            goto L_0x0149
        L_0x0147:
            java.lang.String r0 = "null"
        L_0x0149:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
        L_0x014b:
            r1.c(r2, r0, r8)
            goto L_0x0163
        L_0x014f:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r20
            r6 = r21
            r0.I(r1, r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x012e
        L_0x0162:
            return r9
        L_0x0163:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.q9.N(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final boolean O(String str, String str2) {
        if (str2 == null) {
            this.a.d().f3138h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.a.d().f3138h.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    this.a.d().f3138h.c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.a.d().f3138h.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean P(String str, String str2) {
        if (str2 == null) {
            this.a.d().f3138h.b("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.a.d().f3138h.b("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.a.d().f3138h.c("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    this.a.d().f3138h.c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean Q(String str) {
        h();
        if (b.a(this.a.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.a.d().f3143m.b("Permission not granted", str);
        return false;
    }

    public final boolean R(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String j2 = this.a.f3258g.j("debug.firebase.analytics.app", "");
        b bVar = this.a.f3257f;
        return j2.equals(str);
    }

    public final boolean S(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean T(Context context, String str) {
        d3 d3Var;
        String str2;
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = b.a(context).a.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            e = e2;
            d3Var = this.a.d().f3136f;
            str2 = "Error obtaining certificate";
            d3Var.b(str2, e);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            d3Var = this.a.d().f3136f;
            str2 = "Package name not found";
            d3Var.b(str2, e);
            return true;
        }
    }

    public final boolean Z(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Objects.requireNonNull(str, "null reference");
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else {
            if (isEmpty) {
                return TextUtils.isEmpty(str3) || !str3.equals(str4);
            }
            if (TextUtils.isEmpty(str4)) {
                return false;
            }
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public final byte[] a0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final int c0(String str) {
        if ("_ldl".equals(str)) {
            f fVar = this.a.f3258g;
            return 2048;
        } else if ("_id".equals(str)) {
            f fVar2 = this.a.f3258g;
            return 256;
        } else if ("_lgclid".equals(str)) {
            f fVar3 = this.a.f3258g;
            return 100;
        } else {
            f fVar4 = this.a.f3258g;
            return 36;
        }
    }

    public final Object d0(int i2, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return q(obj.toString(), i2, z);
            }
            if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle q0 = q0((Bundle) parcelable);
                    if (!q0.isEmpty()) {
                        arrayList.add(q0);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public final int g0(String str, Object obj) {
        String str2;
        int i2;
        if ("_ldl".equals(str)) {
            i2 = c0(str);
            str2 = "user property referrer";
        } else {
            i2 = c0(str);
            str2 = "user property";
        }
        return M(str2, str, i2, obj) ? 0 : 7;
    }

    public final int h0(String str) {
        if (!O("event", str)) {
            return 2;
        }
        if (!L("event", k5.a, k5.b, str)) {
            return 13;
        }
        f fVar = this.a.f3258g;
        if (!K("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    public final void i() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                this.a.d().f3139i.a("Utils falling back to Random for random id");
            }
        }
        this.f3316d.set(nextLong);
    }

    public final int i0(String str) {
        if (!O("event param", str)) {
            return 3;
        }
        if (!L("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        f fVar = this.a.f3258g;
        if (!K("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final boolean j() {
        return true;
    }

    public final int j0(String str) {
        if (!P("event param", str)) {
            return 3;
        }
        if (!L("event param", (String[]) null, (String[]) null, str)) {
            return 14;
        }
        f fVar = this.a.f3258g;
        if (!K("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final int k0(String str) {
        if (!O("user property", str)) {
            return 6;
        }
        if (!L("user property", m5.a, (String[]) null, str)) {
            return 15;
        }
        f fVar = this.a.f3258g;
        if (!K("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int l0() {
        if (this.f3318f == null) {
            g.e.a.b.b.b bVar = g.e.a.b.b.b.b;
            Context context = this.a.a;
            Objects.requireNonNull(bVar);
            boolean z = c.a;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.f3318f = Integer.valueOf(i2 / 1000);
        }
        return this.f3318f.intValue();
    }

    public final long n0() {
        int i2 = (this.f3316d.get() > 0 ? 1 : (this.f3316d.get() == 0 ? 0 : -1));
        synchronized (this.f3316d) {
            if (i2 == 0) {
                long nanoTime = System.nanoTime();
                Objects.requireNonNull((g.e.a.b.b.h.c) this.a.n);
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i3 = this.f3317e + 1;
                this.f3317e = i3;
                long j2 = nextLong + ((long) i3);
                return j2;
            }
            this.f3316d.compareAndSet(-1, 1);
            long andIncrement = this.f3316d.getAndIncrement();
            return andIncrement;
        }
    }

    public final Object o(String str, Object obj) {
        int i2 = 256;
        if ("_ev".equals(str)) {
            f fVar = this.a.f3258g;
            return d0(256, obj, true, true);
        }
        if (U(str)) {
            f fVar2 = this.a.f3258g;
        } else {
            f fVar3 = this.a.f3258g;
            i2 = 100;
        }
        return d0(i2, obj, false, true);
    }

    public final long o0(long j2, long j3) {
        return ((j3 * 60000) + j2) / 86400000;
    }

    public final Object p(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int c0 = c0(str);
        return equals ? d0(c0, obj, true, false) : d0(c0, obj, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle p0(android.net.Uri r11, boolean r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0136
            boolean r1 = r11.isHierarchical()     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r2 = "dclid"
            java.lang.String r3 = "gclid"
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "utm_campaign"
            java.lang.String r1 = r11.getQueryParameter(r1)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r4 = "utm_source"
            java.lang.String r4 = r11.getQueryParameter(r4)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r5 = "utm_medium"
            java.lang.String r5 = r11.getQueryParameter(r5)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r6 = r11.getQueryParameter(r3)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            if (r12 == 0) goto L_0x0030
            java.lang.String r7 = "utm_id"
            java.lang.String r7 = r11.getQueryParameter(r7)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            java.lang.String r8 = r11.getQueryParameter(r2)     // Catch:{ UnsupportedOperationException -> 0x0128 }
            goto L_0x0038
        L_0x0030:
            r7 = r0
            goto L_0x0037
        L_0x0032:
            r1 = r0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x0037:
            r8 = r7
        L_0x0038:
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 == 0) goto L_0x0060
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 == 0) goto L_0x0060
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 == 0) goto L_0x0060
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 == 0) goto L_0x0060
            if (r12 == 0) goto L_0x005f
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L_0x0060
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            return r0
        L_0x0060:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 != 0) goto L_0x0070
            java.lang.String r9 = "campaign"
            r0.putString(r9, r1)
        L_0x0070:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x007b
            java.lang.String r1 = "source"
            r0.putString(r1, r4)
        L_0x007b:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = "medium"
            r0.putString(r1, r5)
        L_0x0086:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x008f
            r0.putString(r3, r6)
        L_0x008f:
            java.lang.String r1 = "utm_term"
            java.lang.String r1 = r11.getQueryParameter(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x00a0
            java.lang.String r3 = "term"
            r0.putString(r3, r1)
        L_0x00a0:
            java.lang.String r1 = "utm_content"
            java.lang.String r1 = r11.getQueryParameter(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x00b1
            java.lang.String r3 = "content"
            r0.putString(r3, r1)
        L_0x00b1:
            java.lang.String r1 = "aclid"
            java.lang.String r3 = r11.getQueryParameter(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00c0
            r0.putString(r1, r3)
        L_0x00c0:
            java.lang.String r1 = "cp1"
            java.lang.String r3 = r11.getQueryParameter(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00cf
            r0.putString(r1, r3)
        L_0x00cf:
            java.lang.String r1 = "anid"
            java.lang.String r3 = r11.getQueryParameter(r1)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00de
            r0.putString(r1, r3)
        L_0x00de:
            if (r12 == 0) goto L_0x0127
            boolean r12 = android.text.TextUtils.isEmpty(r7)
            if (r12 != 0) goto L_0x00eb
            java.lang.String r12 = "campaign_id"
            r0.putString(r12, r7)
        L_0x00eb:
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x00f4
            r0.putString(r2, r8)
        L_0x00f4:
            java.lang.String r12 = "utm_source_platform"
            java.lang.String r12 = r11.getQueryParameter(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x0105
            java.lang.String r1 = "source_platform"
            r0.putString(r1, r12)
        L_0x0105:
            java.lang.String r12 = "utm_creative_format"
            java.lang.String r12 = r11.getQueryParameter(r12)
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            if (r1 != 0) goto L_0x0116
            java.lang.String r1 = "creative_format"
            r0.putString(r1, r12)
        L_0x0116:
            java.lang.String r12 = "utm_marketing_tactic"
            java.lang.String r11 = r11.getQueryParameter(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L_0x0127
            java.lang.String r12 = "marketing_tactic"
            r0.putString(r12, r11)
        L_0x0127:
            return r0
        L_0x0128:
            r11 = move-exception
            g.e.a.b.f.b.n4 r12 = r10.a
            g.e.a.b.f.b.f3 r12 = r12.d()
            g.e.a.b.f.b.d3 r12 = r12.f3139i
            java.lang.String r1 = "Install referrer url isn't a hierarchical URI"
            r12.b(r1, r11)
        L_0x0136:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.q9.p0(android.net.Uri, boolean):android.os.Bundle");
    }

    public final String q(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    public final Bundle q0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object o = o(str, bundle.get(str));
                if (o == null) {
                    this.a.d().f3141k.b("Param value can't be null", this.a.f3264m.e(str));
                } else {
                    A(bundle2, str, o);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle r0(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, java.util.List r23, boolean r24) {
        /*
            r19 = this;
            r9 = r19
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.String[] r0 = g.e.a.b.f.b.k5.f3228d
            boolean r13 = e0(r10, r0)
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r11)
            g.e.a.b.f.b.n4 r0 = r9.a
            g.e.a.b.f.b.f r0 = r0.f3258g
            int r15 = r0.l()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r22.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
        L_0x002c:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r0 = r16.next()
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r12 == 0) goto L_0x0044
            boolean r0 = r12.contains(r8)
            if (r0 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = 0
            goto L_0x0052
        L_0x0044:
            if (r24 != 0) goto L_0x004b
            int r0 = r9.j0(r8)
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            if (r0 != 0) goto L_0x0052
            int r0 = r9.i0(r8)
        L_0x0052:
            if (r0 == 0) goto L_0x0062
            r1 = 3
            if (r0 != r1) goto L_0x0059
            r1 = r8
            goto L_0x005a
        L_0x0059:
            r1 = 0
        L_0x005a:
            r9.v(r14, r0, r8, r1)
            r14.remove(r8)
            goto L_0x00e4
        L_0x0062:
            java.lang.Object r4 = r11.get(r8)
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r8
            r5 = r14
            r6 = r23
            r7 = r24
            r12 = r8
            r8 = r13
            int r0 = r0.N(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L_0x0082
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.v(r14, r1, r12, r0)
            goto L_0x009e
        L_0x0082:
            if (r0 == 0) goto L_0x009e
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x009e
            r1 = 21
            if (r0 != r1) goto L_0x0092
            r8 = r10
            goto L_0x0093
        L_0x0092:
            r8 = r12
        L_0x0093:
            java.lang.Object r1 = r11.get(r12)
            r9.v(r14, r0, r8, r1)
            r14.remove(r12)
            goto L_0x00e4
        L_0x009e:
            boolean r0 = V(r12)
            if (r0 == 0) goto L_0x00e4
            int r0 = r18 + 1
            if (r0 <= r15) goto L_0x00e2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 48
            r1.<init>(r2)
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " params"
            r1.append(r2)
            g.e.a.b.f.b.n4 r2 = r9.a
            g.e.a.b.f.b.f3 r2 = r2.d()
            g.e.a.b.f.b.d3 r2 = r2.f3138h
            java.lang.String r1 = r1.toString()
            g.e.a.b.f.b.n4 r3 = r9.a
            g.e.a.b.f.b.a3 r3 = r3.f3264m
            java.lang.String r3 = r3.d(r10)
            g.e.a.b.f.b.n4 r4 = r9.a
            g.e.a.b.f.b.a3 r4 = r4.f3264m
            java.lang.String r4 = r4.b(r11)
            r2.c(r1, r3, r4)
            r1 = 5
            b0(r14, r1)
            r14.remove(r12)
        L_0x00e2:
            r18 = r0
        L_0x00e4:
            r12 = r23
            goto L_0x002c
        L_0x00e8:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: g.e.a.b.f.b.q9.r0(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom s() {
        h();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final zzau s0(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (h0(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            Bundle r0 = r0(str, str2, bundle2, Collections.singletonList("_o"), true);
            if (z) {
                r0 = q0(r0);
            }
            Objects.requireNonNull(r0, "null reference");
            return new zzau(str2, new zzas(r0), str3, j2);
        }
        this.a.d().f3136f.b("Invalid conditional property event name", this.a.f3264m.f(str2));
        throw new IllegalArgumentException();
    }

    public final void u(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            this.a.d().f3139i.b("Params already contained engagement", Long.valueOf(j3));
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void v(Bundle bundle, int i2, String str, Object obj) {
        if (b0(bundle, i2)) {
            f fVar = this.a.f3258g;
            bundle.putString("_ev", q(str, 40, true));
            if (obj == null) {
                return;
            }
            if ((obj instanceof String) || (obj instanceof CharSequence)) {
                bundle.putLong("_el", (long) obj.toString().length());
            }
        }
    }

    public final void x(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    this.a.A().A(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void y(g3 g3Var, int i2) {
        Iterator it = new TreeSet(g3Var.f3165d.keySet()).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (V(str) && (i3 = i3 + 1) > i2) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i2);
                sb.append(" params");
                this.a.d().f3138h.c(sb.toString(), this.a.f3264m.d(g3Var.a), this.a.f3264m.b(g3Var.f3165d));
                b0(g3Var.f3165d, 5);
                g3Var.f3165d.remove(str);
            }
        }
    }

    public final void z(p9 p9Var, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        b0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", (long) i3);
        }
        p9Var.a(str, "_err", bundle);
    }
}
