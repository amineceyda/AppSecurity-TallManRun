package g.c.a.l.o;

import i.j;
import i.m.d;
import i.m.j.a.e;
import i.m.j.a.h;
import i.o.b.p;
import j.a.x;
import java.io.File;

@e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$getString$1", f = "WalleManager.kt", l = {148}, m = "invokeSuspend")
public final class f extends h implements p<x, d<? super j>, Object> {
    public final /* synthetic */ long $fileSize;
    public final /* synthetic */ File $inFile;
    public final /* synthetic */ long $offset;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ h this$0;

    @e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$getString$1$1$1", f = "WalleManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<x, d<? super j>, Object> {
        public final /* synthetic */ String $string;
        public int label;
        public final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, String str, d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
            this.$string = str;
        }

        public final d<j> a(Object obj, d<?> dVar) {
            return new a(this.this$0, this.$string, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            a aVar = new a(this.this$0, this.$string, (d) obj2);
            j jVar = j.a;
            aVar.l(jVar);
            return jVar;
        }

        public final Object l(Object obj) {
            if (this.label == 0) {
                g.c.b.b.f.q0(obj);
                b bVar = this.this$0.b;
                if (bVar != null) {
                    bVar.e(this.$string);
                    return j.a;
                }
                i.o.c.h.k("listener");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(long j2, File file, long j3, h hVar, d<? super f> dVar) {
        super(2, dVar);
        this.$fileSize = j2;
        this.$inFile = file;
        this.$offset = j3;
        this.this$0 = hVar;
    }

    public final d<j> a(Object obj, d<?> dVar) {
        return new f(this.$fileSize, this.$inFile, this.$offset, this.this$0, dVar);
    }

    public Object d(Object obj, Object obj2) {
        x xVar = (x) obj;
        return new f(this.$fileSize, this.$inFile, this.$offset, this.this$0, (d) obj2).l(j.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: g.c.a.l.o.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: g.c.a.l.o.c} */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(java.lang.Object r11) {
        /*
            r10 = this;
            i.m.i.a r0 = i.m.i.a.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            java.lang.Object r0 = r10.L$1
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r0 = r10.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            g.c.b.b.f.q0(r11)     // Catch:{ all -> 0x0017 }
            goto L_0x005d
        L_0x0017:
            r11 = move-exception
            goto L_0x0063
        L_0x0019:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0021:
            g.c.b.b.f.q0(r11)
            long r4 = r10.$fileSize
            int r11 = (int) r4
            byte[] r11 = new byte[r11]
            g.c.a.l.o.c r1 = new g.c.a.l.o.c
            java.io.File r5 = r10.$inFile
            long r6 = r10.$offset
            long r8 = r10.$fileSize
            r4 = r1
            r4.<init>(r5, r6, r8)
            g.c.a.l.o.h r4 = r10.this$0
            r1.read(r11)     // Catch:{ all -> 0x0065 }
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0065 }
            java.lang.String r6 = "UTF_8"
            i.o.c.h.d(r5, r6)     // Catch:{ all -> 0x0065 }
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0065 }
            r6.<init>(r11, r5)     // Catch:{ all -> 0x0065 }
            j.a.h0 r11 = j.a.h0.c     // Catch:{ all -> 0x0065 }
            j.a.f1 r11 = j.a.t1.j.b     // Catch:{ all -> 0x0065 }
            g.c.a.l.o.f$a r5 = new g.c.a.l.o.f$a     // Catch:{ all -> 0x0065 }
            r5.<init>(r4, r6, r2)     // Catch:{ all -> 0x0065 }
            r10.L$0 = r1     // Catch:{ all -> 0x0065 }
            r10.L$1 = r2     // Catch:{ all -> 0x0065 }
            r10.label = r3     // Catch:{ all -> 0x0065 }
            java.lang.Object r11 = g.c.b.b.f.x0(r11, r5, r10)     // Catch:{ all -> 0x0065 }
            if (r11 != r0) goto L_0x005c
            return r0
        L_0x005c:
            r0 = r1
        L_0x005d:
            i.j r11 = i.j.a     // Catch:{ all -> 0x0017 }
            g.c.b.b.f.s(r0, r2)
            return r11
        L_0x0063:
            r1 = r0
            goto L_0x0066
        L_0x0065:
            r11 = move-exception
        L_0x0066:
            throw r11     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            g.c.b.b.f.s(r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.a.l.o.f.l(java.lang.Object):java.lang.Object");
    }
}
