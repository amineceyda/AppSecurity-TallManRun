package g.i.a.a.e;

import com.tencent.assistant.alive.api.IKeepAliveService;
import com.tencent.assistant.alive.db.jni.MemFileJniApi;
import com.tencent.raft.raftframework.RAFT;
import java.io.File;

public class a {
    public static final String a = String.format("daemon2_v%s.bin", new Object[]{"2.1.5"});

    public static MemFileJniApi a(String str) {
        return new MemFileJniApi(new File(g.h.a.a.B(((IKeepAliveService) RAFT.get(IKeepAliveService.class)).c().a, "qdalive_2.1.5"), str).getAbsolutePath());
    }

    public static void b(boolean z) {
        MemFileJniApi.writeBool(a("front_status").a, z);
    }
}
