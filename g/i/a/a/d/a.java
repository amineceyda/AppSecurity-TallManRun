package g.i.a.a.d;

import android.text.TextUtils;
import com.tencent.assistant.alive.api.IKeepAliveService;
import com.tencent.assistant.alive.db.ISettingService;
import com.tencent.assistant.alive.db.jni.MemFileJniApi;
import com.tencent.raft.raftannotation.RServiceImpl;
import com.tencent.raft.raftframework.RAFT;
import g.i.a.a.a.b;
import java.util.HashMap;
import java.util.Map;

@RServiceImpl(bindInterface = {ISettingService.class})
public class a implements ISettingService {
    public Map<String, MemFileJniApi> a = new HashMap();

    public byte[] a(String str) {
        MemFileJniApi b = b(str);
        if (b == null) {
            return null;
        }
        return MemFileJniApi.readString(b.a).getBytes();
    }

    public final MemFileJniApi b(String str) {
        MemFileJniApi memFileJniApi = this.a.get(str);
        b c = ((IKeepAliveService) RAFT.get(IKeepAliveService.class)).c();
        if (c == null) {
            g.i.a.a.m.a.c("ISettingService", 6, "keepAliveConfig is null", (Throwable) null);
            return null;
        } else if (memFileJniApi != null) {
            return memFileJniApi;
        } else {
            MemFileJniApi memFileJniApi2 = new MemFileJniApi(g.h.a.a.B(c.a, str));
            this.a.put(str, memFileJniApi2);
            return memFileJniApi2;
        }
    }

    public long getLong(String str, long j2) {
        MemFileJniApi b = b(str);
        if (b == null) {
            return j2;
        }
        String a2 = b.a();
        if (TextUtils.isEmpty(a2)) {
            return j2;
        }
        try {
            return Long.valueOf(a2).longValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return j2;
        }
    }

    public boolean putLong(String str, long j2) {
        g.i.a.a.m.a.a("ISettingService", str + "|" + j2);
        MemFileJniApi b = b(str);
        if (b == null) {
            return false;
        }
        return MemFileJniApi.writeString(b.a, String.valueOf(j2));
    }
}
