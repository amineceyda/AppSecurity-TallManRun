package e.m.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f1530f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static a f1531g;
    public final Context a;
    public final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap<>();
    public final HashMap<String, ArrayList<c>> c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f1532d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final Handler f1533e;

    /* renamed from: e.m.a.a$a  reason: collision with other inner class name */
    public class C0051a extends Handler {
        public C0051a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r3 >= r1) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r4 = r2[r3];
            r5 = r4.b.size();
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
            if (r6 >= r5) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r7 = r4.b.get(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            if (r7.f1534d != false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
            r7.b.onReceive(r11.a, r4.a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r11) {
            /*
                r10 = this;
                int r0 = r11.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r11)
                goto L_0x0017
            L_0x0009:
                e.m.a.a r11 = e.m.a.a.this
            L_0x000b:
                java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<e.m.a.a$c>> r0 = r11.b
                monitor-enter(r0)
                java.util.ArrayList<e.m.a.a$b> r1 = r11.f1532d     // Catch:{ all -> 0x004f }
                int r1 = r1.size()     // Catch:{ all -> 0x004f }
                if (r1 > 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
            L_0x0017:
                return
            L_0x0018:
                e.m.a.a$b[] r2 = new e.m.a.a.b[r1]     // Catch:{ all -> 0x004f }
                java.util.ArrayList<e.m.a.a$b> r3 = r11.f1532d     // Catch:{ all -> 0x004f }
                r3.toArray(r2)     // Catch:{ all -> 0x004f }
                java.util.ArrayList<e.m.a.a$b> r3 = r11.f1532d     // Catch:{ all -> 0x004f }
                r3.clear()     // Catch:{ all -> 0x004f }
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                r0 = 0
                r3 = 0
            L_0x0027:
                if (r3 >= r1) goto L_0x000b
                r4 = r2[r3]
                java.util.ArrayList<e.m.a.a$c> r5 = r4.b
                int r5 = r5.size()
                r6 = 0
            L_0x0032:
                if (r6 >= r5) goto L_0x004c
                java.util.ArrayList<e.m.a.a$c> r7 = r4.b
                java.lang.Object r7 = r7.get(r6)
                e.m.a.a$c r7 = (e.m.a.a.c) r7
                boolean r8 = r7.f1534d
                if (r8 != 0) goto L_0x0049
                android.content.BroadcastReceiver r7 = r7.b
                android.content.Context r8 = r11.a
                android.content.Intent r9 = r4.a
                r7.onReceive(r8, r9)
            L_0x0049:
                int r6 = r6 + 1
                goto L_0x0032
            L_0x004c:
                int r3 = r3 + 1
                goto L_0x0027
            L_0x004f:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                goto L_0x0053
            L_0x0052:
                throw r11
            L_0x0053:
                goto L_0x0052
            */
            throw new UnsupportedOperationException("Method not decompiled: e.m.a.a.C0051a.handleMessage(android.os.Message):void");
        }
    }

    public static final class b {
        public final Intent a;
        public final ArrayList<c> b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    public static final class c {
        public final IntentFilter a;
        public final BroadcastReceiver b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1534d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.f1534d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public a(Context context) {
        this.a = context;
        this.f1533e = new C0051a(context.getMainLooper());
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f1530f) {
            if (f1531g == null) {
                f1531g = new a(context.getApplicationContext());
            }
            aVar = f1531g;
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0172, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0175, code lost:
        return r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<e.m.a.a$c>> r2 = r1.b
            monitor-enter(r2)
            java.lang.String r10 = r22.getAction()     // Catch:{ all -> 0x0176 }
            android.content.Context r3 = r1.a     // Catch:{ all -> 0x0176 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0176 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x0176 }
            android.net.Uri r12 = r22.getData()     // Catch:{ all -> 0x0176 }
            java.lang.String r13 = r22.getScheme()     // Catch:{ all -> 0x0176 }
            java.util.Set r14 = r22.getCategories()     // Catch:{ all -> 0x0176 }
            int r3 = r22.getFlags()     // Catch:{ all -> 0x0176 }
            r3 = r3 & 8
            if (r3 == 0) goto L_0x002c
            r16 = 1
            goto L_0x002e
        L_0x002c:
            r16 = 0
        L_0x002e:
            if (r16 == 0) goto L_0x0056
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r4.<init>()     // Catch:{ all -> 0x0176 }
            java.lang.String r5 = "Resolving type "
            r4.append(r5)     // Catch:{ all -> 0x0176 }
            r4.append(r11)     // Catch:{ all -> 0x0176 }
            java.lang.String r5 = " scheme "
            r4.append(r5)     // Catch:{ all -> 0x0176 }
            r4.append(r13)     // Catch:{ all -> 0x0176 }
            java.lang.String r5 = " of intent "
            r4.append(r5)     // Catch:{ all -> 0x0176 }
            r4.append(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0176 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0176 }
        L_0x0056:
            java.util.HashMap<java.lang.String, java.util.ArrayList<e.m.a.a$c>> r3 = r1.c     // Catch:{ all -> 0x0176 }
            java.lang.String r4 = r22.getAction()     // Catch:{ all -> 0x0176 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0176 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0176 }
            if (r8 == 0) goto L_0x0173
            if (r16 == 0) goto L_0x007d
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r4.<init>()     // Catch:{ all -> 0x0176 }
            java.lang.String r5 = "Action list: "
            r4.append(r5)     // Catch:{ all -> 0x0176 }
            r4.append(r8)     // Catch:{ all -> 0x0176 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0176 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0176 }
        L_0x007d:
            r3 = 0
            r7 = r3
            r6 = 0
        L_0x0080:
            int r3 = r8.size()     // Catch:{ all -> 0x0176 }
            if (r6 >= r3) goto L_0x0143
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x0176 }
            r5 = r3
            e.m.a.a$c r5 = (e.m.a.a.c) r5     // Catch:{ all -> 0x0176 }
            if (r16 == 0) goto L_0x00a7
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r4.<init>()     // Catch:{ all -> 0x0176 }
            java.lang.String r9 = "Matching against filter "
            r4.append(r9)     // Catch:{ all -> 0x0176 }
            android.content.IntentFilter r9 = r5.a     // Catch:{ all -> 0x0176 }
            r4.append(r9)     // Catch:{ all -> 0x0176 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0176 }
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0176 }
        L_0x00a7:
            boolean r3 = r5.c     // Catch:{ all -> 0x0176 }
            if (r3 == 0) goto L_0x00c0
            if (r16 == 0) goto L_0x00b4
            java.lang.String r3 = "LocalBroadcastManager"
            java.lang.String r4 = "  Filter's target already added"
            android.util.Log.v(r3, r4)     // Catch:{ all -> 0x0176 }
        L_0x00b4:
            r17 = r6
            r19 = r8
            r18 = r10
            r20 = r11
            r11 = 0
            r10 = r7
            goto L_0x0138
        L_0x00c0:
            android.content.IntentFilter r3 = r5.a     // Catch:{ all -> 0x0176 }
            java.lang.String r9 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r17 = r6
            r6 = r13
            r18 = r10
            r10 = r7
            r7 = r12
            r19 = r8
            r8 = r14
            r20 = r11
            r11 = 0
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0176 }
            if (r3 < 0) goto L_0x0106
            if (r16 == 0) goto L_0x00f6
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r5.<init>()     // Catch:{ all -> 0x0176 }
            java.lang.String r6 = "  Filter matched!  match=0x"
            r5.append(r6)     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x0176 }
            r5.append(r3)     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0176 }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x0176 }
        L_0x00f6:
            if (r10 != 0) goto L_0x00fe
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0176 }
            r7.<init>()     // Catch:{ all -> 0x0176 }
            goto L_0x00ff
        L_0x00fe:
            r7 = r10
        L_0x00ff:
            r7.add(r15)     // Catch:{ all -> 0x0176 }
            r3 = 1
            r15.c = r3     // Catch:{ all -> 0x0176 }
            goto L_0x0139
        L_0x0106:
            if (r16 == 0) goto L_0x0138
            r4 = -4
            if (r3 == r4) goto L_0x0120
            r4 = -3
            if (r3 == r4) goto L_0x011d
            r4 = -2
            if (r3 == r4) goto L_0x011a
            r4 = -1
            if (r3 == r4) goto L_0x0117
            java.lang.String r3 = "unknown reason"
            goto L_0x0122
        L_0x0117:
            java.lang.String r3 = "type"
            goto L_0x0122
        L_0x011a:
            java.lang.String r3 = "data"
            goto L_0x0122
        L_0x011d:
            java.lang.String r3 = "action"
            goto L_0x0122
        L_0x0120:
            java.lang.String r3 = "category"
        L_0x0122:
            java.lang.String r4 = "LocalBroadcastManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            r5.<init>()     // Catch:{ all -> 0x0176 }
            java.lang.String r6 = "  Filter did not match: "
            r5.append(r6)     // Catch:{ all -> 0x0176 }
            r5.append(r3)     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0176 }
            android.util.Log.v(r4, r3)     // Catch:{ all -> 0x0176 }
        L_0x0138:
            r7 = r10
        L_0x0139:
            int r6 = r17 + 1
            r10 = r18
            r8 = r19
            r11 = r20
            goto L_0x0080
        L_0x0143:
            r10 = r7
            r11 = 0
            if (r10 == 0) goto L_0x0174
            r9 = 0
        L_0x0148:
            int r3 = r10.size()     // Catch:{ all -> 0x0176 }
            if (r9 >= r3) goto L_0x0159
            java.lang.Object r3 = r10.get(r9)     // Catch:{ all -> 0x0176 }
            e.m.a.a$c r3 = (e.m.a.a.c) r3     // Catch:{ all -> 0x0176 }
            r3.c = r11     // Catch:{ all -> 0x0176 }
            int r9 = r9 + 1
            goto L_0x0148
        L_0x0159:
            java.util.ArrayList<e.m.a.a$b> r3 = r1.f1532d     // Catch:{ all -> 0x0176 }
            e.m.a.a$b r4 = new e.m.a.a$b     // Catch:{ all -> 0x0176 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x0176 }
            r3.add(r4)     // Catch:{ all -> 0x0176 }
            android.os.Handler r0 = r1.f1533e     // Catch:{ all -> 0x0176 }
            r3 = 1
            boolean r0 = r0.hasMessages(r3)     // Catch:{ all -> 0x0176 }
            if (r0 != 0) goto L_0x0171
            android.os.Handler r0 = r1.f1533e     // Catch:{ all -> 0x0176 }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x0176 }
        L_0x0171:
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            return r3
        L_0x0173:
            r11 = 0
        L_0x0174:
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            return r11
        L_0x0176:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            goto L_0x017a
        L_0x0179:
            throw r0
        L_0x017a:
            goto L_0x0179
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m.a.a.b(android.content.Intent):boolean");
    }
}
