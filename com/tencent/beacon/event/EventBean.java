package com.tencent.beacon.event;

import java.io.Serializable;
import java.util.Map;

public final class EventBean implements Serializable {
    private static final long serialVersionUID = 1;
    private String apn;
    private String appKey;
    private byte[] byteValue;
    private long cid = -1;
    private String eventCode;
    private boolean eventResult = true;
    private long eventTime;
    private int eventType;
    private Map<String, String> eventValue;
    private String reserved;
    private String srcIp;
    private int valueType;

    public String getApn() {
        return this.apn;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public byte[] getByteValue() {
        return this.byteValue;
    }

    public long getCid() {
        return this.cid;
    }

    public String getEventCode() {
        return this.eventCode;
    }

    public boolean getEventResult() {
        return this.eventResult;
    }

    public long getEventTime() {
        return this.eventTime;
    }

    public int getEventType() {
        return this.eventType;
    }

    public Map<String, String> getEventValue() {
        return this.eventValue;
    }

    public String getReserved() {
        return this.reserved;
    }

    public String getSrcIp() {
        return this.srcIp;
    }

    public int getValueType() {
        return this.valueType;
    }

    public void setApn(String str) {
        this.apn = str;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setByteValue(byte[] bArr) {
        this.byteValue = bArr;
    }

    public void setCid(long j2) {
        this.cid = j2;
    }

    public void setEventCode(String str) {
        this.eventCode = str;
    }

    public void setEventResult(boolean z) {
        this.eventResult = z;
    }

    public void setEventTime(long j2) {
        this.eventTime = j2;
    }

    public void setEventType(int i2) {
        this.eventType = i2;
    }

    public void setEventValue(Map<String, String> map) {
        this.eventValue = map;
    }

    public void setReserved(String str) {
        this.reserved = str;
    }

    public void setSrcIp(String str) {
        this.srcIp = str;
    }

    public void setValueType(int i2) {
        this.valueType = i2;
    }
}
