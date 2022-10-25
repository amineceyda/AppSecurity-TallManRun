package g.i.c.a.a.i.e;

import android.app.Activity;
import android.content.res.Configuration;
import g.i.c.a.a.i.d;

public class a implements c {
    public Activity a;
    public Configuration b;

    public void a(d dVar) {
        dVar.j(this.a, this.b);
    }

    public int b() {
        return 9;
    }

    public void c() {
        this.a = null;
        this.b = null;
    }

    public void d(Activity activity, Configuration configuration) {
        this.a = activity;
        this.b = configuration;
    }
}
