package g.i.b.f.f.a;

import java.net.HttpURLConnection;
import java.util.concurrent.LinkedBlockingQueue;

public class b implements Runnable {
    public static final LinkedBlockingQueue<HttpURLConnection> b = new LinkedBlockingQueue<>();
    public static volatile b c = null;

    public b() {
        new Thread(c, "halley-downloader-ConnectionCloser").start();
    }

    public void run() {
        while (true) {
            try {
                HttpURLConnection take = b.take();
                try {
                    take.disconnect();
                    take.getInputStream().close();
                    g.i.b.e.h.b.c("ConnectionCloser", "close a connection:" + take.getURL().getHost());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (InterruptedException e3) {
                e3.printStackTrace();
                return;
            }
        }
    }
}
