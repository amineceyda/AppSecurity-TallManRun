package f.a.a.b.u.j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d implements l<Date> {
    public final SimpleDateFormat a;
    public final Pattern b;

    public d(i iVar) {
        TimeZone timeZone;
        e<Object> u = iVar.u();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(u != null ? u.f1821g : "yyyy-MM-dd", Locale.US);
        if (u != null) {
            timeZone = u.f1822h;
        } else {
            timeZone = TimeZone.getDefault();
        }
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        this.a = simpleDateFormat;
        this.b = Pattern.compile(iVar.w(true, false));
    }

    /* renamed from: b */
    public Date a(String str) {
        try {
            Matcher matcher = this.b.matcher(str);
            return this.a.parse((!matcher.find() || matcher.groupCount() < 1) ? "" : matcher.group(1));
        } catch (ParseException unused) {
            return null;
        }
    }
}
