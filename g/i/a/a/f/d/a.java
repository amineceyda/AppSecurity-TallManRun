package g.i.a.a.f.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.assistant.alive.lifecycle.IAppLifeCycleService;
import com.tencent.assistant.alive.timer.ITimerJobService;
import com.tencent.raft.raftannotation.RServiceImpl;
import com.tencent.raft.raftframework.RAFT;
import g.i.a.a.f.b;
import g.i.a.a.f.c;

@RServiceImpl(bindInterface = {IAppLifeCycleService.class})
public class a implements IAppLifeCycleService {
    public b a = null;
    public boolean b = false;
    public boolean c = false;

    /* renamed from: g.i.a.a.f.d.a$a  reason: collision with other inner class name */
    public static class C0143a extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            String str;
            if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && (stringExtra = intent.getStringExtra("reason")) != null) {
                if (stringExtra.equals("homekey")) {
                    str = "Button click";
                } else if (stringExtra.equals("recentapps")) {
                    str = "SYSTEM_DIALOG_REASON_RECENT_APPS";
                } else {
                    return;
                }
                g.i.a.a.m.a.a("IAppLifeCycleService", str);
            }
        }
    }

    public void a() {
        b bVar;
        boolean a2;
        try {
            if (!this.c && (bVar = this.a) != null && this.b != (a2 = bVar.a())) {
                g.i.a.a.m.a.a("IAppLifeCycleService", "refreshAppFrontState： " + a2);
                this.b = a2;
                g.i.a.a.e.a.b(a2);
            }
        } catch (Throwable th) {
            g.i.a.a.m.a.b(th);
        }
    }

    public void b(g.i.a.a.a.b bVar) {
        if (!bVar.f4083f) {
            g.i.a.a.e.a.b(false);
            return;
        }
        this.a = new b(bVar.a, bVar.a());
        ((ITimerJobService) RAFT.get(ITimerJobService.class)).a(new c(this));
        g.i.a.a.m.a.a("IAppLifeCycleService", "startWatchAppIsFront");
        bVar.a.registerReceiver(new C0143a(), new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public void onWindowFocusChanged(boolean z) {
        if (!z) {
            try {
                g.i.a.a.e.a.b(false);
                this.c = true;
            } catch (Throwable th) {
                g.i.a.a.m.a.b(th);
            }
        } else {
            this.c = false;
            a();
        }
    }
}
