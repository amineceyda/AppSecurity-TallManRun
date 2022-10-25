package com.tencent.beacon.event.immediate;

public class Beacon2MsfTransferArgs extends BeaconTransferArgs {

    /* renamed from: d  reason: collision with root package name */
    private String f716d = "trpc.Beacon.BeaconLogServerLC.blslongconnection.SsoProcess";

    public Beacon2MsfTransferArgs(byte[] bArr) {
        super(bArr);
    }

    public String getCommand() {
        return this.f716d;
    }

    public void setCommand(String str) {
        this.f716d = str;
    }
}
