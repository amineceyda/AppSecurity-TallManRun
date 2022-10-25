package g.c.a.b.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.apkpure.aegon.application.AegonApplication;
import g.c.b.b.f;
import i.j;
import i.m.d;
import i.m.j.a.h;
import i.o.b.p;
import i.o.c.o;
import j.a.h0;
import j.a.r0;
import j.a.x;
import j.a.y;
import java.util.List;

public final class e implements g.c.a.i.a {
    public final /* synthetic */ o<Activity> a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    @i.m.j.a.e(c = "com.apkpure.aegon.app.assetmanager.InstallManager$requestStorePermission$1$onPermissionGranted$1", f = "InstallManager.kt", l = {454}, m = "invokeSuspend")
    public static final class a extends h implements p<x, d<? super j>, Object> {
        public final /* synthetic */ String $filePath;
        public final /* synthetic */ int $xapkType;
        public int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, int i2, d<? super a> dVar) {
            super(2, dVar);
            this.$filePath = str;
            this.$xapkType = i2;
        }

        public final d<j> a(Object obj, d<?> dVar) {
            return new a(this.$filePath, this.$xapkType, dVar);
        }

        public Object d(Object obj, Object obj2) {
            x xVar = (x) obj;
            return new a(this.$filePath, this.$xapkType, (d) obj2).l(j.a);
        }

        public final Object l(Object obj) {
            i.m.i.a aVar = i.m.i.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                f.q0(obj);
                d dVar = d.a;
                Context context = AegonApplication.getContext();
                i.o.c.h.d(context, "getContext()");
                String str = this.$filePath;
                int i3 = this.$xapkType;
                this.label = 1;
                if (dVar.e(context, str, i3, this) == aVar) {
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

    public e(o<Activity> oVar, String str, int i2) {
        this.a = oVar;
        this.b = str;
        this.c = i2;
    }

    public void a(List<String> list, boolean z, int i2) {
        i.o.c.h.e(list, "grantPermissions");
        if (i2 == 2001) {
            r0 r0Var = r0.b;
            h0 h0Var = h0.c;
            f.S(r0Var, j.a.t1.j.b, (y) null, new a(this.b, this.c, (d<? super a>) null), 2, (Object) null);
        }
    }

    public void b(List<String> list, boolean z, int i2) {
        i.o.c.h.e(list, "grantPermissions");
        if (i2 == 2001 && !z) {
            T t = this.a.element;
            if (t == null || ((Activity) t).isDestroyed()) {
                d.b.info("Top activity is null or is destroyed.");
                return;
            }
            Intent intent = new Intent();
            intent.addFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", ((Activity) this.a.element).getPackageName(), (String) null));
            if (intent.resolveActivity(((Activity) this.a.element).getPackageManager()) != null) {
                ((Activity) this.a.element).startActivity(intent);
            }
        }
    }
}
