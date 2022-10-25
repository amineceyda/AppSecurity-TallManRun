package g.c.a.l.o;

import g.c.b.b.f;
import i.j;
import i.m.d;
import i.m.j.a.h;
import i.o.b.p;
import j.a.f1;
import j.a.h0;
import j.a.x;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

@i.m.j.a.e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$getSeekableByteChannel$1", f = "WalleManager.kt", l = {164}, m = "invokeSuspend")
public final class e extends h implements p<x, d<? super j>, Object> {
    public final /* synthetic */ long $fileSize;
    public final /* synthetic */ File $inFile;
    public final /* synthetic */ long $offset;
    public int label;
    public final /* synthetic */ h this$0;

    @i.m.j.a.e(c = "com.apkpure.aegon.signstuff.walle.WalleManager$getSeekableByteChannel$1$1", f = "WalleManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h implements p<x, d<? super j>, Object> {
        public final /* synthetic */ i $seekableByteChannel;
        public int label;
        public final /* synthetic */ h this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, i iVar, d<? super a> dVar) {
            super(2, dVar);
            this.this$0 = hVar;
            this.$seekableByteChannel = iVar;
        }

        public final d<j> a(Object obj, d<?> dVar) {
            return new a(this.this$0, this.$seekableByteChannel, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            a aVar = new a(this.this$0, this.$seekableByteChannel, (d) obj2);
            j jVar = j.a;
            aVar.l(jVar);
            return jVar;
        }

        public final Object l(Object obj) {
            if (this.label == 0) {
                f.q0(obj);
                b bVar = this.this$0.b;
                if (bVar != null) {
                    bVar.f(this.$seekableByteChannel);
                    return j.a;
                }
                i.o.c.h.k("listener");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(File file, long j2, long j3, h hVar, d<? super e> dVar) {
        super(2, dVar);
        this.$inFile = file;
        this.$offset = j2;
        this.$fileSize = j3;
        this.this$0 = hVar;
    }

    public final d<j> a(Object obj, d<?> dVar) {
        return new e(this.$inFile, this.$offset, this.$fileSize, this.this$0, dVar);
    }

    public Object d(Object obj, Object obj2) {
        x xVar = (x) obj;
        return new e(this.$inFile, this.$offset, this.$fileSize, this.this$0, (d) obj2).l(j.a);
    }

    public final Object l(Object obj) {
        i.m.i.a aVar = i.m.i.a.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            f.q0(obj);
            FileChannel channel = new RandomAccessFile(this.$inFile, "r").getChannel();
            i.o.c.h.d(channel, "randomAccessFile.channel");
            i iVar = new i(channel, this.$offset, this.$fileSize);
            h0 h0Var = h0.c;
            f1 f1Var = j.a.t1.j.b;
            a aVar2 = new a(this.this$0, iVar, (d<? super a>) null);
            this.label = 1;
            if (f.x0(f1Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i2 == 1) {
            f.q0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return j.a;
    }
}
