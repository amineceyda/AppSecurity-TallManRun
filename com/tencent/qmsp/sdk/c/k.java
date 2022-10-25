package com.tencent.qmsp.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.qmsp.sdk.c.a;
import com.tencent.qmsp.sdk.c.g;
import com.tencent.qmsp.sdk.c.j;
import com.tencent.qmsp.sdk.d.d;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public class k {

    /* renamed from: i  reason: collision with root package name */
    private static final byte[][] f827i = {new byte[]{44, 116}, new byte[]{49, 105, -93, 69}, new byte[]{35, 124, -78, 71}, new byte[]{40, Byte.MAX_VALUE, -73, 69}, new byte[]{51, 117, -95}, new byte[]{20, 65, -125, 82, 33, 47, 114, -2, 49, 62, -126, 125, -96, 80}, new byte[]{20, 125, -96, 80, 29, AbstractJceStruct.STRUCT_END}};

    /* renamed from: j  reason: collision with root package name */
    private static k f828j;
    /* access modifiers changed from: private */
    public ConcurrentHashMap<Integer, f> a = new ConcurrentHashMap<>();
    private CopyOnWriteArrayList<f> b = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */
    public j c = new j();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public g f829d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Handler f830e = new g(com.tencent.qmsp.sdk.app.b.e().c());

    /* renamed from: f  reason: collision with root package name */
    private boolean f831f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f832g = false;

    /* renamed from: h  reason: collision with root package name */
    private CopyOnWriteArrayList<e> f833h = new CopyOnWriteArrayList<>();

    public class a implements g.c {
        public a() {
        }

        public void a(List<Pair<Integer, Integer>> list) {
            Message obtainMessage = k.this.f830e.obtainMessage(2);
            obtainMessage.obj = list;
            k.this.f830e.sendMessage(obtainMessage);
        }
    }

    public final class b implements a.C0012a {
        public f a;

        public b(k kVar) {
        }

        public void a() {
            this.a.f834d = 26;
        }

        public void run() {
            int i2;
            f fVar;
            String str = this.a.f838h;
            if (str == null || str.contains("..")) {
                fVar = this.a;
                i2 = 15;
            } else {
                File file = new File(this.a.f838h);
                if (!file.exists()) {
                    fVar = this.a;
                    i2 = 12;
                } else {
                    this.a.f839i = new o();
                    int i3 = this.a.b;
                    if (!(i3 == 2 || i3 == 1) || com.tencent.qmsp.sdk.d.e.b(file, (String) null)) {
                        Object[] objArr = new Object[1];
                        f fVar2 = this.a;
                        fVar2.f834d = f.a(2, (long) fVar2.b, (long) fVar2.a, 0, fVar2.f838h, (Object) null, (Object[]) null, objArr);
                        if (objArr[0] != null && (objArr[0] instanceof Integer)) {
                            this.a.f836f = ((Integer) objArr[0]).intValue();
                            return;
                        }
                        return;
                    }
                    this.a.f834d = 10;
                    return;
                }
            }
            fVar.f834d = i2;
        }
    }

    public class c extends i {
        public c() {
            super(k.this, (a) null);
        }

        public void a() {
            if (this.a) {
                k.this.c.a();
            }
        }

        public void a(String str, String str2, int i2, int i3, int i4, int i5) {
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("visitQSecSFUItem libPath = %s libVer = %s libId = %d", new Object[]{str, str2, Integer.valueOf(i2)}));
            if (!TextUtils.isEmpty(str2)) {
                if (i5 == 1 || i5 == 2) {
                    j.a a = k.this.c.a(i2);
                    if (a != null) {
                        k.this.c.a(a.a, false);
                    } else {
                        a = new j.a();
                    }
                    a.a = i2;
                    a.b = i3;
                    a.c = i4;
                    a.f826e = str;
                    a.f825d = str2;
                    k.this.c.a(a, false);
                    this.a = true;
                    com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("visitQSecSFUItem libId = %d", new Object[]{Integer.valueOf(i2)}));
                    if (i5 == 1 && k.this.f829d.a(i2) == 1) {
                        f fVar = (f) k.this.a.get(Integer.valueOf(i2));
                        if (fVar != null) {
                            k.this.a(fVar, str2, str);
                            if (fVar.f834d != 0) {
                                k.this.a.remove(Integer.valueOf(fVar.a));
                                return;
                            }
                            return;
                        }
                        k.this.c(k.this.a(a));
                        return;
                    }
                    return;
                }
                com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Invalid mode: %d", new Object[]{Integer.valueOf(i5)}));
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        public void run() {
            k.this.i();
        }
    }

    public interface e {
        void a(int i2, int i3);
    }

    public static class f {
        public int a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public int f834d;

        /* renamed from: e  reason: collision with root package name */
        public int f835e;

        /* renamed from: f  reason: collision with root package name */
        public int f836f;

        /* renamed from: g  reason: collision with root package name */
        public String f837g;

        /* renamed from: h  reason: collision with root package name */
        public String f838h;

        /* renamed from: i  reason: collision with root package name */
        public o f839i;

        private f() {
            this.f834d = -1;
            this.f837g = "";
            this.f838h = "";
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public class g extends Handler {
        public g(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Object obj;
            int i2 = message.what;
            if (i2 == 1) {
                k.this.g();
            } else if (i2 == 2) {
                Object obj2 = message.obj;
                if (obj2 != null) {
                    k.this.b((List<Pair<Integer, Integer>>) (List) obj2);
                }
            } else if (i2 == 3) {
                k.this.h();
            } else if (i2 == 4) {
                k.this.i();
            } else if (i2 == 5 && (obj = message.obj) != null) {
                k.this.c((e) obj);
            }
        }
    }

    public static class h {
        private i a;

        public h(i iVar) {
            this.a = iVar;
        }

        public void a(int i2) {
            i iVar;
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("QSecSFUReader read, bid = %d ", new Object[]{Integer.valueOf(i2)}));
            try {
                List<d.b> a2 = new com.tencent.qmsp.sdk.d.b().a(1);
                if (a2 != null) {
                    com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("QSecSFUReader read updateSections count = %d ", new Object[]{Integer.valueOf(a2.size())}));
                    for (d.b next : a2) {
                        if (next.b == ((long) i2)) {
                            List<d.a> list = next.o;
                            if (list != null) {
                                for (d.a next2 : list) {
                                    if (!TextUtils.isEmpty(next2.f864i)) {
                                        String str = next2.f861f;
                                        if (!TextUtils.isEmpty(next2.f862g)) {
                                            str = next2.f862g;
                                        }
                                        if (str != null) {
                                            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("ExtraInfo: %s path: %s", new Object[]{next2.f864i, str}));
                                            JSONObject jSONObject = new JSONObject(next2.f864i);
                                            int i3 = jSONObject.getInt(k.b(0));
                                            int i4 = jSONObject.getInt(k.b(1));
                                            int i5 = jSONObject.getInt(k.b(2));
                                            int i6 = jSONObject.getInt(k.b(3));
                                            String string = jSONObject.getString(k.b(4));
                                            i iVar2 = this.a;
                                            if (iVar2 != null) {
                                                iVar2.a(str, string, i3, i4, i5, i6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                iVar = this.a;
                if (iVar == null) {
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                iVar = this.a;
                if (iVar == null) {
                    return;
                }
            } catch (Throwable th) {
                i iVar3 = this.a;
                if (iVar3 != null) {
                    iVar3.a();
                }
                throw th;
            }
            iVar.a();
        }
    }

    public class i {
        public boolean a;

        private i() {
            this.a = false;
        }

        public /* synthetic */ i(k kVar, a aVar) {
            this();
        }

        public void a() {
            if (this.a) {
                k.this.c.a();
            }
        }

        public void a(String str, String str2, int i2, int i3, int i4, int i5) {
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("visitQSecSFUItem libPath = %s libVer = %s libId = %d", new Object[]{str, str2, Integer.valueOf(i2)}));
            if (!TextUtils.isEmpty(str2)) {
                j.a a2 = k.this.c.a(i2);
                if (a2 == null || !str.equals(a2.f826e) || !str2.equals(a2.f825d) || i3 != a2.b || i4 != a2.c) {
                    if (a2 == null) {
                        a2 = new j.a();
                    } else {
                        k.this.c.a(i2, false);
                        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Database info mismatch for lib: %d", new Object[]{Integer.valueOf(i2)}));
                    }
                    a2.a = i2;
                    a2.b = i3;
                    a2.c = i4;
                    a2.f826e = str;
                    a2.f825d = str2;
                    com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Add lost lib: %d,%d,%d,%s", new Object[]{Integer.valueOf(i2), Integer.valueOf(a2.b), Integer.valueOf(a2.c), a2.f826e}));
                    k.this.c.a(a2, false);
                    this.a = true;
                }
            }
        }
    }

    private k() {
    }

    /* access modifiers changed from: private */
    public f a(j.a aVar) {
        f fVar = new f((a) null);
        fVar.a = aVar.a;
        fVar.b = aVar.b;
        fVar.c = aVar.c;
        fVar.f838h = aVar.f826e;
        fVar.f837g = aVar.f825d;
        fVar.f835e = 4;
        return fVar;
    }

    private void a(int i2, int i3) {
        Iterator<e> it = this.f833h.iterator();
        while (it.hasNext()) {
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Notify listener [%d:%d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
            it.next().a(i2, i3);
        }
    }

    private void a(f fVar) {
        this.b.add(fVar);
    }

    /* access modifiers changed from: private */
    public void a(f fVar, String str, String str2) {
        e(fVar);
        if (fVar.f835e == 4) {
            String str3 = fVar.f838h;
            if (str3 != null && !str3.equals(str2)) {
                com.tencent.qmsp.sdk.f.d.a(fVar.f838h, false);
                fVar.f838h = str2;
            }
            String str4 = fVar.f837g;
            if (str4 != null && !str4.equals(str)) {
                fVar.f837g = str;
            }
            fVar.f836f = 0;
            d(fVar);
            a(fVar);
        }
    }

    private void a(List<j.a> list) {
        for (j.a next : list) {
            this.c.a(next.a, false);
            String str = next.f826e;
            if (str != null) {
                com.tencent.qmsp.sdk.f.d.a(str, false);
            }
        }
        this.c.a();
    }

    /* access modifiers changed from: private */
    public static String b(int i2) {
        return com.tencent.qmsp.sdk.f.h.a(f827i[i2]);
    }

    private void b(f fVar) {
        try {
            com.tencent.qmsp.sdk.a.g gVar = new com.tencent.qmsp.sdk.a.g();
            gVar.a(fVar.a).a(fVar.f837g).a(fVar.f834d);
            com.tencent.qmsp.sdk.a.f.a(gVar.toString(), 3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public void b(List<Pair<Integer, Integer>> list) {
        if (list != null && this.f831f) {
            LinkedList linkedList = new LinkedList();
            for (Pair next : list) {
                com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("cb changed: id(%d), cb(%d)", new Object[]{next.first, next.second}));
                f fVar = this.a.get(next.first);
                if (fVar == null) {
                    j.a a2 = this.c.a(((Integer) next.first).intValue());
                    if (a2 != null) {
                        if (((Integer) next.second).intValue() == 1) {
                            c(a(a2));
                        } else if (((Integer) next.second).intValue() == 2) {
                            linkedList.add(a2);
                        }
                    }
                } else if (((Integer) next.second).intValue() == 1) {
                    if (fVar.f835e == 4) {
                        d(fVar);
                        if (fVar.f834d != 0) {
                            this.a.remove(Integer.valueOf(fVar.a));
                        }
                        a(fVar);
                    }
                } else if (((Integer) next.second).intValue() == 2 && fVar.f835e == 4) {
                    this.a.remove(next.first);
                    j.a a3 = this.c.a(((Integer) next.first).intValue());
                    if (a3 != null) {
                        linkedList.add(a3);
                    }
                }
            }
            if (!linkedList.isEmpty()) {
                a((List<j.a>) linkedList);
            }
        }
    }

    /* access modifiers changed from: private */
    public void c(e eVar) {
        for (Map.Entry next : this.a.entrySet()) {
            if (((f) next.getValue()).f835e == 1) {
                com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Notify listener [%d:%d]", new Object[]{1, next.getKey()}));
                eVar.a(1, ((Integer) next.getKey()).intValue());
            }
        }
    }

    /* access modifiers changed from: private */
    public void c(f fVar) {
        d(fVar);
        if (fVar.f834d == 0) {
            this.a.put(Integer.valueOf(fVar.a), fVar);
            a(1, fVar.a);
        }
        a(fVar);
    }

    private void d() {
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, "addLostUpgradeLibs");
        new h(new i(this, (a) null)).a(1);
    }

    private void d(f fVar) {
        fVar.f835e = 2;
        b bVar = new b(this);
        bVar.a = fVar;
        int i2 = 1;
        new a(String.format("Lib%d_%s", new Object[]{Integer.valueOf(fVar.a), fVar.f837g}), 43200000).a((a.C0012a) bVar);
        Object[] objArr = new Object[3];
        String str = fVar.f838h;
        if (str == null) {
            str = "null";
        }
        objArr[0] = str;
        objArr[1] = com.tencent.qmsp.sdk.a.c.a(fVar.f836f);
        objArr[2] = Integer.valueOf(fVar.f834d);
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("load: %s ver: %s error: %08X", objArr));
        if (fVar.f834d != 0) {
            i2 = 4;
        }
        fVar.f835e = i2;
    }

    public static k e() {
        if (f828j == null) {
            synchronized (k.class) {
                if (f828j == null) {
                    f828j = new k();
                }
            }
        }
        return f828j;
    }

    private void e(f fVar) {
        f fVar2 = fVar;
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Prepare to unload: %d,%d,%d,%d,%s,%s", new Object[]{Integer.valueOf(fVar2.a), Integer.valueOf(fVar2.b), Integer.valueOf(fVar2.c), Integer.valueOf(fVar2.f835e), fVar2.f837g, fVar2.f838h}));
        if ((fVar2.c & 1) != 0) {
            if (fVar2.f835e == 1) {
                fVar2.f835e = 3;
                fVar2.f839i.c();
                int a2 = f.a(3, (long) fVar2.a, 0, 0, (Object) null, (Object) null, (Object[]) null, (Object[]) null);
                com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Unload ret: %d", new Object[]{Integer.valueOf(a2)}));
                if (a2 == 0) {
                    fVar2.f835e = 4;
                    a(2, fVar2.a);
                    return;
                }
                fVar2.f835e = 5;
                fVar2.f834d = a2;
                return;
            }
        }
    }

    private void f() {
        List<j.a> b2 = this.c.b();
        if (b2 != null && !b2.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            for (j.a next : b2) {
                int a2 = this.f829d.a(next.a);
                Object[] objArr = new Object[6];
                objArr[0] = Integer.valueOf(next.a);
                objArr[1] = Integer.valueOf(next.b);
                objArr[2] = Integer.valueOf(next.c);
                objArr[3] = next.f825d;
                String str = next.f826e;
                if (str == null) {
                    str = "null";
                }
                objArr[4] = str;
                objArr[5] = Integer.valueOf(a2);
                com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("%d,%d,%d,%s,%s,%d", objArr));
                if (!(a2 == 0 || -1 == a2)) {
                    if (2 == a2) {
                        linkedList.add(next);
                    } else if (1 == a2) {
                        f a3 = a(next);
                        c(a3);
                        a(a3);
                    }
                    if (!linkedList.isEmpty()) {
                        a((List<j.a>) linkedList);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void g() {
        if (!this.f831f) {
            this.f832g = true;
            return;
        }
        this.f832g = false;
        new h(new c()).a(1);
    }

    /* access modifiers changed from: private */
    public void h() {
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, "onLoadLocalLibs");
        if (!this.f831f) {
            this.f831f = true;
            d();
            f();
            if (this.f832g) {
                b();
            }
            j();
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        long j2;
        long j3;
        Context context = com.tencent.qmsp.sdk.app.a.getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences(b.a + b(6), 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            Iterator<f> it = this.b.iterator();
            j2 = 28800000;
            while (it.hasNext()) {
                try {
                    f next = it.next();
                    String str = next.f837g;
                    int i2 = next.f836f;
                    if (i2 != 0) {
                        str = com.tencent.qmsp.sdk.a.c.a(i2);
                    }
                    String format = String.format("Lib%d_%s_%s", new Object[]{Integer.valueOf(next.a), com.tencent.qmsp.sdk.app.a.getUid(), str});
                    String format2 = String.format("Lib%d_%s_%s_lpt", new Object[]{Integer.valueOf(next.a), com.tencent.qmsp.sdk.app.a.getUid(), str});
                    int i3 = sharedPreferences.getInt(format, -1);
                    String str2 = format;
                    long currentTimeMillis = System.currentTimeMillis() - sharedPreferences.getLong(format2, 0);
                    if (currentTimeMillis >= 28800000 || next.f834d != i3) {
                        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Rp: %d,%d,%s", new Object[]{Integer.valueOf(next.a), Integer.valueOf(next.f834d), str}));
                        edit.putInt(str2, next.f834d);
                        edit.putLong(format2, System.currentTimeMillis());
                        b(next);
                        this.b.remove(next);
                    } else {
                        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("Ignore rp for: %d,%08X,%s", new Object[]{Integer.valueOf(next.a), Integer.valueOf(next.f834d), str}));
                        long j4 = 28800000 - currentTimeMillis;
                        if (j2 > j4) {
                            j2 = j4;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    j3 = j2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            j3 = 28800000;
            e.printStackTrace();
            j2 = j3;
            edit.commit();
            com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, "next rp interval: " + j2);
            f.i().c().postDelayed(new d(), j2);
        }
        edit.commit();
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, "next rp interval: " + j2);
        f.i().c().postDelayed(new d(), j2);
    }

    private void j() {
        Handler handler = this.f830e;
        handler.sendMessage(handler.obtainMessage(4));
    }

    public int a(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        int i5;
        int i6 = i2;
        int i7 = i3;
        f fVar = this.a.get(Integer.valueOf(i2));
        if (fVar == null) {
            if (this.c.a(i6) == null) {
                int i8 = i4;
                i5 = 4;
            } else {
                int i9 = i4;
                i5 = 17;
            }
        } else if (i7 != 0 && i7 != fVar.f836f) {
            int i10 = i4;
            i5 = 32;
        } else if (fVar.a != i6) {
            int i11 = i4;
            i5 = 5;
        } else {
            int a2 = this.f829d.a(i6);
            if (1 != a2 && a2 != -1) {
                int i12 = i4;
                i5 = 6;
            } else if (fVar.f835e == 1 && fVar.f839i.a()) {
                i5 = f.a(4, (long) fVar.a, (long) i7, (long) i4, (Object) null, (Object) null, objArr, objArr2);
                fVar.f839i.b();
            } else {
                int i13 = i4;
                i5 = 7;
            }
        }
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("dispatch to id: %d, cmd: %d, err: %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i5)}));
        return i5;
    }

    public void a() {
        try {
            ConcurrentHashMap<Integer, f> concurrentHashMap = this.a;
            if (concurrentHashMap != null) {
                for (Map.Entry next : concurrentHashMap.entrySet()) {
                    ((f) next.getValue()).c = 1;
                    e((f) next.getValue());
                }
            }
            if (f828j != null) {
                f828j = null;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(g gVar) {
        this.f829d = gVar;
        gVar.a((g.c) new a());
    }

    public void a(e eVar) {
        this.f833h.add(eVar);
        Handler handler = this.f830e;
        handler.sendMessage(handler.obtainMessage(5, eVar));
    }

    public void b() {
        Handler handler = this.f830e;
        handler.sendMessage(handler.obtainMessage(1));
    }

    public void b(e eVar) {
        this.f833h.remove(eVar);
    }

    public void c() {
        com.tencent.qmsp.sdk.f.g.a("Qp.QLM", 1, String.format("OnEveryLogin mHasLoadLocal = %b", new Object[]{Boolean.valueOf(this.f831f)}));
        if (!this.f831f) {
            Handler handler = this.f830e;
            handler.sendMessage(handler.obtainMessage(3));
        }
    }
}
