package com.tencent.raft.standard.channel;

import java.util.HashMap;

public class BaseRTransferArgs {
    private boolean businessBufUpFlag;
    private boolean businessBufferDownFlag;
    private byte[] businessData;
    private String command;
    private Object extra;
    private HashMap<String, String> extraMap = null;
    private boolean isAnonymous;
    private boolean isHighRealTimeReq;
    private boolean isSupportReentry;
    private boolean needCompress;
    private byte priority;
    private int retryCount;
    private int timeout;
    private BaseRTokenArgs tokenArgs;
    private long uid;

    public BaseRTransferArgs() {
    }

    public BaseRTransferArgs(boolean z, long j2, String str, byte[] bArr) {
        this.isAnonymous = z;
        this.uid = j2;
        this.command = str;
        this.businessData = bArr;
    }

    public byte[] getBusinessData() {
        return this.businessData;
    }

    public String getCommand() {
        return this.command;
    }

    public Object getExtra() {
        return this.extra;
    }

    public HashMap<String, String> getExtraMap() {
        return this.extraMap;
    }

    public byte getPriority() {
        return this.priority;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public BaseRTokenArgs getTokenArgs() {
        return this.tokenArgs;
    }

    public long getUid() {
        return this.uid;
    }

    public boolean isAnonymous() {
        return this.isAnonymous;
    }

    public boolean isBusinessBufUpFlag() {
        return this.businessBufUpFlag;
    }

    public boolean isBusinessBufferDownFlag() {
        return this.businessBufferDownFlag;
    }

    public boolean isHighRealTimeReq() {
        return this.isHighRealTimeReq;
    }

    public boolean isNeedCompress() {
        return this.needCompress;
    }

    public boolean isSupportReentry() {
        return this.isSupportReentry;
    }

    public void setAnonymous(boolean z) {
        this.isAnonymous = z;
    }

    public void setBusinessBufUpFlag(boolean z) {
        this.businessBufUpFlag = z;
    }

    public void setBusinessBufferDownFlag(boolean z) {
        this.businessBufferDownFlag = z;
    }

    public void setBusinessData(byte[] bArr) {
        this.businessData = bArr;
    }

    public void setCommand(String str) {
        this.command = str;
    }

    public void setExtra(Object obj) {
        this.extra = obj;
    }

    public void setExtraMap(HashMap<String, String> hashMap) {
        this.extraMap = hashMap;
    }

    public void setHighRealTimeReq(boolean z) {
        this.isHighRealTimeReq = z;
    }

    public void setNeedCompress(boolean z) {
        this.needCompress = z;
    }

    public void setPriority(byte b) {
        this.priority = b;
    }

    public void setRetryCount(int i2) {
        this.retryCount = i2;
    }

    public void setSupportReentry(boolean z) {
        this.isSupportReentry = z;
    }

    public void setTimeout(int i2) {
        this.timeout = i2;
    }

    public void setTokenArgs(BaseRTokenArgs baseRTokenArgs) {
        this.tokenArgs = baseRTokenArgs;
    }

    public void setUid(long j2) {
        this.uid = j2;
    }
}
