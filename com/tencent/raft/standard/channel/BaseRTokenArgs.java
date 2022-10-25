package com.tencent.raft.standard.channel;

public class BaseRTokenArgs {
    private byte[] openId;
    private byte[] token;
    private int tokenType;

    public BaseRTokenArgs() {
    }

    public BaseRTokenArgs(int i2, byte[] bArr, byte[] bArr2) {
        this.tokenType = i2;
        this.token = bArr;
        this.openId = bArr2;
    }

    public byte[] getOpenId() {
        return this.openId;
    }

    public byte[] getToken() {
        return this.token;
    }

    public int getTokenType() {
        return this.tokenType;
    }

    public void setOpenId(byte[] bArr) {
        this.openId = bArr;
    }

    public void setToken(byte[] bArr) {
        this.token = bArr;
    }

    public void setTokenType(int i2) {
        this.tokenType = i2;
    }
}
