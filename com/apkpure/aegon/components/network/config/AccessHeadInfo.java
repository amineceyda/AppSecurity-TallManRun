package com.apkpure.aegon.components.network.config;

import com.apkpure.components.clientchannel.channel.headers.DeviceInfo;
import com.apkpure.components.clientchannel.channel.headers.HostAppInfo;
import com.apkpure.components.clientchannel.channel.headers.NetInfo;
import com.apkpure.components.clientchannel.channel.headers.UserInfo;
import g.c.b.a.l.a;
import i.o.c.f;
import i.o.c.h;

public final class AccessHeadInfo {
    private final DeviceInfo deviceInfo;
    private HostAppInfo hostAppInfo;
    private NetInfo netInfo;
    private UserInfo userInfo;

    public AccessHeadInfo() {
        this((UserInfo) null, (NetInfo) null, (HostAppInfo) null, (DeviceInfo) null, 15, (f) null);
    }

    public AccessHeadInfo(UserInfo userInfo2, NetInfo netInfo2, HostAppInfo hostAppInfo2, DeviceInfo deviceInfo2) {
        h.e(userInfo2, "userInfo");
        h.e(netInfo2, "netInfo");
        h.e(hostAppInfo2, "hostAppInfo");
        h.e(deviceInfo2, "deviceInfo");
        this.userInfo = userInfo2;
        this.netInfo = netInfo2;
        this.hostAppInfo = hostAppInfo2;
        this.deviceInfo = deviceInfo2;
    }

    public /* synthetic */ AccessHeadInfo(UserInfo userInfo2, NetInfo netInfo2, HostAppInfo hostAppInfo2, DeviceInfo deviceInfo2, int i2, f fVar) {
        AccessHeadInfo accessHeadInfo;
        DeviceInfo deviceInfo3;
        UserInfo userInfo3 = (i2 & 1) != 0 ? new UserInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 511, (f) null) : userInfo2;
        NetInfo netInfo3 = (i2 & 2) != 0 ? new NetInfo((Integer) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, 63, (f) null) : netInfo2;
        HostAppInfo hostAppInfo3 = (i2 & 4) != 0 ? new HostAppInfo((String) null, (String) null, 0, (String) null, (String) null, (String) null, 63, (f) null) : hostAppInfo2;
        if ((i2 & 8) != 0) {
            deviceInfo3 = new DeviceInfo(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String[]) null, (String) null, (String) null, (String) null, 1023, (f) null);
            accessHeadInfo = this;
        } else {
            accessHeadInfo = this;
            deviceInfo3 = deviceInfo2;
        }
        new AccessHeadInfo(userInfo3, netInfo3, hostAppInfo3, deviceInfo3);
    }

    public static /* synthetic */ AccessHeadInfo copy$default(AccessHeadInfo accessHeadInfo, UserInfo userInfo2, NetInfo netInfo2, HostAppInfo hostAppInfo2, DeviceInfo deviceInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            userInfo2 = accessHeadInfo.userInfo;
        }
        if ((i2 & 2) != 0) {
            netInfo2 = accessHeadInfo.netInfo;
        }
        if ((i2 & 4) != 0) {
            hostAppInfo2 = accessHeadInfo.hostAppInfo;
        }
        if ((i2 & 8) != 0) {
            deviceInfo2 = accessHeadInfo.deviceInfo;
        }
        return accessHeadInfo.copy(userInfo2, netInfo2, hostAppInfo2, deviceInfo2);
    }

    public final UserInfo component1() {
        return this.userInfo;
    }

    public final NetInfo component2() {
        return this.netInfo;
    }

    public final HostAppInfo component3() {
        return this.hostAppInfo;
    }

    public final DeviceInfo component4() {
        return this.deviceInfo;
    }

    public final AccessHeadInfo copy(UserInfo userInfo2, NetInfo netInfo2, HostAppInfo hostAppInfo2, DeviceInfo deviceInfo2) {
        h.e(userInfo2, "userInfo");
        h.e(netInfo2, "netInfo");
        h.e(hostAppInfo2, "hostAppInfo");
        h.e(deviceInfo2, "deviceInfo");
        return new AccessHeadInfo(userInfo2, netInfo2, hostAppInfo2, deviceInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessHeadInfo)) {
            return false;
        }
        AccessHeadInfo accessHeadInfo = (AccessHeadInfo) obj;
        return h.a(this.userInfo, accessHeadInfo.userInfo) && h.a(this.netInfo, accessHeadInfo.netInfo) && h.a(this.hostAppInfo, accessHeadInfo.hostAppInfo) && h.a(this.deviceInfo, accessHeadInfo.deviceInfo);
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final HostAppInfo getHostAppInfo() {
        return this.hostAppInfo;
    }

    public final NetInfo getNetInfo() {
        return this.netInfo;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int hashCode = this.netInfo.hashCode();
        int hashCode2 = this.hostAppInfo.hashCode();
        return this.deviceInfo.hashCode() + ((hashCode2 + ((hashCode + (this.userInfo.hashCode() * 31)) * 31)) * 31);
    }

    public final void setHostAppInfo(HostAppInfo hostAppInfo2) {
        h.e(hostAppInfo2, "<set-?>");
        this.hostAppInfo = hostAppInfo2;
    }

    public final void setNetInfo(NetInfo netInfo2) {
        h.e(netInfo2, "<set-?>");
        this.netInfo = netInfo2;
    }

    public final void setUserInfo(UserInfo userInfo2) {
        h.e(userInfo2, "<set-?>");
        this.userInfo = userInfo2;
    }

    public final String toJson() {
        a aVar = a.a;
        return a.b(this);
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("AccessHeadInfo(userInfo=");
        i2.append(this.userInfo);
        i2.append(", netInfo=");
        i2.append(this.netInfo);
        i2.append(", hostAppInfo=");
        i2.append(this.hostAppInfo);
        i2.append(", deviceInfo=");
        i2.append(this.deviceInfo);
        i2.append(')');
        return i2.toString();
    }
}
