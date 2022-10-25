package com.tencent.raft.standard.report;

public interface IRReport {
    boolean report(BaseEvent baseEvent);

    boolean reportToBeacon(String str, BaseEvent baseEvent);
}
