package f.a.a.b.s.k;

import ch.qos.logback.core.spi.ScanException;
import f.a.a.b.s.l.b;
import java.util.ArrayList;
import java.util.List;

public class h {
    public final String a;
    public final int b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public a f1785d = a.LITERAL_STATE;

    /* renamed from: e  reason: collision with root package name */
    public int f1786e = 0;

    public enum a {
        LITERAL_STATE,
        FORMAT_MODIFIER_STATE,
        KEYWORD_STATE,
        OPTION_STATE,
        RIGHT_PARENTHESIS_STATE
    }

    public h(String str, b bVar) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("null or empty pattern string not allowed");
        }
        this.a = str;
        this.b = str.length();
        this.c = bVar;
    }

    public final void a(int i2, StringBuffer stringBuffer, List<g> list) {
        if (stringBuffer.length() > 0) {
            list.add(new g(i2, stringBuffer.toString()));
            stringBuffer.setLength(0);
        }
    }

    public void b(String str, StringBuffer stringBuffer) {
        int i2 = this.f1786e;
        if (i2 < this.b) {
            String str2 = this.a;
            this.f1786e = i2 + 1;
            this.c.a(str, stringBuffer, str2.charAt(i2), this.f1786e);
        }
    }

    public List<g> c() throws ScanException {
        g gVar;
        a aVar;
        a aVar2;
        g gVar2;
        String str;
        a aVar3 = a.OPTION_STATE;
        a aVar4 = a.RIGHT_PARENTHESIS_STATE;
        a aVar5 = a.FORMAT_MODIFIER_STATE;
        a aVar6 = a.LITERAL_STATE;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            int i2 = this.f1786e;
            if (i2 < this.b) {
                char charAt = this.a.charAt(i2);
                this.f1786e++;
                int ordinal = this.f1785d.ordinal();
                if (ordinal == 0) {
                    if (charAt == '%') {
                        a(1000, stringBuffer, arrayList);
                        arrayList.add(g.f1784f);
                        aVar = aVar5;
                    } else if (charAt == ')') {
                        a(1000, stringBuffer, arrayList);
                        aVar = aVar4;
                    } else if (charAt != '\\') {
                        stringBuffer.append(charAt);
                    } else {
                        b("%()", stringBuffer);
                    }
                    this.f1785d = aVar;
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            String str2 = this.a;
                            int i3 = this.b;
                            StringBuffer stringBuffer2 = new StringBuffer();
                            ArrayList arrayList2 = new ArrayList();
                            char c2 = 0;
                            char c3 = 0;
                            while (true) {
                                if (this.f1786e < i3) {
                                    if (c3 == 0) {
                                        if (!(charAt == 9 || charAt == 10 || charAt == 13 || charAt == ' ')) {
                                            if (charAt != '\"' && charAt != '\'') {
                                                if (charAt != ',') {
                                                    if (charAt == '}') {
                                                        gVar2 = new g(1006, (List<String>) arrayList2);
                                                        break;
                                                    }
                                                    stringBuffer2.append(charAt);
                                                    c3 = 1;
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                c2 = charAt;
                                                c3 = 2;
                                            }
                                        }
                                    } else {
                                        if (c3 != 1) {
                                            if (c3 == 2) {
                                                if (charAt == c2) {
                                                    str = stringBuffer2.toString();
                                                    arrayList2.add(str);
                                                    stringBuffer2.setLength(0);
                                                    c3 = 0;
                                                } else if (charAt == '\\') {
                                                    String.valueOf(c2);
                                                    int i4 = this.f1786e;
                                                    if (i4 < i3) {
                                                        this.f1786e = i4 + 1;
                                                        char charAt2 = str2.charAt(i4);
                                                        stringBuffer2.append("\\");
                                                        stringBuffer2.append(charAt2);
                                                    }
                                                }
                                            }
                                        } else if (charAt != ',') {
                                            if (charAt == '}') {
                                                arrayList2.add(stringBuffer2.toString().trim());
                                                gVar2 = new g(1006, (List<String>) arrayList2);
                                                break;
                                            }
                                        } else {
                                            str = stringBuffer2.toString().trim();
                                            arrayList2.add(str);
                                            stringBuffer2.setLength(0);
                                            c3 = 0;
                                        }
                                        stringBuffer2.append(charAt);
                                    }
                                    charAt = str2.charAt(this.f1786e);
                                    this.f1786e++;
                                } else if (charAt == '}') {
                                    if (c3 != 0) {
                                        if (c3 == 1) {
                                            arrayList2.add(stringBuffer2.toString().trim());
                                        } else {
                                            throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
                                        }
                                    }
                                    gVar2 = new g(1006, (List<String>) arrayList2);
                                } else {
                                    throw new ScanException("Unexpected end of pattern string in OptionTokenizer");
                                }
                            }
                            arrayList.add(gVar2);
                            this.f1785d = aVar6;
                        } else if (ordinal == 4) {
                            arrayList.add(g.f1782d);
                            if (charAt != ')') {
                                if (charAt == '\\') {
                                    b("%{}", stringBuffer);
                                } else if (charAt != '{') {
                                    stringBuffer.append(charAt);
                                } else {
                                    this.f1785d = aVar3;
                                }
                                this.f1785d = aVar6;
                            }
                        }
                    } else if (Character.isJavaIdentifierPart(charAt)) {
                        stringBuffer.append(charAt);
                    } else {
                        if (charAt == '{') {
                            a(1004, stringBuffer, arrayList);
                            aVar2 = aVar3;
                        } else {
                            if (charAt == '(') {
                                a(1005, stringBuffer, arrayList);
                            } else {
                                a(1004, stringBuffer, arrayList);
                                if (charAt == '%') {
                                    arrayList.add(g.f1784f);
                                    aVar2 = aVar5;
                                } else if (charAt == ')') {
                                    aVar2 = aVar4;
                                } else if (charAt == '\\') {
                                    int i5 = this.f1786e;
                                    if (i5 < this.b) {
                                        String str3 = this.a;
                                        this.f1786e = i5 + 1;
                                        this.c.a("%()", stringBuffer, str3.charAt(i5), this.f1786e);
                                    }
                                } else {
                                    stringBuffer.append(charAt);
                                }
                            }
                            this.f1785d = aVar6;
                        }
                        this.f1785d = aVar2;
                    }
                } else if (charAt == '(') {
                    a(1002, stringBuffer, arrayList);
                    arrayList.add(g.f1783e);
                    this.f1785d = aVar6;
                } else {
                    if (Character.isJavaIdentifierStart(charAt)) {
                        a(1002, stringBuffer, arrayList);
                        this.f1785d = a.KEYWORD_STATE;
                    }
                    stringBuffer.append(charAt);
                }
            } else {
                int ordinal2 = this.f1785d.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            gVar = new g(1004, stringBuffer.toString());
                        } else if (ordinal2 != 3) {
                            if (ordinal2 == 4) {
                                gVar = g.f1782d;
                            }
                        }
                        arrayList.add(gVar);
                    }
                    throw new ScanException("Unexpected end of pattern string");
                }
                a(1000, stringBuffer, arrayList);
                return arrayList;
            }
        }
    }
}
