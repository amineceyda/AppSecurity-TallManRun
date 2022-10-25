package g.c.a.e.h.a;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.apkpure.aegon.application.AegonApplication;
import com.ola.qsea.sdk.IQseaSDK;
import com.ola.qsea.sdk.QseaSDK;
import com.tencent.beacon.event.open.BeaconConfig;
import com.tencent.beacon.event.open.BeaconEvent;
import com.tencent.beacon.event.open.BeaconReport;
import com.tencent.beacon.event.open.EventResult;
import com.tencent.beacon.event.open.EventType;
import g.a.a.a.a;
import g.c.a.b.c.g;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class d {
    public static final Logger a = LoggerFactory.getLogger("BeaconApiLog");
    public static volatile boolean b = false;

    public static void a() {
        BeaconReport instance = BeaconReport.getInstance();
        Logger logger = g.a;
        instance.setChannelID("");
        String b2 = g.b();
        if (!TextUtils.isEmpty(b2)) {
            BeaconReport.getInstance().setAppVersion(b2);
        }
        Application application = AegonApplication.getApplication();
        BeaconConfig.Builder builder = BeaconConfig.builder();
        builder.setIsSocketMode(false).setHttpAdapter(new f()).setUploadHost("svibeacon.onezapp.com").setModel(Build.MODEL).pagePathEnable(false);
        BeaconConfig build = builder.build();
        h a2 = h.a();
        Application application2 = AegonApplication.getApplication();
        a aVar = a.a;
        Objects.requireNonNull(a2);
        IQseaSDK instance2 = QseaSDK.getInstance("0AND02Z8WN41BWCA");
        QseaSDK.getInstance("0AND02Z8WN41BWCA").getStrategy().enableIMEI(true).enableIMSI(true).enableAndroidId(true).enableMAC(true).enableCid(true).enableProcessInfo(true);
        instance2.getStrategy().enableAudit(true);
        instance2.setLogAble(false).setChannelID("").init(application2);
        instance2.getQsea(aVar);
        BeaconReport.getInstance().start(application, "0AND02Z8WN41BWCA", build);
        BeaconReport.getInstance().setLogAble(false);
        b = true;
    }

    public static void b(g gVar) {
        EventResult eventResult;
        if (gVar != null) {
            try {
                EventType eventType = gVar.f1984d ? EventType.REALTIME : EventType.NORMAL;
                String str = gVar.a;
                eventResult = BeaconReport.getInstance().report(BeaconEvent.builder().withCode(str).withParams(gVar.b).withIsSucceed(gVar.c).withType(eventType).build());
            } catch (Throwable th) {
                a.error("onUserAction Exception", th);
                eventResult = new EventResult(EventResult.ERROR_CODE_OFFER_FAIL, 0, th.getMessage());
            }
            Logger logger = a;
            StringBuilder i2 = a.i("userActionReport EventResult{ eventID:");
            i2.append(eventResult.eventID);
            i2.append(", errorCode: ");
            i2.append(eventResult.errorCode);
            i2.append(", errorMsg: ");
            i2.append(eventResult.errMsg);
            i2.append("}");
            logger.debug(i2.toString());
        }
    }
}
