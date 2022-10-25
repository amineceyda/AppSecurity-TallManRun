package g.c.a.e.k.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.IBinder;
import com.apkpure.aegon.services.AppProtoBufUpdateService;
import java.util.GregorianCalendar;
import java.util.Random;

public class e {

    /* renamed from: d  reason: collision with root package name */
    public static volatile e f1998d;
    public Context a;
    public AppProtoBufUpdateService.d b;
    public ServiceConnection c = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            e eVar;
            AppProtoBufUpdateService.d dVar;
            if (iBinder != null) {
                if (AppProtoBufUpdateService.d.class.equals(iBinder.getClass())) {
                    eVar = e.this;
                    dVar = (AppProtoBufUpdateService.d) iBinder;
                } else {
                    eVar = e.this;
                    dVar = null;
                }
                eVar.b = dVar;
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            e.this.b = null;
        }
    }

    public e() {
    }

    public e(Context context) {
        Context context2 = context;
        this.a = context2;
        context2.bindService(new Intent(context2, AppProtoBufUpdateService.class), this.c, 1);
        SharedPreferences sharedPreferences = context2.getSharedPreferences("last_run_time", 0);
        long j2 = sharedPreferences.getLong("start_schedule_check_update", 0);
        if (j2 == 0) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.add(5, 1);
            if (g.c.a.e.k.f.a.a == null) {
                g.c.a.e.k.f.a.a = new Random();
            }
            gregorianCalendar.set(11, g.c.a.e.k.f.a.a.nextInt(12) + 9);
            gregorianCalendar.set(13, 0);
            j2 = gregorianCalendar.getTimeInMillis();
        }
        ((AlarmManager) context2.getSystemService("alarm")).setRepeating(0, j2, 86400000, PendingIntent.getService(context2, (e.e.d.l.a.z("REQUESTER_APP_UPDATE_MANAGER") * 1000) + 0, new Intent(context2, AppProtoBufUpdateService.class), 134217728));
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("start_schedule_check_update", j2);
        edit.apply();
    }

    public static e a(Context context) {
        if (f1998d == null) {
            synchronized (e.class) {
                Context applicationContext = context.getApplicationContext();
                if (f1998d == null) {
                    f1998d = new e(applicationContext);
                }
            }
        }
        return f1998d;
    }

    public void finalize() {
        this.a.unbindService(this.c);
        try {
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
