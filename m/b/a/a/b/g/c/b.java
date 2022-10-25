package m.b.a.a.b.g.c;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;

public final class b {
    public static final Collection<String> b = Arrays.asList(new String[]{"destfile", "append", "includes", "excludes", "exclclassloader", "inclbootstrapclasses", "inclnolocationclasses", "sessionid", "dumponexit", "output", "address", "port", "classdumpdir", "jmx"});
    public final Map<String, String> a = new HashMap();

    public enum a {
        file,
        tcpserver,
        tcpclient,
        none
    }

    static {
        Pattern.compile(",(?=[a-zA-Z0-9_\\-]+=)");
    }

    public b(Properties properties) {
        for (String next : b) {
            String property = properties.getProperty(next);
            if (property != null) {
                this.a.put(next, property);
            }
        }
    }

    public final String a(String str, String str2) {
        String str3 = this.a.get(str);
        return str3 == null ? str2 : str3;
    }

    public final boolean b(String str, boolean z) {
        String str2 = this.a.get(str);
        return str2 == null ? z : Boolean.parseBoolean(str2);
    }

    public int c() {
        String str = this.a.get("port");
        if (str == null) {
            return 6300;
        }
        return Integer.parseInt(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String next : b) {
            String str = this.a.get(next);
            if (str != null) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                g.a.a.a.a.p(sb, next, '=', str);
            }
        }
        return sb.toString();
    }
}
