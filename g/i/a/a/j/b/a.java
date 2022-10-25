package g.i.a.a.j.b;

import android.app.Application;
import com.tencent.assistant.alive.api.IKeepAliveService;
import com.tencent.assistant.alive.jni.KeepAliveJniApi;
import com.tencent.raft.raftframework.RAFT;
import g.i.a.a.a.b;
import g.i.a.a.j.a.c;
import g.i.a.a.j.c.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Objects;

public class a implements Runnable {
    public final /* synthetic */ b b;

    public a(b bVar) {
        this.b = bVar;
    }

    public void run() {
        String str;
        boolean z;
        b bVar = this.b;
        b bVar2 = bVar.config;
        Objects.requireNonNull(bVar);
        new c().a(bVar2);
        b bVar3 = this.b;
        ((g.i.a.a.j.c.a) bVar3.processMonitor).a(bVar3);
        g.i.a.a.j.c.a aVar = (g.i.a.a.j.c.a) this.b.processMonitor;
        b bVar4 = aVar.c;
        if (bVar4 == null) {
            g.i.a.a.m.a.a("FileProcessMonitor", "cannot find config, start monitor failed.");
        } else {
            g.i.a.a.a.c cVar = bVar4.f4085h;
            String str2 = cVar.f4088f;
            if (str2.equals(cVar.b)) {
                str = cVar.f4086d;
            } else {
                str = cVar.f4088f.equals(cVar.f4086d) ? cVar.b : "";
            }
            g.i.a.a.m.a.a("FileProcessMonitor", "start file monitor in: " + str2);
            String B = g.h.a.a.B(aVar.c.a, "qdalive_2.1.5");
            for (int i2 = 0; i2 < 10; i2++) {
                KeepAliveJniApi keepAliveJniApi = aVar.b;
                Objects.requireNonNull(keepAliveJniApi);
                if (KeepAliveJniApi.c) {
                    Objects.requireNonNull(keepAliveJniApi.b);
                    b c = ((IKeepAliveService) RAFT.get(IKeepAliveService.class)).c();
                    if (c != null) {
                        Application application = c.a;
                        boolean z2 = true;
                        try {
                            File file = new File(B);
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            File file2 = new File(file, "daemon2.bin");
                            if (!file2.exists()) {
                                InputStream open = application.getAssets().open("armeabi" + File.separator + g.i.a.a.e.a.a);
                                if (!file2.getParentFile().exists()) {
                                    file2.getParentFile().mkdirs();
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = open.read(bArr);
                                    if (read <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.close();
                                open.close();
                                Runtime runtime = Runtime.getRuntime();
                                runtime.exec("chmod 700 " + file2).waitFor();
                            }
                            z = true;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            z = false;
                        }
                        if (!z) {
                            z2 = false;
                        } else {
                            File file3 = new File(B);
                            if (!file3.exists()) {
                                file3.mkdirs();
                            }
                            g.i.a.a.e.a.a("dead_stamp");
                            g.i.a.a.e.a.a("front_status");
                        }
                        if (z2) {
                            try {
                                keepAliveJniApi.doWatch(keepAliveJniApi.a, B, str2, str);
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                    } else {
                        throw new RuntimeException("cannot not find keep alive config");
                    }
                }
            }
            g.i.a.a.m.a.a("FileProcessMonitor", "onProcessDied");
            g.i.a.a.b.b<b.a> bVar5 = aVar.a;
            synchronized (bVar5.b) {
                for (WeakReference<Icallback> weakReference : bVar5.b) {
                    g.i.a.a.b.a aVar2 = (g.i.a.a.b.a) weakReference.get();
                    g.i.a.a.m.a.a("CallbackHelper", "broadcast---listener = " + aVar2);
                    if (aVar2 != null) {
                        try {
                            ((b.a) aVar2).Y(str2);
                        } catch (Throwable th) {
                            g.i.a.a.m.a.b(th);
                        }
                    }
                }
            }
        }
        b bVar6 = this.b;
        g.i.a.a.a.b bVar7 = bVar6.config;
        Objects.requireNonNull(bVar6);
        new g.i.a.a.j.a.a().a(bVar7);
    }
}
