package g.i.a.a.c.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.assistant.alive.config.IServerConfigService;
import com.tencent.assistant.alive.config.KeepAliveServerConfig;
import com.tencent.assistant.alive.db.ISettingService;
import com.tencent.raft.raftannotation.RServiceImpl;
import com.tencent.raft.raftframework.RAFT;

@RServiceImpl(bindInterface = {IServerConfigService.class})
public class a implements IServerConfigService {
    public KeepAliveServerConfig a = null;

    public KeepAliveServerConfig a() {
        KeepAliveServerConfig keepAliveServerConfig = this.a;
        if (keepAliveServerConfig != null) {
            return keepAliveServerConfig;
        }
        byte[] a2 = ((ISettingService) RAFT.get(ISettingService.class)).a("key_srver_config");
        Parcelable.Creator<KeepAliveServerConfig> creator = KeepAliveServerConfig.CREATOR;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(a2, 0, a2.length);
        obtain.setDataPosition(0);
        KeepAliveServerConfig keepAliveServerConfig2 = (KeepAliveServerConfig) creator.createFromParcel(obtain);
        this.a = KeepAliveServerConfig.DEFAULT_SERVER_CONFIG;
        if (keepAliveServerConfig2 != null) {
            this.a = keepAliveServerConfig2;
        }
        g.i.a.a.m.a.a("ServerConfigService", String.format("getServerConfig from cache:%s", new Object[]{this.a.toString()}));
        return this.a;
    }
}
