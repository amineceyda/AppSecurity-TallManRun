package com.tencent.beacon.base.net.a;

import android.text.TextUtils;
import com.tencent.beacon.base.net.call.JceRequestEntity;
import com.tencent.beacon.e.g;
import com.tencent.beacon.pack.SocketRequestPackage;
import java.util.Map;

public final class d implements c<JceRequestEntity, SocketRequestPackage> {
    private Map<String, String> b(JceRequestEntity jceRequestEntity) {
        Map<String, String> header = jceRequestEntity.getHeader();
        if (!header.containsKey("sid")) {
            String c = g.b().c();
            if (!TextUtils.isEmpty(c)) {
                header.put("sid", c);
            }
        }
        return header;
    }

    public SocketRequestPackage a(JceRequestEntity jceRequestEntity) {
        return new SocketRequestPackage(b(jceRequestEntity), jceRequestEntity.getContent());
    }
}
