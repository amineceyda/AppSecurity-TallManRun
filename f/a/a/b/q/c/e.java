package f.a.a.b.q.c;

import ch.qos.logback.core.joran.spi.JoranException;
import f.a.a.b.d;
import f.a.a.b.w.c;
import f.a.a.b.x.h;
import g.a.a.a.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.sax2.Driver;

public class e extends DefaultHandler implements c {
    public final f.a.a.b.w.e b;
    public List<d> c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public Locator f1733d;

    /* renamed from: e  reason: collision with root package name */
    public f.a.a.b.q.d.e f1734e = new f.a.a.b.q.d.e();

    public e(d dVar) {
        this.b = new f.a.a.b.w.e(dVar, this);
    }

    public final void b(String str, Throwable th) throws JoranException {
        this.b.c(str, th);
        throw new JoranException(str, th);
    }

    public void c(String str, Throwable th) {
        this.b.c(str, th);
    }

    public void characters(char[] cArr, int i2, int i3) {
        String str = new String(cArr, i2, i3);
        d dVar = this.c.isEmpty() ? null : this.c.get(this.c.size() - 1);
        if (dVar instanceof a) {
            a aVar = (a) dVar;
            aVar.f1731e = a.f(new StringBuilder(), aVar.f1731e, str);
            return;
        }
        if (!(str.trim().length() == 0)) {
            this.c.add(new a(str, this.f1733d));
        }
    }

    public void endElement(String str, String str2, String str3) {
        if (str3 == null || str3.length() == 0) {
            str3 = str2;
        }
        this.c.add(new b(str, str2, str3, this.f1733d));
        f.a.a.b.q.d.e eVar = this.f1734e;
        if (!eVar.a.isEmpty()) {
            ArrayList<String> arrayList = eVar.a;
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public void error(SAXParseException sAXParseException) throws SAXException {
        StringBuilder i2 = a.i("XML_PARSING - Parsing error on line ");
        i2.append(sAXParseException.getLineNumber());
        i2.append(" and column ");
        i2.append(sAXParseException.getColumnNumber());
        this.b.c(i2.toString(), sAXParseException);
    }

    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        StringBuilder i2 = a.i("XML_PARSING - Parsing fatal error on line ");
        i2.append(sAXParseException.getLineNumber());
        i2.append(" and column ");
        i2.append(sAXParseException.getColumnNumber());
        this.b.c(i2.toString(), sAXParseException);
    }

    public void g(d dVar) {
        this.b.g(dVar);
    }

    public List<d> h(InputSource inputSource) throws JoranException {
        try {
            Driver driver = new Driver();
            try {
                driver.setFeature("http://xml.org/sax/features/validation", false);
            } catch (SAXNotSupportedException unused) {
            }
            driver.setFeature("http://xml.org/sax/features/namespaces", true);
            try {
                driver.setContentHandler(this);
                driver.setErrorHandler(this);
                driver.parse(inputSource);
                return this.c;
            } catch (EOFException e2) {
                b(e2.getLocalizedMessage(), new SAXParseException(e2.getLocalizedMessage(), this.f1733d, e2));
                throw null;
            } catch (IOException e3) {
                this.b.c("I/O error occurred while parsing xml file", e3);
                throw new JoranException("I/O error occurred while parsing xml file", e3);
            } catch (SAXException e4) {
                throw new JoranException("Problem parsing XML document. See previously reported errors.", e4);
            } catch (Exception e5) {
                this.b.c("Unexpected exception while parsing XML document.", e5);
                throw new JoranException("Unexpected exception while parsing XML document.", e5);
            }
        } catch (Exception e6) {
            this.b.c("Parser configuration error occurred", e6);
            throw new JoranException("Parser configuration error occurred", e6);
        }
    }

    public void setDocumentLocator(Locator locator) {
        this.f1733d = locator;
    }

    public void startDocument() {
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        String str4 = (str3 == null || str3.length() == 0) ? str2 : str3;
        this.f1734e.a.add((str2 == null || str2.length() < 1) ? str4 : str2);
        this.c.add(new f(this.f1734e.a(), str, str2, str4, attributes, this.f1733d));
    }

    public void warning(SAXParseException sAXParseException) throws SAXException {
        StringBuilder i2 = a.i("XML_PARSING - Parsing warning on line ");
        i2.append(sAXParseException.getLineNumber());
        i2.append(" and column ");
        i2.append(sAXParseException.getColumnNumber());
        String sb = i2.toString();
        f.a.a.b.w.e eVar = this.b;
        Objects.requireNonNull(eVar);
        eVar.h(new h(sb, eVar.i(), sAXParseException));
    }
}
