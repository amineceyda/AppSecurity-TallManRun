package com.tencent.beacon.event.immediate;

import org.slf4j.helpers.MessageFormatter;

public class BeaconTransferResult {
    private int a;
    private int b;
    private byte[] c;

    /* renamed from: d  reason: collision with root package name */
    private String f719d;

    public byte[] getBizBuffer() {
        return this.c;
    }

    public int getBizCode() {
        return this.b;
    }

    public String getBizMsg() {
        return this.f719d;
    }

    public int getCode() {
        return this.a;
    }

    public void setBizBuffer(byte[] bArr) {
        this.c = bArr;
    }

    public void setBizCode(int i2) {
        this.b = i2;
    }

    public void setBizMsg(String str) {
        this.f719d = str;
    }

    public void setCode(int i2) {
        this.a = i2;
    }

    public String toString() {
        return "BeaconTransferResult{" + "returnCode=" + this.a + ", bizReturnCode=" + this.b + ", bizMsg='" + this.f719d + '\'' + MessageFormatter.DELIM_STOP;
    }
}
