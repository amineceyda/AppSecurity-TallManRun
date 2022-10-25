package g.a.a.a;

import android.net.Uri;
import android.util.Log;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.tencent.beacon.pack.a;
import g.e.a.b.b.h.e;
import g.e.a.b.e.c.l0;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: outline */
public class a {
    public static int a(String str, int i2, int i3) {
        return (str.hashCode() + i2) * i3;
    }

    public static a.C0009a b(com.tencent.beacon.pack.a aVar) {
        a.C0009a aVar2 = new a.C0009a();
        aVar.a(aVar2);
        return aVar2;
    }

    public static String c(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String d(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String e(StringBuilder sb, int i2, String str) {
        sb.append(i2);
        sb.append(str);
        return sb.toString();
    }

    public static String f(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String g(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String h(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder i(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder j(String str, int i2, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder k(String str, int i2, String str2, int i3, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static Object m(l0 l0Var, int i2, List list, int i3) {
        e.a0(l0Var.name(), i2, list);
        return list.get(i3);
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void o(String str, ViewParent viewParent, String str2, String str3, AbstractMethodError abstractMethodError) {
        Log.e(str3, str + viewParent + str2, abstractMethodError);
    }

    public static void p(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }

    public static String q(String str, int i2) {
        return str + i2;
    }

    public static String r(String str, int i2, String str2) {
        return str + i2 + str2;
    }

    public static String s(String str, long j2) {
        return str + j2;
    }

    public static String t(String str, Uri uri) {
        return str + uri;
    }

    public static String u(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String v(String str, Class cls) {
        return str + cls;
    }

    public static String w(String str, String str2) {
        return str + str2;
    }
}
