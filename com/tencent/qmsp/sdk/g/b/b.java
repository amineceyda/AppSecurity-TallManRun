package com.tencent.qmsp.sdk.g.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b implements ServiceConnection {
    public static final ThreadPoolExecutor c = new ThreadPoolExecutor(0, 3, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(2048), new ThreadPoolExecutor.DiscardPolicy());
    public boolean a = false;
    public final LinkedBlockingQueue<IBinder> b = new LinkedBlockingQueue<>(1);

    public class a implements Runnable {
        public final IBinder a;

        public a(IBinder iBinder) {
            this.a = iBinder;
        }

        public final void run() {
            try {
                b.this.b.offer(this.a);
            } catch (Throwable unused) {
            }
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("onServiceConnected ");
            sb.append(System.currentTimeMillis());
            Log.d("PPSSerivceConnection", sb.toString());
            c.execute(new a(iBinder));
        } catch (Throwable unused) {
            StringBuilder i2 = g.a.a.a.a.i("onServiceConnected InterruptedException ");
            i2.append(System.currentTimeMillis());
            Log.w("PPSSerivceConnection", i2.toString());
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        StringBuilder i2 = g.a.a.a.a.i("onServiceDisconnected ");
        i2.append(System.currentTimeMillis());
        Log.d("PPSSerivceConnection", i2.toString());
    }
}
