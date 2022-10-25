package g.c.a.g.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import e.h.b.j;
import g.c.a.e.h.b.d;
import g.i.c.a.a.i.b;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class a extends j {
    public static final Logger q = LoggerFactory.getLogger("BaseActivityLog");
    public Context n;
    public Activity o;
    public g.c.a.e.h.b.a p = new g.c.a.e.h.b.a();

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        b.C0166b.a.c(this, motionEvent, false, true);
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        b.C0166b.a.c(this, motionEvent, dispatchTouchEvent, false);
        return dispatchTouchEvent;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(2130772043, 2130772028);
    }

    public void o(Intent intent) {
        if (intent != null) {
            Bundle p2 = e.e.i.b.p(intent);
            if (p2 == null || p2.get("preActivityTagName") == null) {
                intent.putExtra("preActivityTagName", this.p.scene);
            }
            if (p2 == null || p2.get("preActivityPositionTagName") == null) {
                intent.putExtra("preActivityPositionTagName", this.p.position);
            }
            if (p2 == null || p2.get("preActivitySmallPositionTagName") == null) {
                intent.putExtra("preActivitySmallPositionTagName", this.p.smallPosition);
            }
            if (p2 == null || p2.get("preActivityPositionTagName") == null || !intent.hasExtra("preActivityModelTypeName")) {
                intent.putExtra("preActivityModelTypeName", this.p.modelType);
            }
            if (p2 == null || p2.get("preActivityModuleName") == null || !intent.hasExtra("preActivityModuleName")) {
                intent.putExtra("preActivityModuleName", this.p.moduleName);
            }
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.C0166b.a.b(this, configuration);
    }

    public void onCreate(Bundle bundle) {
        u();
        this.n = this;
        this.o = this;
        p();
        super.onCreate(bundle);
    }

    public void onPause() {
        super.onPause();
        g.g.a.c();
    }

    public void onResume() {
        try {
            super.onResume();
        } catch (Exception e2) {
            q.error("base activity onResume {}", (Object) e2.getMessage(), (Object) e2);
        }
        g.g.a.c();
    }

    public void onWindowFocusChanged(boolean z) {
        g.g.a.b(z);
        super.onWindowFocusChanged(z);
    }

    public void p() {
        x(e.e.i.b.v(getIntent(), "preActivityTagName", 0), e.e.i.b.C(getIntent(), "preActivityPositionTagName"), e.e.i.b.C(getIntent(), "preActivitySmallPositionTagName"), e.e.i.b.u(getIntent(), "preActivityModelTypeName", -1), e.e.i.b.C(getIntent(), "preActivityModuleName"));
    }

    public HashMap<String, Object> q() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("source_scene", Long.valueOf(this.p.sourceScene));
        hashMap.put("source_position", this.p.sourcePosition);
        hashMap.put("source_small_position", this.p.sourceSmallPosition);
        hashMap.put("source_model_type", Integer.valueOf(this.p.sourceModelType));
        hashMap.put("source_module_name", this.p.sourceModuleName);
        return hashMap;
    }

    public String r() {
        return "page_default";
    }

    public long s() {
        return 0;
    }

    public void setContentView(int i2) {
        super.setContentView(i2);
        t();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        t();
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        t();
    }

    public void startActivity(Intent intent) {
        try {
            o(intent);
            super.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public void t() {
        this.p.scene = s();
        d.j(this, r(), r(), q());
    }

    public void u() {
        overridePendingTransition(2130772027, 2130772043);
    }

    public void v(long j2, String str, String str2, int i2, String str3) {
        if (j2 != 0) {
            this.p.scene = j2;
        }
        if (!TextUtils.isEmpty(str)) {
            this.p.position = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.p.smallPosition = str2;
        }
        if (i2 != 0) {
            this.p.modelType = i2;
        }
        if (!TextUtils.isEmpty(str3)) {
            this.p.moduleName = str3;
        }
        d.k(this, r(), q());
    }

    public void w(g.c.a.e.h.b.a aVar) {
        v(aVar.scene, aVar.position, aVar.smallPosition, aVar.modelType, aVar.moduleName);
    }

    public void x(long j2, String str, String str2, int i2, String str3) {
        this.p.sourceScene = j2;
        if (!TextUtils.isEmpty(str)) {
            this.p.sourcePosition = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.p.sourceSmallPosition = str2;
        }
        this.p.sourceModelType = i2;
        if (!TextUtils.isEmpty(str3)) {
            this.p.sourceModuleName = str3;
        }
        d.k(this, r(), q());
    }
}
