package com.tencent.qmsp.sdk.c;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.beacon.pack.AbstractJceStruct;
import com.tencent.qmsp.sdk.f.h;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f801d = {6, 98, -78, 83, 38, AbstractJceStruct.STRUCT_END, 101, -14, 22, 96};
    private String a;
    private long b;
    private boolean c;

    /* renamed from: com.tencent.qmsp.sdk.c.a$a  reason: collision with other inner class name */
    public interface C0012a {
        void a();

        void run();
    }

    public a(String str, long j2) {
        this.a = str;
        this.b = j2;
    }

    private boolean a() {
        Context context = com.tencent.qmsp.sdk.app.a.getContext();
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(b.a + a(f801d), 0);
        this.c = true;
        try {
            long j2 = sharedPreferences.getLong(this.a, 0);
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - j2;
            if (j2 == 0 || j3 >= this.b || j3 <= 0) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(this.a, currentTimeMillis);
                edit.commit();
                return false;
            }
            try {
                this.c = false;
                return true;
            } catch (Exception e2) {
                e = e2;
                z = true;
                e.printStackTrace();
                return z;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private void b() {
        if (this.c) {
            Context context = com.tencent.qmsp.sdk.app.a.getContext();
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences(b.a + a(f801d), 0).edit();
                edit.remove(this.a);
                edit.commit();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public String a(byte[] bArr) {
        return h.a(bArr);
    }

    public void a(C0012a aVar) {
        if (aVar != null) {
            if (!a()) {
                aVar.run();
            } else {
                aVar.a();
            }
            b();
        }
    }
}
