package g.c.a.j.a;

import com.apkpure.aegon.person.activity.InnerFeedBackActivity;
import g.c.a.i.a;
import i.o.c.h;
import java.util.List;

public final class c implements a {
    public void a(List<String> list, boolean z, int i2) {
        h.e(list, "grantPermissions");
        InnerFeedBackActivity.t.info("获取成功");
    }

    public void b(List<String> list, boolean z, int i2) {
        h.e(list, "grantPermissions");
        InnerFeedBackActivity.t.info("获取失败");
    }
}
