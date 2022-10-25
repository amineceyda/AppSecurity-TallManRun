package com.ola.qsea.i;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class a<T> implements c<T> {
    public com.ola.qsea.g.a<?>[] a;

    public a(com.ola.qsea.g.a<?>... aVarArr) {
        this.a = aVarArr;
    }

    public String a(String str, com.ola.qsea.g.a<?>... aVarArr) {
        if (str != null && !str.isEmpty() && aVarArr.length >= 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                for (int i2 = 0; i2 < aVarArr.length && jSONObject != null; i2++) {
                    com.ola.qsea.g.a<?> aVar = aVarArr[i2];
                    if (aVar == aVarArr[aVarArr.length - 1]) {
                        return jSONObject.optString(aVar.b());
                    }
                    jSONObject = jSONObject.optJSONObject(aVar.b());
                }
                return "";
            } catch (JSONException e2) {
                com.ola.qsea.m.a.b("error json: %s", str);
                e2.printStackTrace();
            }
        }
        return "";
    }

    public com.ola.qsea.g.a<?>[] a(com.ola.qsea.g.a<?> aVar) {
        com.ola.qsea.g.a<?>[] aVarArr = this.a;
        int length = aVarArr.length + 1;
        com.ola.qsea.g.a<?>[] aVarArr2 = new com.ola.qsea.g.a[length];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
        aVarArr2[length - 1] = aVar;
        return aVarArr2;
    }
}
