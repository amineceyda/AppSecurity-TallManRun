package g.f.a.e;

import g.f.a.e.b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

public class a implements b {
    public static final ThreadLocal<DateFormat> c = new C0137a();

    /* renamed from: d  reason: collision with root package name */
    public static PrintStream f3944d;

    /* renamed from: e  reason: collision with root package name */
    public static final List<b> f3945e;
    public final String a;
    public final b.a b;

    /* renamed from: g.f.a.e.a$a  reason: collision with other inner class name */
    public static class C0137a extends ThreadLocal<DateFormat> {
        public Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        }
    }

    public static class b {
        public Pattern a;
        public b.a b;

        public b(Pattern pattern, b.a aVar) {
            this.a = pattern;
            this.b = aVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c A[SYNTHETIC, Splitter:B:22:0x004c] */
    static {
        /*
            g.f.a.e.a$a r0 = new g.f.a.e.a$a
            r0.<init>()
            c = r0
            java.lang.Class<g.f.a.e.a> r0 = g.f.a.e.a.class
            java.lang.String r1 = "/ormliteLocalLog.properties"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x003c
            java.util.List r1 = d(r0)     // Catch:{ IOException -> 0x001d }
            r0.close()     // Catch:{ IOException -> 0x0019 }
            goto L_0x003d
        L_0x0019:
            goto L_0x003d
        L_0x001b:
            r1 = move-exception
            goto L_0x0038
        L_0x001d:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x001b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x001b }
            r3.<init>()     // Catch:{ all -> 0x001b }
            java.lang.String r4 = "IO exception reading the log properties file '/ormliteLocalLog.properties': "
            r3.append(r4)     // Catch:{ all -> 0x001b }
            r3.append(r1)     // Catch:{ all -> 0x001b }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x001b }
            r2.println(r1)     // Catch:{ all -> 0x001b }
            r0.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003c
        L_0x0038:
            r0.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            throw r1
        L_0x003c:
            r1 = 0
        L_0x003d:
            f3945e = r1
            java.lang.String r0 = "com.j256.ormlite.logger.file"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto L_0x004c
            java.io.PrintStream r0 = java.lang.System.out
            f3944d = r0
            goto L_0x0058
        L_0x004c:
            java.io.PrintStream r1 = new java.io.PrintStream     // Catch:{ FileNotFoundException -> 0x0059 }
            java.io.File r2 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0059 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0059 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0059 }
            f3944d = r1     // Catch:{ FileNotFoundException -> 0x0059 }
        L_0x0058:
            return
        L_0x0059:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Log file "
            java.lang.String r4 = " was not found"
            java.lang.String r0 = g.a.a.a.a.c(r3, r0, r4)
            r2.<init>(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.e.a.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6 = g.f.a.e.b.a.valueOf(r6.toUpperCase(java.util.Locale.ENGLISH));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        throw new java.lang.IllegalArgumentException(g.a.a.a.a.c("Level '", r6, "' was not found"), r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.String r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r6.split(r0)
            int r1 = r0.length
            r2 = 1
            if (r1 > r2) goto L_0x000f
            r0 = r6
            goto L_0x0013
        L_0x000f:
            int r1 = r0.length
            int r1 = r1 - r2
            r0 = r0[r1]
        L_0x0013:
            r5.a = r0
            r0 = 0
            java.util.List<g.f.a.e.a$b> r1 = f3945e
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0047
            java.lang.Object r2 = r1.next()
            g.f.a.e.a$b r2 = (g.f.a.e.a.b) r2
            java.util.regex.Pattern r3 = r2.a
            java.util.regex.Matcher r3 = r3.matcher(r6)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x001e
            if (r0 == 0) goto L_0x0044
            g.f.a.e.b$a r3 = r2.b
            int r3 = r3.ordinal()
            int r4 = r0.ordinal()
            if (r3 >= r4) goto L_0x001e
        L_0x0044:
            g.f.a.e.b$a r0 = r2.b
            goto L_0x001e
        L_0x0047:
            if (r0 != 0) goto L_0x0078
            java.lang.String r6 = "com.j256.ormlite.logger.level"
            java.lang.String r6 = java.lang.System.getProperty(r6)
            if (r6 != 0) goto L_0x0054
            g.f.a.e.b$a r0 = g.f.a.e.b.a.DEBUG
            goto L_0x0078
        L_0x0054:
            java.lang.String r0 = r6.toUpperCase()     // Catch:{ IllegalArgumentException -> 0x005e }
            g.f.a.e.b$a r6 = g.f.a.e.b.a.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x005e }
        L_0x005c:
            r0 = r6
            goto L_0x0078
        L_0x005e:
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ IllegalArgumentException -> 0x0069 }
            java.lang.String r0 = r6.toUpperCase(r0)     // Catch:{ IllegalArgumentException -> 0x0069 }
            g.f.a.e.b$a r6 = g.f.a.e.b.a.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0069 }
            goto L_0x005c
        L_0x0069:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Level '"
            java.lang.String r3 = "' was not found"
            java.lang.String r6 = g.a.a.a.a.c(r2, r6, r3)
            r1.<init>(r6, r0)
            throw r1
        L_0x0078:
            r5.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.f.a.e.a.<init>(java.lang.String):void");
    }

    public static List<b> d(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return arrayList;
            }
            if (!(readLine.length() == 0 || readLine.charAt(0) == '#')) {
                String[] split = readLine.split("=");
                if (split.length != 2) {
                    PrintStream printStream = System.err;
                    printStream.println("Line is not in the format of 'pattern = level': " + readLine);
                } else {
                    try {
                        arrayList.add(new b(Pattern.compile(split[0].trim()), b.a.valueOf(split[1].trim())));
                    } catch (IllegalArgumentException unused) {
                        PrintStream printStream2 = System.err;
                        StringBuilder i2 = g.a.a.a.a.i("Level '");
                        i2.append(split[1]);
                        i2.append("' was not found");
                        printStream2.println(i2.toString());
                    }
                }
            }
        }
    }

    public boolean a(b.a aVar) {
        return this.b.a(aVar);
    }

    public void b(b.a aVar, String str, Throwable th) {
        e(aVar, str, th);
    }

    public void c(b.a aVar, String str) {
        e(aVar, str, (Throwable) null);
    }

    public final void e(b.a aVar, String str, Throwable th) {
        if (this.b.a(aVar)) {
            StringBuilder sb = new StringBuilder(128);
            sb.append(c.get().format(new Date()));
            sb.append(" [");
            sb.append(aVar.name());
            sb.append("] ");
            g.a.a.a.a.p(sb, this.a, ' ', str);
            f3944d.println(sb.toString());
            if (th != null) {
                th.printStackTrace(f3944d);
            }
        }
    }
}
