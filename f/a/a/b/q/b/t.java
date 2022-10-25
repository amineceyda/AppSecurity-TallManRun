package f.a.a.b.q.b;

import ch.qos.logback.core.joran.spi.ActionException;
import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.f.b;
import f.a.a.b.q.d.i;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.xml.sax.Attributes;

public class t extends b {

    /* renamed from: e  reason: collision with root package name */
    public boolean f1730e = false;

    public void s(i iVar, String str, Attributes attributes) throws ActionException {
        long j2;
        String value = attributes.getValue("key");
        if (b.s(value)) {
            m("Attribute named [key] cannot be empty");
            this.f1730e = true;
        }
        String value2 = attributes.getValue("datePattern");
        if (b.s(value2)) {
            m("Attribute named [datePattern] cannot be empty");
            this.f1730e = true;
        }
        if ("contextBirth".equalsIgnoreCase(attributes.getValue("timeReference"))) {
            n("Using context birth as time reference.");
            j2 = this.c.b;
        } else {
            j2 = System.currentTimeMillis();
            n("Using current interpretation time, i.e. now, as time reference.");
        }
        if (!this.f1730e) {
            c y = b.y(attributes.getValue(Constants.Service.SCOPE));
            String str2 = null;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(value2, Locale.US);
            if (j2 != -1) {
                str2 = simpleDateFormat.format(new Date(j2));
            }
            n("Adding property to the context with key=\"" + value + "\" and value=\"" + str2 + "\" to the " + y + " scope");
            b.v(iVar, value, str2, y);
        }
    }

    public void u(i iVar, String str) throws ActionException {
    }
}
