package g.c.a.l.o;

import g.c.b.b.f;
import i.j;
import i.m.d;
import i.m.j.a.e;
import i.m.j.a.h;
import i.o.b.p;
import j.a.x;
import java.io.File;

@e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$hasValue$1", f = "WalleManager.kt", l = {120, 124}, m = "invokeSuspend")
public final class g extends h implements p<x, d<? super j>, Object> {
    public final /* synthetic */ long $fileSize;
    public final /* synthetic */ File $inFile;
    public final /* synthetic */ String $outPath;
    public final /* synthetic */ long $position;
    public final /* synthetic */ k $walleType;
    public int label;
    public final /* synthetic */ h this$0;

    @e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$hasValue$1$1", f = "WalleManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<x, d<? super j>, Object> {
        public int label;
        public final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
        }

        public final d<j> a(Object obj, d<?> dVar) {
            return new a(this.this$0, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            a aVar = new a(this.this$0, (d) obj2);
            j jVar = j.a;
            aVar.l(jVar);
            return jVar;
        }

        public final Object l(Object obj) {
            if (this.label == 0) {
                f.q0(obj);
                b bVar = this.this$0.b;
                if (bVar != null) {
                    bVar.a();
                    return j.a;
                }
                i.o.c.h.k("listener");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$hasValue$1$2", f = "WalleManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends h implements p<x, d<? super j>, Object> {
        public int label;
        public final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar, d<? super b> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
        }

        public final d<j> a(Object obj, d<?> dVar) {
            return new b(this.this$0, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            b bVar = new b(this.this$0, (d) obj2);
            j jVar = j.a;
            bVar.l(jVar);
            return jVar;
        }

        public final Object l(Object obj) {
            if (this.label == 0) {
                f.q0(obj);
                b bVar = this.this$0.b;
                if (bVar != null) {
                    bVar.g();
                    return j.a;
                }
                i.o.c.h.k("listener");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(k kVar, h hVar, File file, long j2, long j3, String str, d<? super g> dVar) {
        super(2, dVar);
        this.$walleType = kVar;
        this.this$0 = hVar;
        this.$inFile = file;
        this.$position = j2;
        this.$fileSize = j3;
        this.$outPath = str;
    }

    public final d<j> a(Object obj, d<?> dVar) {
        return new g(this.$walleType, this.this$0, this.$inFile, this.$position, this.$fileSize, this.$outPath, dVar);
    }

    public Object d(Object obj, Object obj2) {
        return ((g) a((x) obj, (d) obj2)).l(j.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            i.m.i.a r1 = i.m.i.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x001f
            if (r2 == r5) goto L_0x001b
            if (r2 != r4) goto L_0x0013
            g.c.b.b.f.q0(r22)
            goto L_0x0050
        L_0x0013:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001b:
            g.c.b.b.f.q0(r22)
            goto L_0x0036
        L_0x001f:
            g.c.b.b.f.q0(r22)
            j.a.h0 r2 = j.a.h0.c
            j.a.f1 r2 = j.a.t1.j.b
            g.c.a.l.o.g$a r6 = new g.c.a.l.o.g$a
            g.c.a.l.o.h r7 = r0.this$0
            r6.<init>(r7, r3)
            r0.label = r5
            java.lang.Object r2 = g.c.b.b.f.x0(r2, r6, r0)
            if (r2 != r1) goto L_0x0036
            return r1
        L_0x0036:
            g.c.a.l.o.k r2 = g.c.a.l.o.k.HAS_ID
            g.c.a.l.o.k r6 = r0.$walleType
            if (r2 != r6) goto L_0x0050
            j.a.h0 r2 = j.a.h0.c
            j.a.f1 r2 = j.a.t1.j.b
            g.c.a.l.o.g$b r6 = new g.c.a.l.o.g$b
            g.c.a.l.o.h r7 = r0.this$0
            r6.<init>(r7, r3)
            r0.label = r4
            java.lang.Object r2 = g.c.b.b.f.x0(r2, r6, r0)
            if (r2 != r1) goto L_0x0050
            return r1
        L_0x0050:
            g.c.a.l.o.k r1 = g.c.a.l.o.k.SEEKABLE
            g.c.a.l.o.k r2 = r0.$walleType
            r3 = 0
            r6 = 3
            if (r1 != r2) goto L_0x009b
            g.c.a.l.o.h r13 = r0.this$0
            java.io.File r8 = r0.$inFile
            long r9 = r0.$position
            long r11 = r0.$fileSize
            g.c.a.l.o.h r1 = g.c.a.l.o.h.c
            java.util.Objects.requireNonNull(r13)
            org.slf4j.Logger r1 = g.c.a.l.o.h.f2080d
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r3] = r8
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r2[r5] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r11)
            r2[r4] = r7
            java.lang.String r7 = "getSeekableByteChannel ifFile:{} , offset:{} , fileSize:{} "
            r1.debug((java.lang.String) r7, (java.lang.Object[]) r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 >= r2) goto L_0x0083
            goto L_0x009b
        L_0x0083:
            j.a.x r1 = r13.a
            j.a.h0 r2 = j.a.h0.c
            j.a.v r15 = j.a.h0.b
            r16 = 0
            g.c.a.l.o.e r17 = new g.c.a.l.o.e
            r14 = 0
            r7 = r17
            r7.<init>(r8, r9, r11, r13, r14)
            r18 = 2
            r19 = 0
            r14 = r1
            g.c.b.b.f.S(r14, r15, r16, r17, r18, r19)
        L_0x009b:
            g.c.a.l.o.k r1 = g.c.a.l.o.k.STRING
            g.c.a.l.o.k r2 = r0.$walleType
            if (r1 != r2) goto L_0x00dd
            g.c.a.l.o.h r13 = r0.this$0
            java.io.File r10 = r0.$inFile
            long r11 = r0.$position
            long r8 = r0.$fileSize
            g.c.a.l.o.h r1 = g.c.a.l.o.h.c
            java.util.Objects.requireNonNull(r13)
            org.slf4j.Logger r1 = g.c.a.l.o.h.f2080d
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r3] = r10
            java.lang.Long r7 = java.lang.Long.valueOf(r11)
            r2[r5] = r7
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r2[r4] = r7
            java.lang.String r7 = "getString ifFile:{} , offset:{} , fileSize:{} "
            r1.debug((java.lang.String) r7, (java.lang.Object[]) r2)
            j.a.x r1 = r13.a
            j.a.h0 r2 = j.a.h0.c
            j.a.v r15 = j.a.h0.b
            r16 = 0
            g.c.a.l.o.f r17 = new g.c.a.l.o.f
            r14 = 0
            r7 = r17
            r7.<init>(r8, r10, r11, r13, r14)
            r18 = 2
            r19 = 0
            r14 = r1
            g.c.b.b.f.S(r14, r15, r16, r17, r18, r19)
        L_0x00dd:
            g.c.a.l.o.k r1 = g.c.a.l.o.k.FILE
            g.c.a.l.o.k r2 = r0.$walleType
            if (r1 != r2) goto L_0x0121
            g.c.a.l.o.h r14 = r0.this$0
            java.io.File r11 = r0.$inFile
            java.lang.String r8 = r0.$outPath
            long r12 = r0.$position
            long r9 = r0.$fileSize
            g.c.a.l.o.h r1 = g.c.a.l.o.h.c
            java.util.Objects.requireNonNull(r14)
            org.slf4j.Logger r1 = g.c.a.l.o.h.f2080d
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r3] = r11
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r2[r5] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2[r4] = r3
            java.lang.String r3 = "getFile ifFile:{} , offset:{} , fileSize:{} "
            r1.debug((java.lang.String) r3, (java.lang.Object[]) r2)
            j.a.x r1 = r14.a
            j.a.h0 r2 = j.a.h0.c
            j.a.v r16 = j.a.h0.b
            r17 = 0
            g.c.a.l.o.d r18 = new g.c.a.l.o.d
            r15 = 0
            r7 = r18
            r7.<init>(r8, r9, r11, r12, r14, r15)
            r19 = 2
            r20 = 0
            r15 = r1
            g.c.b.b.f.S(r15, r16, r17, r18, r19, r20)
        L_0x0121:
            i.j r1 = i.j.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.l.o.g.l(java.lang.Object):java.lang.Object");
    }
}
