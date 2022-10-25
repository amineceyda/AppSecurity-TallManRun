package com.google.android.datatransport.cct;

import com.tencent.raft.measure.utils.MeasureConst;
import g.c.b.b.f;
import g.e.a.a.a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class CCTDestination {
    public static final String c = f.X("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d  reason: collision with root package name */
    public static final String f353d = f.X("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");

    /* renamed from: e  reason: collision with root package name */
    public static final String f354e = f.X("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f  reason: collision with root package name */
    public static final Set<a> f355f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new a[]{new a("proto"), new a("json")})));
    public final String a;
    public final String b;

    public CCTDestination(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static CCTDestination a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(MeasureConst.CHARSET_UTF8));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new CCTDestination(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public byte[] b() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(MeasureConst.CHARSET_UTF8));
    }
}
