package g.c.a.l.o;

import g.c.b.b.f;
import i.j;
import i.m.j.a.e;
import i.m.j.a.h;
import i.o.b.p;
import i.o.c.n;
import j.a.x;
import java.io.File;

@e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$getFile$1", f = "WalleManager.kt", l = {187, 198}, m = "invokeSuspend")
public final class d extends h implements p<x, i.m.d<? super j>, Object> {
    public final /* synthetic */ long $fileSize;
    public final /* synthetic */ File $inFile;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ String $outPath;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public final /* synthetic */ h this$0;

    @e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$getFile$1$1$1$1", f = "WalleManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<x, i.m.d<? super j>, Object> {
        public final /* synthetic */ File $outFile;
        public int label;
        public final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, File file, i.m.d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
            this.$outFile = file;
        }

        public final i.m.d<j> a(Object obj, i.m.d<?> dVar) {
            return new a(this.this$0, this.$outFile, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            a aVar = new a(this.this$0, this.$outFile, (i.m.d) obj2);
            j jVar = j.a;
            aVar.l(jVar);
            return jVar;
        }

        public final Object l(Object obj) {
            if (this.label == 0) {
                f.q0(obj);
                b bVar = this.this$0.b;
                if (bVar != null) {
                    bVar.b(this.$outFile);
                    return j.a;
                }
                i.o.c.h.k("listener");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$getFile$1$1$1$2", f = "WalleManager.kt", l = {}, m = "invokeSuspend")
    public static final class b extends h implements p<x, i.m.d<? super j>, Object> {
        public final /* synthetic */ n $oldProgress;
        public final /* synthetic */ double $progress;
        public int label;
        public final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h hVar, double d2, n nVar, i.m.d<? super b> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
            this.$progress = d2;
            this.$oldProgress = nVar;
        }

        public final i.m.d<j> a(Object obj, i.m.d<?> dVar) {
            return new b(this.this$0, this.$progress, this.$oldProgress, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            b bVar = new b(this.this$0, this.$progress, this.$oldProgress, (i.m.d) obj2);
            j jVar = j.a;
            bVar.l(jVar);
            return jVar;
        }

        public final Object l(Object obj) {
            if (this.label == 0) {
                f.q0(obj);
                b bVar = this.this$0.b;
                if (bVar != null) {
                    bVar.c(this.$progress);
                    this.$oldProgress.element = (int) this.$progress;
                    return j.a;
                }
                i.o.c.h.k("listener");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(String str, long j2, File file, long j3, h hVar, i.m.d<? super d> dVar) {
        super(2, dVar);
        this.$outPath = str;
        this.$fileSize = j2;
        this.$inFile = file;
        this.$offset = j3;
        this.this$0 = hVar;
    }

    public final i.m.d<j> a(Object obj, i.m.d<?> dVar) {
        return new d(this.$outPath, this.$fileSize, this.$inFile, this.$offset, this.this$0, dVar);
    }

    public Object d(Object obj, Object obj2) {
        x xVar = (x) obj;
        return new d(this.$outPath, this.$fileSize, this.$inFile, this.$offset, this.this$0, (i.m.d) obj2).l(j.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: g.c.a.l.o.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: g.c.a.l.o.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: g.c.a.l.o.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: g.c.a.l.o.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: g.c.a.l.o.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: g.c.a.l.o.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: java.io.Closeable} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1 = j.a.h0.c;
        r1 = j.a.t1.j.b;
        r2 = new g.c.a.l.o.d.a(r15, r10, (i.m.d<? super g.c.a.l.o.d.a>) null);
        r9.L$0 = r14;
        r9.L$1 = r8;
        r9.L$2 = r6;
        r9.L$3 = r5;
        r9.L$4 = null;
        r9.L$5 = null;
        r9.L$6 = null;
        r9.L$7 = null;
        r9.L$8 = null;
        r9.L$9 = null;
        r9.L$10 = null;
        r9.label = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e4, code lost:
        if (g.c.b.b.f.x0(r1, r2, r9) != r0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e6, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e7, code lost:
        r0 = r5;
        r2 = r8;
        r10 = r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00bd A[EDGE_INSN: B:25:0x00bd->B:26:? ?: BREAK  , SYNTHETIC, Splitter:B:25:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r28) {
        /*
            r27 = this;
            r1 = r27
            i.m.i.a r0 = i.m.i.a.COROUTINE_SUSPENDED
            int r2 = r1.label
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0070
            if (r2 == r3) goto L_0x0056
            if (r2 != r4) goto L_0x004e
            long r2 = r1.J$0
            java.lang.Object r4 = r1.L$10
            java.io.FileOutputStream r4 = (java.io.FileOutputStream) r4
            java.lang.Object r5 = r1.L$9
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.Object r6 = r1.L$8
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r7 = r1.L$7
            g.c.a.l.o.c r7 = (g.c.a.l.o.c) r7
            java.lang.Object r8 = r1.L$6
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r9 = r1.L$5
            g.c.a.l.o.h r9 = (g.c.a.l.o.h) r9
            java.lang.Object r10 = r1.L$4
            java.io.Closeable r10 = (java.io.Closeable) r10
            java.lang.Object r11 = r1.L$3
            i.o.c.n r11 = (i.o.c.n) r11
            java.lang.Object r12 = r1.L$2
            i.o.c.n r12 = (i.o.c.n) r12
            java.lang.Object r13 = r1.L$1
            byte[] r13 = (byte[]) r13
            java.lang.Object r14 = r1.L$0
            java.io.File r14 = (java.io.File) r14
            g.c.b.b.f.q0(r28)     // Catch:{ all -> 0x006d }
            r15 = r9
            r9 = r1
            r24 = r14
            r14 = r10
            r10 = r24
            r25 = r13
            r13 = r11
            r11 = r12
            r12 = r25
            goto L_0x00b4
        L_0x004e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r1.L$3
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Object r2 = r1.L$2
            r6 = r2
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r2 = r1.L$1
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r3 = r1.L$0
            r10 = r3
            java.io.Closeable r10 = (java.io.Closeable) r10
            g.c.b.b.f.q0(r28)     // Catch:{ all -> 0x006d }
            goto L_0x00ea
        L_0x006d:
            r0 = move-exception
            goto L_0x00fa
        L_0x0070:
            g.c.b.b.f.q0(r28)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = r1.$outPath
            r2.<init>(r3)
            r3 = 10240(0x2800, float:1.4349E-41)
            long r4 = r1.$fileSize
            long r6 = (long) r3
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0084
            int r3 = (int) r4
        L_0x0084:
            byte[] r3 = new byte[r3]
            i.o.c.n r4 = new i.o.c.n
            r4.<init>()
            i.o.c.n r5 = new i.o.c.n
            r5.<init>()
            g.c.a.l.o.c r12 = new g.c.a.l.o.c
            java.io.File r7 = r1.$inFile
            long r8 = r1.$offset
            long r10 = r1.$fileSize
            r6 = r12
            r6.<init>(r7, r8, r10)
            long r6 = r1.$fileSize
            g.c.a.l.o.h r8 = r1.this$0
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x01b7 }
            r9.<init>(r2)     // Catch:{ all -> 0x01b7 }
            r10 = 0
            r11 = 0
            r13 = r5
            r15 = r8
            r5 = r10
            r8 = r11
            r14 = r12
            r10 = r2
            r11 = r4
            r4 = r9
            r12 = r3
            r2 = r6
            r6 = r4
            r7 = r14
            r9 = r1
        L_0x00b4:
            int r1 = r7.read(r12)     // Catch:{ all -> 0x01ab }
            r28 = r7
            r7 = -1
            if (r1 != r7) goto L_0x00fd
            j.a.h0 r1 = j.a.h0.c     // Catch:{ all -> 0x00f8 }
            j.a.f1 r1 = j.a.t1.j.b     // Catch:{ all -> 0x00f8 }
            g.c.a.l.o.d$a r2 = new g.c.a.l.o.d$a     // Catch:{ all -> 0x00f8 }
            r3 = 0
            r2.<init>(r15, r10, r3)     // Catch:{ all -> 0x00f8 }
            r9.L$0 = r14     // Catch:{ all -> 0x00f8 }
            r9.L$1 = r8     // Catch:{ all -> 0x00f8 }
            r9.L$2 = r6     // Catch:{ all -> 0x00f8 }
            r9.L$3 = r5     // Catch:{ all -> 0x00f8 }
            r9.L$4 = r3     // Catch:{ all -> 0x00f8 }
            r9.L$5 = r3     // Catch:{ all -> 0x00f8 }
            r9.L$6 = r3     // Catch:{ all -> 0x00f8 }
            r9.L$7 = r3     // Catch:{ all -> 0x00f8 }
            r9.L$8 = r3     // Catch:{ all -> 0x00f8 }
            r9.L$9 = r3     // Catch:{ all -> 0x00f8 }
            r9.L$10 = r3     // Catch:{ all -> 0x00f8 }
            r3 = 1
            r9.label = r3     // Catch:{ all -> 0x00f8 }
            java.lang.Object r1 = g.c.b.b.f.x0(r1, r2, r9)     // Catch:{ all -> 0x00f8 }
            if (r1 != r0) goto L_0x00e7
            return r0
        L_0x00e7:
            r0 = r5
            r2 = r8
            r10 = r14
        L_0x00ea:
            i.j r1 = i.j.a     // Catch:{ all -> 0x006d }
            g.c.b.b.f.s(r6, r0)     // Catch:{ all -> 0x00f3 }
            g.c.b.b.f.s(r10, r2)
            return r1
        L_0x00f3:
            r0 = move-exception
            r1 = r0
            r12 = r10
            goto L_0x01b9
        L_0x00f8:
            r0 = move-exception
            r10 = r14
        L_0x00fa:
            r14 = r10
            goto L_0x01ae
        L_0x00fd:
            r7 = 0
            r4.write(r12, r7, r1)     // Catch:{ all -> 0x01ab }
            int r7 = r11.element     // Catch:{ all -> 0x01ab }
            int r7 = r7 + r1
            r11.element = r7     // Catch:{ all -> 0x01ab }
            r16 = r9
            r1 = r10
            double r9 = (double) r7
            r7 = r11
            r17 = r12
            double r11 = (double) r2
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r11)
            double r9 = r9 / r11
            r11 = 100
            double r11 = (double) r11
            java.lang.Double.isNaN(r11)
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r9
            int r9 = r13.element     // Catch:{ all -> 0x01a6 }
            double r9 = (double) r9
            java.lang.Double.isNaN(r9)
            java.lang.Double.isNaN(r9)
            double r9 = r11 - r9
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r20 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r20 <= 0) goto L_0x0188
            j.a.h0 r9 = j.a.h0.c     // Catch:{ all -> 0x01a6 }
            j.a.f1 r10 = j.a.t1.j.b     // Catch:{ all -> 0x01a6 }
            g.c.a.l.o.d$b r9 = new g.c.a.l.o.d$b     // Catch:{ all -> 0x01a6 }
            r18 = 0
            r21 = r16
            r16 = r9
            r22 = r10
            r10 = r15
            r23 = r17
            r17 = r13
            r19 = r2
            r2 = r14
            r14 = r18
            r9.<init>(r10, r11, r13, r14)     // Catch:{ all -> 0x0186 }
            r3 = r21
            r3.L$0 = r1     // Catch:{ all -> 0x0186 }
            r9 = r23
            r3.L$1 = r9     // Catch:{ all -> 0x0186 }
            r3.L$2 = r7     // Catch:{ all -> 0x0186 }
            r10 = r17
            r3.L$3 = r10     // Catch:{ all -> 0x0186 }
            r3.L$4 = r2     // Catch:{ all -> 0x0186 }
            r3.L$5 = r15     // Catch:{ all -> 0x0186 }
            r3.L$6 = r8     // Catch:{ all -> 0x0186 }
            r12 = r28
            r3.L$7 = r12     // Catch:{ all -> 0x0186 }
            r3.L$8 = r6     // Catch:{ all -> 0x0186 }
            r3.L$9 = r5     // Catch:{ all -> 0x0186 }
            r3.L$10 = r4     // Catch:{ all -> 0x0186 }
            r13 = r19
            r3.J$0 = r13     // Catch:{ all -> 0x0186 }
            r11 = 2
            r3.label = r11     // Catch:{ all -> 0x0186 }
            r11 = r22
            r24 = r16
            r16 = r1
            r1 = r24
            java.lang.Object r1 = g.c.b.b.f.x0(r11, r1, r3)     // Catch:{ all -> 0x0186 }
            if (r1 != r0) goto L_0x0198
            return r0
        L_0x0186:
            r0 = move-exception
            goto L_0x01a8
        L_0x0188:
            r12 = r28
            r10 = r13
            r9 = r17
            r24 = r16
            r16 = r1
            r25 = r2
            r2 = r14
            r13 = r25
            r3 = r24
        L_0x0198:
            r11 = r7
            r7 = r12
            r12 = r9
            r9 = r3
            r24 = r13
            r14 = r2
            r13 = r10
            r2 = r24
            r10 = r16
            goto L_0x00b4
        L_0x01a6:
            r0 = move-exception
            r2 = r14
        L_0x01a8:
            r1 = r0
            r12 = r2
            goto L_0x01b0
        L_0x01ab:
            r0 = move-exception
            r2 = r14
            r14 = r2
        L_0x01ae:
            r1 = r0
            r12 = r14
        L_0x01b0:
            throw r1     // Catch:{ all -> 0x01b1 }
        L_0x01b1:
            r0 = move-exception
            r2 = r0
            g.c.b.b.f.s(r6, r1)     // Catch:{ all -> 0x01b7 }
            throw r2     // Catch:{ all -> 0x01b7 }
        L_0x01b7:
            r0 = move-exception
            r1 = r0
        L_0x01b9:
            throw r1     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            r2 = r0
            g.c.b.b.f.s(r12, r1)
            goto L_0x01c1
        L_0x01c0:
            throw r2
        L_0x01c1:
            goto L_0x01c0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.l.o.d.l(java.lang.Object):java.lang.Object");
    }
}
