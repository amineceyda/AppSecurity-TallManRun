package g.c.a.l.o;

import com.apkpure.aegon.signstuff.walle.IdNotFoundException;
import g.c.b.b.f;
import i.j;
import i.m.d;
import i.m.j.a.e;
import i.o.b.p;
import j.a.f1;
import j.a.h0;
import j.a.x;
import j.a.y;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class h implements a {
    public static final h c = null;

    /* renamed from: d  reason: collision with root package name */
    public static final Logger f2080d = LoggerFactory.getLogger("WalleManagerLog");
    public final x a = f.b();
    public b b;

    @e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$toFind$1", f = "WalleManager.kt", l = {72, 104}, m = "invokeSuspend")
    public static final class a extends i.m.j.a.h implements p<x, d<? super j>, Object> {
        public final /* synthetic */ int $chooseId;
        public final /* synthetic */ File $inFile;
        public final /* synthetic */ String $outPath;
        public final /* synthetic */ k $walleType;
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ h this$0;

        @e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$toFind$1$1", f = "WalleManager.kt", l = {}, m = "invokeSuspend")
        /* renamed from: g.c.a.l.o.h$a$a  reason: collision with other inner class name */
        public static final class C0065a extends i.m.j.a.h implements p<x, d<? super j>, Object> {
            public int label;
            public final /* synthetic */ h this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0065a(h hVar, d<? super C0065a> dVar) {
                super(2, dVar);
                this.this$0 = hVar;
            }

            public final d<j> a(Object obj, d<?> dVar) {
                return new C0065a(this.this$0, dVar);
            }

            public Object d(Object obj, Object obj2) {
                x xVar = (x) obj;
                C0065a aVar = new C0065a(this.this$0, (d) obj2);
                j jVar = j.a;
                aVar.l(jVar);
                return jVar;
            }

            public final Object l(Object obj) {
                if (this.label == 0) {
                    f.q0(obj);
                    b bVar = this.this$0.b;
                    if (bVar != null) {
                        bVar.d(new IdNotFoundException());
                        return j.a;
                    }
                    i.o.c.h.k("listener");
                    throw null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$toFind$1$2$1", f = "WalleManager.kt", l = {}, m = "invokeSuspend")
        public static final class b extends i.m.j.a.h implements p<x, d<? super j>, Object> {
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
                        bVar.d(new IdNotFoundException());
                        return j.a;
                    }
                    i.o.c.h.k("listener");
                    throw null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(File file, h hVar, int i2, String str, k kVar, d<? super a> dVar) {
            super(2, dVar);
            this.$inFile = file;
            this.this$0 = hVar;
            this.$chooseId = i2;
            this.$outPath = str;
            this.$walleType = kVar;
        }

        public final d<j> a(Object obj, d<?> dVar) {
            return new a(this.$inFile, this.this$0, this.$chooseId, this.$outPath, this.$walleType, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            return new a(this.$inFile, this.this$0, this.$chooseId, this.$outPath, this.$walleType, (d) obj2).l(j.a);
        }

        public final Object l(Object obj) {
            RandomAccessFile randomAccessFile;
            Throwable th;
            RandomAccessFile randomAccessFile2;
            Throwable th2;
            i.m.i.a aVar = i.m.i.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                f.q0(obj);
                File file = this.$inFile;
                if (file == null || !file.exists()) {
                    h0 h0Var = h0.c;
                    f1 f1Var = j.a.t1.j.b;
                    C0065a aVar2 = new C0065a(this.this$0, (d<? super C0065a>) null);
                    this.label = 1;
                    if (f.x0(f1Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                    return j.a;
                }
                RandomAccessFile randomAccessFile3 = new RandomAccessFile(this.$inFile, "r");
                h hVar = this.this$0;
                int i3 = this.$chooseId;
                File file2 = this.$inFile;
                String str = this.$outPath;
                k kVar = this.$walleType;
                randomAccessFile = randomAccessFile3;
                FileChannel channel = randomAccessFile3.getChannel();
                l lVar = l.a;
                i.o.c.h.d(channel, "fileChannel");
                long b2 = l.b(channel);
                long a = l.a(channel, b2);
                long j2 = b2 - a;
                long j3 = 0;
                if (j2 > 0) {
                    if (j2 <= channel.size()) {
                        channel.position(j2);
                        int i4 = 0;
                        while (true) {
                            long j4 = j2;
                            channel.position(j2 + j3 + ((long) (i4 * 8)));
                            l lVar2 = l.a;
                            ByteBuffer c = l.c(channel);
                            long j5 = c.getLong();
                            if (c.getInt() == i3) {
                                h.a(hVar, file2, str, j5 - ((long) 4), channel.position(), kVar);
                                break;
                            } else if (j3 >= a) {
                                h0 h0Var2 = h0.c;
                                f1 f1Var2 = j.a.t1.j.b;
                                b bVar = new b(hVar, (d<? super b>) null);
                                this.L$0 = randomAccessFile3;
                                this.L$1 = null;
                                this.label = 2;
                                if (f.x0(f1Var2, bVar, this) == aVar) {
                                    return aVar;
                                }
                            } else {
                                j3 += j5;
                                i4++;
                                j2 = j4;
                            }
                        }
                        th2 = null;
                        randomAccessFile2 = randomAccessFile3;
                    }
                }
                randomAccessFile = randomAccessFile3;
                b bVar2 = hVar.b;
                if (bVar2 != null) {
                    bVar2.d(new IdNotFoundException());
                    j jVar = j.a;
                    f.s(randomAccessFile3, (Throwable) null);
                    return jVar;
                }
                randomAccessFile = randomAccessFile3;
                i.o.c.h.k("listener");
                randomAccessFile = randomAccessFile3;
                throw null;
            } else if (i2 == 1) {
                f.q0(obj);
                return j.a;
            } else if (i2 == 2) {
                th2 = (Throwable) this.L$1;
                Closeable closeable = (Closeable) this.L$0;
                try {
                    randomAccessFile = closeable;
                    f.q0(obj);
                    randomAccessFile = closeable;
                    randomAccessFile2 = closeable;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    f.s(randomAccessFile, th);
                    throw th4;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j jVar2 = j.a;
            f.s(randomAccessFile2, th2);
            return jVar2;
        }
    }

    public h() {
    }

    public h(i.o.c.f fVar) {
    }

    public static final void a(h hVar, File file, String str, long j2, long j3, k kVar) {
        Objects.requireNonNull(hVar);
        f2080d.debug("hasValue, file:{}, outPath:{}, fileSize: {}, position:{}, walleType:{}", file, str, Long.valueOf(j2), Long.valueOf(j3), kVar);
        x xVar = hVar.a;
        h0 h0Var = h0.c;
        f.S(xVar, h0.b, (y) null, new g(kVar, hVar, file, j3, j2, str, (d<? super g>) null), 2, (Object) null);
    }

    public static final a c() {
        return new h((i.o.c.f) null);
    }

    public void b(File file, int i2, String str, b bVar) {
        i.o.c.h.e(file, "inFile");
        i.o.c.h.e(str, "outPath");
        i.o.c.h.e(bVar, "listener");
        f2080d.debug("getFileById ifFile:{} , chooseId:{} ,outpath:{}", file, Integer.valueOf(i2), str);
        try {
            this.b = bVar;
            d(file, i2, str, k.FILE);
        } catch (Exception e2) {
            bVar.d(e2);
        }
    }

    public final void d(File file, int i2, String str, k kVar) throws Exception {
        f2080d.debug("toFind inFile:{}, chooseId:{}, outPath:{}, walleType()", file, Integer.valueOf(i2), str, kVar);
        x xVar = this.a;
        h0 h0Var = h0.c;
        f.S(xVar, h0.b, (y) null, new a(file, this, i2, str, kVar, (d<? super a>) null), 2, (Object) null);
    }
}
