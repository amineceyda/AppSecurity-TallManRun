package g.f.a.e;

import g.f.a.e.b;

public class d {
    public static b a;

    public enum b {
        SLF4J("org.slf4j.LoggerFactory", "com.j256.ormlite.logger.Slf4jLoggingLog"),
        ANDROID("android.util.Log", "com.j256.ormlite.android.AndroidLog"),
        COMMONS_LOGGING("org.apache.commons.logging.LogFactory", "com.j256.ormlite.logger.CommonsLoggingLog"),
        LOG4J2("org.apache.logging.log4j.LogManager", "com.j256.ormlite.logger.Log4j2Log"),
        LOG4J("org.apache.log4j.Logger", "com.j256.ormlite.logger.Log4jLog"),
        LOCAL(r0.getName(), r0.getName()) {
            public b a(String str) {
                return new a(str);
            }

            public boolean d() {
                return true;
            }
        },
        JAVA_UTIL("java.util.logging.Logger", "com.j256.ormlite.logger.JavaUtilLog");
        
        private final String detectClassName;
        private final String logClassName;

        /* access modifiers changed from: public */
        b(String str, String str2) {
            this.detectClassName = str;
            this.logClassName = str2;
        }

        /* access modifiers changed from: public */
        b(String str, String str2, a aVar) {
            this.detectClassName = str;
            this.logClassName = str2;
        }

        public b a(String str) {
            try {
                return b(str);
            } catch (Exception e2) {
                a aVar = new a(str);
                b.a aVar2 = b.a.WARNING;
                StringBuilder i2 = g.a.a.a.a.i("Unable to call constructor with single String argument for class ");
                i2.append(this.logClassName);
                i2.append(", so had to use local log: ");
                i2.append(e2.getMessage());
                aVar.e(aVar2, i2.toString(), (Throwable) null);
                return aVar;
            }
        }

        public final b b(String str) throws Exception {
            return (b) Class.forName(this.logClassName).getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
        }

        public boolean d() {
            boolean z;
            try {
                Class.forName(this.detectClassName);
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                return false;
            }
            try {
                b(getClass().getName()).a(b.a.INFO);
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }
    }

    public static c a(Class<?> cls) {
        b bVar;
        String name = cls.getName();
        if (a == null) {
            String property = System.getProperty("com.j256.ormlite.logger.type");
            if (property != null) {
                try {
                    bVar = b.valueOf(property);
                } catch (IllegalArgumentException unused) {
                    new a(d.class.getName()).e(b.a.WARNING, g.a.a.a.a.c("Could not find valid log-type from system property 'com.j256.ormlite.logger.type', value '", property, "'"), (Throwable) null);
                }
                a = bVar;
            }
            b[] values = b.values();
            int i2 = 0;
            while (true) {
                if (i2 >= 7) {
                    bVar = b.LOCAL;
                    break;
                }
                b bVar2 = values[i2];
                if (bVar2.d()) {
                    bVar = bVar2;
                    break;
                }
                i2++;
            }
            a = bVar;
        }
        return new c(a.a(name));
    }
}
