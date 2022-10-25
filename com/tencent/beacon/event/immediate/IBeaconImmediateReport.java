package com.tencent.beacon.event.immediate;

public interface IBeaconImmediateReport {
    void reportImmediate(BeaconTransferArgs beaconTransferArgs, BeaconImmediateReportCallback beaconImmediateReportCallback);
}
