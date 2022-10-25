package com.tencent.beacon.event.immediate;

public class Beacon2WnsTransferArgs extends BeaconTransferArgs {

    /* renamed from: d  reason: collision with root package name */
    private String f717d = "bls.longconnection";

    public Beacon2WnsTransferArgs(byte[] bArr) {
        super(bArr);
    }

    public String getCommand() {
        return this.f717d;
    }

    public void setCommand(String str) {
        this.f717d = str;
    }
}
