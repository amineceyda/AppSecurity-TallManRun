package g.i.b.e.h;

import android.os.Environment;
import android.os.Handler;
import android.util.Log;
import g.i.b.e.c;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class b {
    public static volatile boolean a = false;
    public static volatile boolean b = false;
    public static FileWriter c;

    public static class a implements Runnable {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f4217d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Throwable f4218e;

        public a(String str, String str2, String str3, Throwable th) {
            this.b = str;
            this.c = str2;
            this.f4217d = str3;
            this.f4218e = th;
        }

        public final void run() {
            b.g(this.b, this.c, this.f4217d, this.f4218e);
        }
    }

    public static void a(String str, String str2) {
        if (a) {
            Log.v(str, str2);
        }
        if (b) {
            d("V", str, str2, (Throwable) null);
        }
    }

    public static void b(String str, Throwable th) {
        if (a) {
            Log.w(str, th);
        }
        if (b) {
            d("W", str, (String) null, th);
        }
    }

    public static void c(String str, String str2) {
        if (a) {
            Log.d(str, str2);
        }
        if (b) {
            d("D", str, str2, (Throwable) null);
        }
    }

    public static void d(String str, String str2, String str3, Throwable th) {
        Handler handler = c.n;
        if (handler != null) {
            handler.post(new a(str, str2, str3, th));
        } else {
            g(str, str2, str3, th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (a) {
            Log.w(str, str2, th);
        }
        if (b) {
            d("W", str, str2, th);
        }
    }

    public static void f(String str, String str2) {
        if (a) {
            Log.i(str, str2);
        }
        if (b) {
            d("I", str, str2, (Throwable) null);
        }
    }

    public static synchronized void g(String str, String str2, String str3, Throwable th) {
        String str4;
        synchronized (b.class) {
            if (c.f4125g != null) {
                StringBuilder sb = new StringBuilder(str + "\t");
                sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US).format(new Date(System.currentTimeMillis())) + "\t");
                sb.append(c.f4124f + "|" + c.a() + "\t");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append("\t");
                sb.append(sb2.toString());
                if (str3 != null) {
                    sb.append("[MSG]" + str3 + "\t");
                }
                if (th != null) {
                    sb.append("[Throwable]" + Log.getStackTraceString(th));
                }
                sb.append("\r\n");
                FileWriter fileWriter = c;
                if (fileWriter != null) {
                    try {
                        fileWriter.write(sb.toString());
                        c.flush();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        try {
                            c.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        c = null;
                    }
                }
                if (c == null) {
                    String format = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date(System.currentTimeMillis()));
                    String str5 = "hl_" + (e.e(c.a()) ? "main" : c.a()) + "_" + format + ".txt";
                    if (!"mounted".equals(Environment.getExternalStorageState())) {
                        Log.w("DOWNLOADER_WARN", "sdcard is not ready, logs will not be saved.");
                        return;
                    }
                    if ("mounted".equals(Environment.getExternalStorageState())) {
                        str4 = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Log/" + e.i();
                    } else {
                        str4 = "";
                    }
                    File file = new File(str4);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(str4, str5);
                    if (file2.isDirectory()) {
                        file2.delete();
                    }
                    if (!file2.exists()) {
                        try {
                            file2.createNewFile();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            FileWriter fileWriter2 = c;
                            if (fileWriter2 != null) {
                                try {
                                    fileWriter2.close();
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                                c = null;
                            }
                            return;
                        }
                    }
                    try {
                        FileWriter fileWriter3 = new FileWriter(file2, true);
                        c = fileWriter3;
                        fileWriter3.write(sb.toString());
                        c.flush();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                        FileWriter fileWriter4 = c;
                        if (fileWriter4 != null) {
                            try {
                                fileWriter4.close();
                            } catch (Exception e7) {
                                e7.printStackTrace();
                            }
                            c = null;
                        }
                    }
                }
            }
        }
    }

    public static void h(String str, String str2) {
        if (a) {
            Log.w(str, str2);
        }
        if (b) {
            d("W", str, str2, (Throwable) null);
        }
    }

    public static void i(String str, String str2) {
        if (a) {
            Log.e(str, str2);
        }
        if (b) {
            d("E", str, str2, (Throwable) null);
        }
    }
}
