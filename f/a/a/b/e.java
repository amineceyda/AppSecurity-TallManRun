package f.a.a.b;

import f.a.a.b.z.i;
import org.slf4j.helpers.MessageFormatter;

public class e {
    public static final String a;
    public static final String b = new String(new char[]{MessageFormatter.DELIM_START});
    public static final String c = new String(new char[]{MessageFormatter.DELIM_STOP});

    static {
        i.a(5);
        String property = System.getProperty("line.separator");
        a = property;
        property.length();
    }
}
