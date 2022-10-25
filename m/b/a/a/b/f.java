package m.b.a.a.b;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m.b.a.a.b.g.c.b;

public final class f {
    public static final m.b.a.a.b.g.c.f a;

    static {
        b bVar;
        Properties properties = System.getProperties();
        Pattern pattern = c.a;
        Properties properties2 = new Properties();
        InputStream resourceAsStream = f.class.getResourceAsStream("/jacoco-agent.properties");
        if (resourceAsStream != null) {
            try {
                properties2.load(resourceAsStream);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        for (Map.Entry entry : properties.entrySet()) {
            String obj = entry.getKey().toString();
            if (obj.startsWith("jacoco-agent.")) {
                properties2.put(obj.substring(13), entry.getValue());
            }
        }
        for (Map.Entry entry2 : properties2.entrySet()) {
            String str = (String) entry2.getValue();
            StringBuilder sb = new StringBuilder();
            Matcher matcher = c.a.matcher(str);
            int i2 = 0;
            while (matcher.find()) {
                sb.append(str.substring(i2, matcher.start()));
                String property = properties.getProperty(matcher.group(1));
                if (property == null) {
                    property = matcher.group(0);
                }
                sb.append(property);
                i2 = matcher.end();
            }
            sb.append(str.substring(i2));
            entry2.setValue(sb.toString());
        }
        b bVar2 = new b(properties2);
        synchronized (b.class) {
            if (b.f5248e == null) {
                b bVar3 = new b(bVar2, d.a);
                bVar3.b();
                Runtime.getRuntime().addShutdownHook(new a(bVar3));
                b.f5248e = bVar3;
            }
            bVar = b.f5248e;
        }
        a = bVar.b;
    }

    public static boolean[] a(long j2, String str, int i2) {
        return a.b(Long.valueOf(j2), str, i2).c;
    }
}
