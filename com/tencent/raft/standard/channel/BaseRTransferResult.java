package com.tencent.raft.standard.channel;

import java.util.Map;

public class BaseRTransferResult {
    private int businessCode;
    private String businessMessage;
    private byte[] data;
    public Map<String, String> extraDictionary;
    private int sdkCode;
    private String sdkMessage;
    private int serverCode;

    public BaseRTransferResult() {
    }

    public BaseRTransferResult(int i2, int i3, byte[] bArr, String str) {
        this.sdkCode = i2;
        this.businessCode = i3;
        this.data = bArr;
        this.businessMessage = str;
    }

    public int getBusinessCode() {
        return this.businessCode;
    }

    public String getBusinessMessage() {
        return this.businessMessage;
    }

    public byte[] getData() {
        return this.data;
    }

    public Map<String, String> getExtraDictionary() {
        return this.extraDictionary;
    }

    public int getSdkCode() {
        return this.sdkCode;
    }

    public String getSdkMessage() {
        return this.sdkMessage;
    }

    public int getServerCode() {
        return this.serverCode;
    }

    public void setBusinessCode(int i2) {
        this.businessCode = i2;
    }

    public void setBusinessMessage(String str) {
        this.businessMessage = str;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setExtraDictionary(Map<String, String> map) {
        this.extraDictionary = map;
    }

    public void setSdkCode(int i2) {
        this.sdkCode = i2;
    }

    public void setSdkMessage(String str) {
        this.sdkMessage = str;
    }

    public void setServerCode(int i2) {
        this.serverCode = i2;
    }
}
