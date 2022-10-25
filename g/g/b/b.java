package g.g.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import g.g.a;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class b {
    public static final Logger a = LoggerFactory.getLogger("KeepLiveReportHelper");

    public static void a(Context context, long j2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("keepLiveFlag", 0).edit();
        long j3 = context.getSharedPreferences("keepLiveFlag", 0).getLong("oneDayKeepAliveTime", 0) + j2;
        a.debug("累加保活时长: {}", (Object) Long.valueOf(j3));
        edit.putLong("oneDayKeepAliveTime", j3);
        edit.apply();
    }

    public static long b(Context context) {
        return context.getSharedPreferences("keepLiveFlag", 0).getLong("keepLiveReportStartTime", 0);
    }

    public static void c(Context context, long j2) {
        List<Long> list = a.b;
        boolean z = true;
        if (j2 > list.get(list.size() - 1).longValue() * 20 || j2 < 100) {
            a.info("上报记录的值出错: {}", (Object) Long.valueOf(j2));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long b = currentTimeMillis - b(context);
        Logger logger = a;
        logger.debug("now:{}, start: {}, spendTime: {}, REPORT_PERIOD:{}", Long.valueOf(currentTimeMillis), Long.valueOf(b(context)), Long.valueOf(b), 86400);
        if (b >= 86400) {
            z = false;
        }
        logger.info("是否在保活的上报周期内: {}, AlivePeriod:{}", (Object) Boolean.valueOf(z), (Object) Long.valueOf(j2));
        if (!z) {
            d(context);
            long j3 = context.getSharedPreferences("keepLiveFlag", 0).getLong("oneDayKeepAliveTime", 0);
            if (j3 != 0) {
                new Handler().postDelayed(new a(j3), 1000);
            }
            logger.debug("重置保活时长");
            SharedPreferences.Editor edit = context.getSharedPreferences("keepLiveFlag", 0).edit();
            edit.putLong("oneDayKeepAliveTime", 0);
            edit.apply();
        }
        a(context, j2);
    }

    public static void d(Context context) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        SharedPreferences.Editor edit = context.getSharedPreferences("keepLiveFlag", 0).edit();
        edit.putLong("keepLiveReportStartTime", currentTimeMillis);
        edit.apply();
        a.info("记录周期时间为: {}", (Object) Long.valueOf(currentTimeMillis));
    }
}
