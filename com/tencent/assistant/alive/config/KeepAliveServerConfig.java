package com.tencent.assistant.alive.config;

import android.os.Parcel;
import android.os.Parcelable;
import org.slf4j.helpers.MessageFormatter;

public class KeepAliveServerConfig implements Parcelable {
    public static final Parcelable.Creator<KeepAliveServerConfig> CREATOR = new a();
    public static final KeepAliveServerConfig DEFAULT_SERVER_CONFIG = new KeepAliveServerConfig(false, 10800000);
    public static final String KEY_ENABLE = "enable";
    public static final String KEY_SERVERCONFIG_TIME = "server_config_time";
    private boolean isEnable = false;
    private long serverConfigInteval = 0;

    public static class a implements Parcelable.Creator<KeepAliveServerConfig> {
        public Object createFromParcel(Parcel parcel) {
            return new KeepAliveServerConfig(parcel);
        }

        public Object[] newArray(int i2) {
            return new KeepAliveServerConfig[i2];
        }
    }

    public KeepAliveServerConfig(Parcel parcel) {
        boolean z = false;
        this.isEnable = parcel.readByte() != 0 ? true : z;
        this.serverConfigInteval = parcel.readLong();
    }

    public KeepAliveServerConfig(boolean z, long j2) {
        this.isEnable = z;
        this.serverConfigInteval = j2;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder i2 = g.a.a.a.a.i("KeepAliveServerConfig{isEnable=");
        i2.append(this.isEnable);
        i2.append(", serverConfigInteval=");
        i2.append(this.serverConfigInteval);
        i2.append(MessageFormatter.DELIM_STOP);
        return i2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.isEnable ? (byte) 1 : 0);
        parcel.writeLong(this.serverConfigInteval);
    }
}
