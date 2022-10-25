package g.c.a.e.h.a;

import android.text.TextUtils;
import com.apkpure.aegon.application.RealApplicationLike;
import com.apkpure.components.clientchannel.channel.headers.UserInfo;
import com.ola.qsea.sdk.IAsyncQseaListener;
import com.ola.qsea.sdk.Qsea;
import com.tencent.beacon.event.open.BeaconReport;
import g.e.b.l.i;
import g.e.b.l.j.k.d;
import g.e.b.l.j.k.k;
import java.util.Objects;
import org.slf4j.Logger;

public final /* synthetic */ class a implements IAsyncQseaListener {
    public static final /* synthetic */ a a = new a();

    public final void onQseaDispatch(Qsea qsea) {
        boolean z;
        Logger logger = d.a;
        BeaconReport.getInstance().setQimei(qsea.getQsea16(), qsea.getQsea36());
        h a2 = h.a();
        String qsea16 = qsea.getQsea16();
        String qsea36 = qsea.getQsea36();
        a2.a = a2.e("key_qimei_cache", a2.b(), qsea16);
        a2.b = a2.e("key_qimei_36_cache", a2.c(), qsea36);
        if (RealApplicationLike.getChannelConfig() != null) {
            g.c.a.e.f.a.a channelConfig = RealApplicationLike.getChannelConfig();
            String qsea362 = qsea.getQsea36();
            UserInfo userInfo = channelConfig.m().getUserInfo();
            if (qsea362 == null) {
                qsea362 = "";
            }
            userInfo.setQimei(qsea362);
        }
        String qsea363 = qsea.getQsea36();
        d.a.info("get qimei: {}", (Object) qsea363);
        if (!TextUtils.isEmpty(qsea363)) {
            k kVar = i.a().a.f3475f.f3521d;
            Objects.requireNonNull(kVar);
            String b = d.b(qsea363, 1024);
            synchronized (kVar.f3540f) {
                String reference = kVar.f3540f.getReference();
                if (b == null) {
                    z = reference == null;
                } else {
                    z = b.equals(reference);
                }
                if (!z) {
                    kVar.f3540f.set(b, true);
                    kVar.b.b(new g.e.b.l.j.k.a(kVar));
                }
            }
        }
    }
}
