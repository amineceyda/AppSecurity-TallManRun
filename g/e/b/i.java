package g.e.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import g.c.b.b.f;
import g.e.a.b.b.h.g;
import java.util.Arrays;
import java.util.Objects;

public final class i {
    public final String a;
    public final String b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f3449d;

    /* renamed from: e  reason: collision with root package name */
    public final String f3450e;

    /* renamed from: f  reason: collision with root package name */
    public final String f3451f;

    /* renamed from: g  reason: collision with root package name */
    public final String f3452g;

    public i(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        f.r(!g.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.f3449d = str4;
        this.f3450e = str5;
        this.f3451f = str6;
        this.f3452g = str7;
    }

    public static i a(Context context) {
        Objects.requireNonNull(context, "null reference");
        Resources resources = context.getResources();
        String resourcePackageName = resources.getResourcePackageName(2131820813);
        int identifier = resources.getIdentifier("google_app_id", "string", resourcePackageName);
        String str = null;
        String string = identifier == 0 ? null : resources.getString(identifier);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        int identifier2 = resources.getIdentifier("google_api_key", "string", resourcePackageName);
        String string2 = identifier2 == 0 ? null : resources.getString(identifier2);
        int identifier3 = resources.getIdentifier("firebase_database_url", "string", resourcePackageName);
        String string3 = identifier3 == 0 ? null : resources.getString(identifier3);
        int identifier4 = resources.getIdentifier("ga_trackingId", "string", resourcePackageName);
        String string4 = identifier4 == 0 ? null : resources.getString(identifier4);
        int identifier5 = resources.getIdentifier("gcm_defaultSenderId", "string", resourcePackageName);
        String string5 = identifier5 == 0 ? null : resources.getString(identifier5);
        int identifier6 = resources.getIdentifier("google_storage_bucket", "string", resourcePackageName);
        String string6 = identifier6 == 0 ? null : resources.getString(identifier6);
        int identifier7 = resources.getIdentifier("project_id", "string", resourcePackageName);
        if (identifier7 != 0) {
            str = resources.getString(identifier7);
        }
        return new i(string, string2, string3, string4, string5, string6, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return f.y(this.b, iVar.b) && f.y(this.a, iVar.a) && f.y(this.c, iVar.c) && f.y(this.f3449d, iVar.f3449d) && f.y(this.f3450e, iVar.f3450e) && f.y(this.f3451f, iVar.f3451f) && f.y(this.f3452g, iVar.f3452g);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.f3449d, this.f3450e, this.f3451f, this.f3452g});
    }

    public String toString() {
        g.e.a.b.b.f.g gVar = new g.e.a.b.b.f.g(this);
        gVar.a("applicationId", this.b);
        gVar.a("apiKey", this.a);
        gVar.a("databaseUrl", this.c);
        gVar.a("gcmSenderId", this.f3450e);
        gVar.a("storageBucket", this.f3451f);
        gVar.a("projectId", this.f3452g);
        return gVar.toString();
    }
}
