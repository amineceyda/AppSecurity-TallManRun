package g.e.b.l.j.p;

import android.content.SharedPreferences;
import android.util.Log;
import g.e.a.b.g.e;
import g.e.a.b.g.f;
import g.e.a.b.g.g;
import g.e.b.l.j.j.l;
import g.e.b.l.j.m.b;
import g.e.b.l.j.p.k.a;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public class d implements e<Void, Void> {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    public f a(Object obj) throws Exception {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void voidR = (Void) obj;
        e eVar = this.a;
        a aVar = eVar.f3699f;
        g.e.b.l.j.p.j.f fVar = eVar.b;
        Objects.requireNonNull(aVar);
        FileWriter fileWriter2 = null;
        try {
            Map<String, String> c = aVar.c(fVar);
            b bVar = aVar.b;
            String str = aVar.a;
            Objects.requireNonNull(bVar);
            g.e.b.l.j.m.a aVar2 = new g.e.b.l.j.m.a(str, c);
            aVar2.c.put("User-Agent", "Crashlytics Android SDK/18.2.9");
            aVar2.c.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            aVar.a(aVar2, fVar);
            g.e.b.l.j.f fVar2 = g.e.b.l.j.f.a;
            fVar2.b("Requesting settings from " + aVar.a);
            fVar2.e("Settings query params were: " + c);
            jSONObject = aVar.d(aVar2.b());
        } catch (IOException e2) {
            if (g.e.b.l.j.f.a.a(6)) {
                Log.e("FirebaseCrashlytics", "Settings request failed.", e2);
            }
            jSONObject = null;
        }
        if (jSONObject != null) {
            g.e.b.l.j.p.j.e a2 = this.a.c.a(jSONObject);
            a aVar3 = this.a.f3698e;
            long j2 = a2.f3703d;
            Objects.requireNonNull(aVar3);
            g.e.b.l.j.f.a.e("Writing settings to cache file...");
            try {
                jSONObject.put("expires_at", j2);
                fileWriter = new FileWriter(aVar3.a);
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                fileWriter = null;
                try {
                    try {
                        if (g.e.b.l.j.f.a.a(6)) {
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        }
                        l.a(fileWriter, "Failed to close settings writer.");
                        this.a.c(jSONObject, "Loaded settings: ");
                        e eVar2 = this.a;
                        String str2 = eVar2.b.f3706f;
                        SharedPreferences.Editor edit = l.g(eVar2.a).edit();
                        edit.putString("existing_instance_identifier", str2);
                        edit.apply();
                        this.a.f3701h.set(a2);
                        this.a.f3702i.get().b(a2.a);
                        g gVar = new g();
                        gVar.b(a2.a);
                        this.a.f3702i.set(gVar);
                        return g.e.a.b.b.h.e.h(null);
                    } catch (Throwable th) {
                        th = th;
                        l.a(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    fileWriter = fileWriter2;
                    l.a(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                l.a(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            l.a(fileWriter, "Failed to close settings writer.");
            this.a.c(jSONObject, "Loaded settings: ");
            e eVar22 = this.a;
            String str22 = eVar22.b.f3706f;
            SharedPreferences.Editor edit2 = l.g(eVar22.a).edit();
            edit2.putString("existing_instance_identifier", str22);
            edit2.apply();
            this.a.f3701h.set(a2);
            this.a.f3702i.get().b(a2.a);
            g gVar2 = new g();
            gVar2.b(a2.a);
            this.a.f3702i.set(gVar2);
        }
        return g.e.a.b.b.h.e.h(null);
    }
}
