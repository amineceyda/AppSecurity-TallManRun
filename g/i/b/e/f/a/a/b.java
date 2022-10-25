package g.i.b.e.f.a.a;

import com.tencent.raft.codegenmeta.utils.Constants;
import g.i.b.e.b.e;
import g.i.b.e.c;
import g.i.b.e.f.c.b.d;
import g.i.b.e.f.f;
import g.i.b.e.f.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends g.i.b.e.f.a.b implements f {
    public d.f b = new d.f("HttpSchedulerClient");
    public e.b c;

    public static void d(e.b bVar, JSONArray jSONArray) {
        JSONArray jSONArray2;
        boolean z;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            JSONArray optJSONArray = jSONObject.optJSONArray("domains");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("iplist");
            JSONArray optJSONArray3 = jSONObject.optJSONArray("ipv6list");
            String optString = jSONObject.optString("schedulecode");
            int optInt = jSONObject.optInt("httpsport", 443);
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                boolean z2 = true;
                if (optJSONArray3 != null) {
                    int i3 = 0;
                    while (i3 < optJSONArray3.length()) {
                        try {
                            try {
                                JSONObject jSONObject2 = optJSONArray3.getJSONObject(i3);
                                String string = jSONObject2.getString("ip");
                                int i4 = jSONObject2.getInt("port");
                                int i5 = jSONObject2.getInt("type");
                                jSONArray2 = optJSONArray3;
                                try {
                                    g.i.b.e.b.b bVar2 = new g.i.b.e.b.b();
                                    z = z2;
                                    try {
                                        if (bVar2.a(string + Constants.KEY_INDEX_FILE_SEPARATOR + i4)) {
                                            bVar2.f4097d = (byte) i5;
                                            arrayList.add(bVar2);
                                            z2 = false;
                                            i3++;
                                            JSONArray jSONArray3 = jSONArray;
                                            optJSONArray3 = jSONArray2;
                                        }
                                    } catch (Throwable unused) {
                                    }
                                } catch (Throwable unused2) {
                                    z = z2;
                                    z2 = z;
                                    i3++;
                                    JSONArray jSONArray32 = jSONArray;
                                    optJSONArray3 = jSONArray2;
                                }
                            } catch (Throwable unused3) {
                                jSONArray2 = optJSONArray3;
                                z = z2;
                                z2 = z;
                                i3++;
                                JSONArray jSONArray322 = jSONArray;
                                optJSONArray3 = jSONArray2;
                            }
                            z2 = z;
                            i3++;
                            JSONArray jSONArray3222 = jSONArray;
                            optJSONArray3 = jSONArray2;
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            return;
                        }
                    }
                    boolean z3 = z2;
                }
                if (z2 && optJSONArray2 != null) {
                    for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                        try {
                            JSONObject jSONObject3 = optJSONArray2.getJSONObject(i6);
                            String string2 = jSONObject3.getString("ip");
                            int i7 = jSONObject3.getInt("port");
                            int i8 = jSONObject3.getInt("type");
                            g.i.b.e.b.b bVar3 = new g.i.b.e.b.b();
                            if (bVar3.a(string2 + Constants.KEY_INDEX_FILE_SEPARATOR + i7)) {
                                bVar3.f4097d = (byte) i8;
                                arrayList.add(bVar3);
                            }
                        } catch (Throwable unused4) {
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                        try {
                            e.c cVar = new e.c(optJSONArray.getString(i9), optString);
                            cVar.f4116d = optInt;
                            cVar.c.addAll(arrayList);
                            try {
                                bVar.b.put(cVar.a, cVar);
                            } catch (Throwable unused5) {
                            }
                        } catch (Throwable unused6) {
                            e.b bVar4 = bVar;
                        }
                    }
                }
            }
            e.b bVar5 = bVar;
        }
    }

    public final List<e.c> a() {
        e.b bVar = this.c;
        if (bVar == null || !bVar.a.equals(e.f4111f)) {
            c.n.post(new a(this));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, e.c> value : this.c.b.entrySet()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    public final void c(String str, byte[] bArr, String str2) {
        this.b.a(str, bArr);
        c.n.post(new a(this));
    }

    public final void c() {
        i.e().c.a();
    }
}
