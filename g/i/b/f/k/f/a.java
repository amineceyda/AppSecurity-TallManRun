package g.i.b.f.k.f;

import android.text.TextUtils;
import com.tencent.raft.codegenmeta.utils.Constants;
import g.i.b.e.h.e;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static C0161a[] f4330f;

    /* renamed from: g  reason: collision with root package name */
    public static C0161a[] f4331g;
    public String a;
    public C0161a b;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4332d = false;

    /* renamed from: e  reason: collision with root package name */
    public String f4333e = "";

    /* renamed from: g.i.b.f.k.f.a$a  reason: collision with other inner class name */
    public enum C0161a {
        Type_Outer,
        Type_CDN_Domain,
        Type_CDN_Ip_App_Input,
        Type_CDN_Ip_Jumped,
        Type_CDN_Ip_Http_Header,
        Type_CDN_Ip_Socket_Schedule,
        Type_Src_Domain,
        Type_Src_Ip_App_Input,
        Type_Src_Ip_Jumped,
        Type_CDN_Ip_Socket_Schedule_Https,
        Type_CDN_Ip_User_Https
    }

    static {
        C0161a aVar = C0161a.Type_CDN_Ip_App_Input;
        C0161a aVar2 = C0161a.Type_CDN_Domain;
        C0161a aVar3 = C0161a.Type_CDN_Ip_Socket_Schedule;
        C0161a aVar4 = C0161a.Type_CDN_Ip_Http_Header;
        C0161a aVar5 = C0161a.Type_CDN_Ip_Socket_Schedule_Https;
        C0161a aVar6 = C0161a.Type_CDN_Ip_Jumped;
        C0161a aVar7 = C0161a.Type_Src_Ip_App_Input;
        C0161a aVar8 = C0161a.Type_Src_Ip_Jumped;
        C0161a aVar9 = C0161a.Type_Src_Domain;
        f4330f = new C0161a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
        f4331g = new C0161a[]{aVar3, aVar, aVar4, aVar6, aVar5, aVar2, aVar7, aVar8, aVar9};
    }

    public a(String str, C0161a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public static boolean b(C0161a aVar) {
        return aVar == C0161a.Type_CDN_Ip_App_Input || aVar == C0161a.Type_CDN_Ip_Http_Header || aVar == C0161a.Type_CDN_Ip_Socket_Schedule || aVar == C0161a.Type_CDN_Ip_Socket_Schedule_Https || aVar == C0161a.Type_Src_Ip_App_Input;
    }

    public final String a() {
        return !TextUtils.isEmpty(this.f4333e) ? this.f4333e : this.a;
    }

    public final String toString() {
        C0161a aVar = this.b;
        boolean z = aVar == C0161a.Type_CDN_Ip_Http_Header || aVar == C0161a.Type_CDN_Ip_Socket_Schedule || aVar == C0161a.Type_CDN_Ip_Socket_Schedule_Https || aVar == C0161a.Type_CDN_Ip_App_Input || aVar == C0161a.Type_Src_Ip_App_Input;
        return this.c + Constants.KEY_INDEX_FILE_SEPARATOR + this.b.ordinal() + Constants.KEY_INDEX_FILE_SEPARATOR + e.d(this.a, z);
    }
}
