package f.a.a.b.z;

import g.a.a.a.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class h {
    public static final Pattern b = Pattern.compile("([0-9]*(.[0-9]+)?)\\s*(|milli(second)?|second(e)?|minute|hour|day)s?", 2);
    public final long a;

    public h(long j2) {
        this.a = j2;
    }

    public static h a(String str) {
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(3);
            double doubleValue = Double.valueOf(group).doubleValue();
            if (group2.equalsIgnoreCase("milli") || group2.equalsIgnoreCase("millisecond") || group2.length() == 0) {
                return new h((long) doubleValue);
            }
            if (group2.equalsIgnoreCase("second") || group2.equalsIgnoreCase("seconde")) {
                return new h((long) (doubleValue * 1000.0d));
            }
            if (group2.equalsIgnoreCase("minute")) {
                return new h((long) (doubleValue * 60000.0d));
            }
            if (group2.equalsIgnoreCase("hour")) {
                return new h((long) (doubleValue * 3600000.0d));
            }
            if (group2.equalsIgnoreCase("day")) {
                return new h((long) (doubleValue * 8.64E7d));
            }
            throw new IllegalStateException(a.w("Unexpected ", group2));
        }
        throw new IllegalArgumentException(a.c("String value [", str, "] is not in the expected format."));
    }

    public String toString() {
        StringBuilder sb;
        String str;
        long j2 = this.a;
        if (j2 < 1000) {
            sb = new StringBuilder();
            sb.append(this.a);
            str = " milliseconds";
        } else if (j2 < 60000) {
            sb = new StringBuilder();
            sb.append(this.a / 1000);
            str = " seconds";
        } else if (j2 < 3600000) {
            sb.append(this.a / 60000);
            str = " minutes";
        } else {
            sb = new StringBuilder();
            sb.append(this.a / 3600000);
            str = " hours";
        }
        sb.append(str);
        return sb.toString();
    }
}
