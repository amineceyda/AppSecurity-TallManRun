package g.c.c;

import android.content.Context;
import com.tencent.crabshell.builder.ShellBuilderService;
import e.e.i.b;
import java.io.File;
import java.util.Objects;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ k b;
    public final /* synthetic */ Context c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f2313d;

    public /* synthetic */ a(k kVar, Context context, String str) {
        this.b = kVar;
        this.c = context;
        this.f2313d = str;
    }

    public final void run() {
        k kVar = this.b;
        Context context = this.c;
        String str = this.f2313d;
        Objects.requireNonNull(kVar);
        l.b = str;
        b.D().a(new i(str));
        File file = new File(str);
        ShellBuilderService shellBuilderService = new ShellBuilderService();
        shellBuilderService.setReporter(kVar);
        shellBuilderService.releaseNewApk(context, file.getPath());
    }
}
