package f.a.a.b.q.b;

import com.tencent.raft.codegenmeta.utils.Constants;
import e.e.f.b;
import f.a.a.b.q.d.i;
import f.a.a.b.z.f;
import f.a.a.b.z.m;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;

public class q extends b {
    public void s(i iVar, String str, Attributes attributes) {
        String str2;
        String w;
        StringBuilder sb;
        String str3;
        StringBuilder sb2;
        String str4;
        i iVar2 = iVar;
        Attributes attributes2 = attributes;
        if ("substitutionProperty".equals(str)) {
            p("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        String value = attributes2.getValue("name");
        String value2 = attributes2.getValue("value");
        c y = b.y(attributes2.getValue(Constants.Service.SCOPE));
        int i2 = 0;
        boolean z = true;
        if (!b.s(attributes2.getValue("file")) && b.s(attributes2.getValue("name")) && b.s(attributes2.getValue("value")) && b.s(attributes2.getValue("resource"))) {
            w = iVar2.w(attributes2.getValue("file"));
            try {
                w(iVar2, new FileInputStream(w), y);
            } catch (FileNotFoundException unused) {
                sb2 = new StringBuilder();
                str4 = "Could not find properties file [";
            } catch (IOException e2) {
                e = e2;
                sb = new StringBuilder();
                str3 = "Could not read properties file [";
                sb.append(str3);
                sb.append(w);
                sb.append("].");
                c(sb.toString(), e);
            }
        } else {
            if (!b.s(attributes2.getValue("resource")) && b.s(attributes2.getValue("name")) && b.s(attributes2.getValue("value")) && b.s(attributes2.getValue("file"))) {
                w = iVar2.w(attributes2.getValue("resource"));
                URL b = m.b(w);
                if (b == null) {
                    sb2 = new StringBuilder();
                    str4 = "Could not find resource [";
                    sb2.append(str4);
                    sb2.append(w);
                    sb2.append("].");
                    str2 = sb2.toString();
                    m(str2);
                }
                try {
                    w(iVar2, b.openStream(), y);
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder();
                    str3 = "Could not read resource file [";
                }
            } else {
                String value3 = attributes2.getValue("file");
                String value4 = attributes2.getValue("name");
                String value5 = attributes2.getValue("value");
                String value6 = attributes2.getValue("resource");
                if (b.s(value4) || b.s(value5) || !b.s(value3) || !b.s(value6)) {
                    z = false;
                }
                if (z) {
                    int length = value2.length();
                    StringBuilder sb3 = new StringBuilder(length);
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        char charAt = value2.charAt(i2);
                        if (charAt == '\\') {
                            int i4 = i3 + 1;
                            char charAt2 = value2.charAt(i3);
                            if (charAt2 == 'n') {
                                i2 = i4;
                                charAt = 10;
                            } else if (charAt2 == 'r') {
                                i2 = i4;
                                charAt = 13;
                            } else if (charAt2 == 't') {
                                i2 = i4;
                                charAt = 9;
                            } else if (charAt2 == 'f') {
                                i2 = i4;
                                charAt = 12;
                            } else {
                                i2 = i4;
                                charAt = charAt2;
                            }
                        } else {
                            i2 = i3;
                        }
                        sb3.append(charAt);
                    }
                    b.v(iVar2, value, iVar2.w(sb3.toString().trim()), y);
                    return;
                }
                str2 = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";
                m(str2);
            }
        }
    }

    public void u(i iVar, String str) {
    }

    public void w(i iVar, InputStream inputStream, c cVar) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        inputStream.close();
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            for (String str : properties.keySet()) {
                String property = properties.getProperty(str);
                if (!(str == null || property == null)) {
                    iVar.f1741g.put(str, property.trim());
                }
            }
        } else if (ordinal == 1) {
            f fVar = new f(iVar.c);
            for (String str2 : properties.keySet()) {
                fVar.c.h(str2, properties.getProperty(str2));
            }
        } else if (ordinal == 2) {
            for (String str3 : properties.keySet()) {
                b.w(iVar, str3, properties.getProperty(str3));
            }
        }
    }
}
