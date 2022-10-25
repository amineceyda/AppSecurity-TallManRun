package f.a.a.b.u.j;

import f.a.a.b.w.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public class u extends GregorianCalendar {
    public static final TimeZone b = TimeZone.getTimeZone("GMT");
    public static final HashMap<Character, r> c;
    private static final long serialVersionUID = -5937537740925066161L;
    private String datePattern;
    private r periodicityType;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c = linkedHashMap;
        linkedHashMap.put('S', r.TOP_OF_MILLISECOND);
        linkedHashMap.put('s', r.TOP_OF_SECOND);
        linkedHashMap.put('m', r.TOP_OF_MINUTE);
        r rVar = r.TOP_OF_HOUR;
        linkedHashMap.put('h', rVar);
        linkedHashMap.put('K', rVar);
        linkedHashMap.put('k', rVar);
        linkedHashMap.put('H', rVar);
        linkedHashMap.put('a', r.HALF_DAY);
        r rVar2 = r.TOP_OF_DAY;
        linkedHashMap.put('u', rVar2);
        linkedHashMap.put('E', rVar2);
        linkedHashMap.put('F', rVar2);
        linkedHashMap.put('d', rVar2);
        linkedHashMap.put('D', rVar2);
        r rVar3 = r.TOP_OF_WEEK;
        linkedHashMap.put('W', rVar3);
        linkedHashMap.put('w', rVar3);
        linkedHashMap.put('M', r.TOP_OF_MONTH);
        linkedHashMap.put('Y', rVar3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: f.a.a.b.u.j.r} */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(java.lang.String r3, java.util.TimeZone r4, java.util.Locale r5) {
        /*
            r2 = this;
            f.a.a.b.u.j.r r0 = f.a.a.b.u.j.r.ERRONEOUS
            r2.<init>(r4, r5)
            r2.periodicityType = r0
            r2.datePattern = r3
            if (r3 == 0) goto L_0x003b
            java.util.HashMap<java.lang.Character, f.a.a.b.u.j.r> r3 = c
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0015:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.String r5 = r2.datePattern
            java.lang.Object r1 = r4.getKey()
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            int r5 = r5.indexOf(r1)
            r1 = -1
            if (r5 <= r1) goto L_0x0015
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            f.a.a.b.u.j.r r0 = (f.a.a.b.u.j.r) r0
        L_0x003b:
            r2.periodicityType = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.a.b.u.j.u.<init>(java.lang.String, java.util.TimeZone, java.util.Locale):void");
    }

    public final boolean a(long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.datePattern, Locale.US);
        simpleDateFormat.setTimeZone(b);
        return simpleDateFormat.format(new Date(0)).equals(simpleDateFormat.format(new Date(j2)));
    }

    public Date b(Date date, int i2) {
        int i3;
        setTime(date);
        h(this, this.datePattern);
        switch (this.periodicityType.ordinal()) {
            case 1:
                i3 = 14;
                break;
            case 2:
                i3 = 13;
                break;
            case 3:
                i3 = 12;
                break;
            case 4:
                i3 = 11;
                break;
            case 6:
                i3 = 5;
                break;
            case 7:
                set(7, getFirstDayOfWeek());
                i3 = 3;
                break;
            case 8:
                i3 = 2;
                break;
            default:
                throw new IllegalStateException("Unknown periodicity type.");
        }
        add(i3, i2);
        return getTime();
    }

    public boolean d() {
        int ordinal = this.periodicityType.ordinal();
        if (ordinal == 4) {
            return !a(43200000);
        }
        if (ordinal == 6) {
            return !a(604800000) && !a(2678400000L) && !a(31536000000L);
        }
        if (ordinal != 7) {
            return true;
        }
        return !a(2937600000L) && !a(31622400000L);
    }

    public Date e(Date date) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        h(instance, this.datePattern);
        return instance.getTime();
    }

    public void g(d dVar) {
        String str;
        switch (this.periodicityType.ordinal()) {
            case 1:
                str = "Roll-over every millisecond.";
                break;
            case 2:
                str = "Roll-over every second.";
                break;
            case 3:
                str = "Roll-over every minute.";
                break;
            case 4:
                str = "Roll-over at the top of every hour.";
                break;
            case 5:
                str = "Roll-over at midday and midnight.";
                break;
            case 6:
                str = "Roll-over at midnight.";
                break;
            case 7:
                str = "Rollover at the start of week.";
                break;
            case 8:
                str = "Rollover at start of every month.";
                break;
            default:
                str = "Unknown periodicity.";
                break;
        }
        dVar.n(str);
    }

    public final void h(Calendar calendar, String str) {
        if (str.indexOf(83) == -1) {
            calendar.roll(14, -calendar.get(14));
        }
        if (str.indexOf(115) == -1) {
            calendar.roll(13, -calendar.get(13));
        }
        if (str.indexOf(109) == -1) {
            calendar.roll(12, -calendar.get(12));
        }
        if (!Pattern.compile("[hKkH]").matcher(str).find()) {
            calendar.roll(11, -calendar.get(11));
        }
        if (!Pattern.compile("[uEFdD]").matcher(str).find()) {
            calendar.set(5, 1);
        }
        if (!Pattern.compile("[MDw]").matcher(str).find()) {
            calendar.set(2, 0);
        }
    }
}
