package com.tencent.raft.measure.config;

import com.tencent.raft.measure.log.ILogDelegate;
import java.util.concurrent.ScheduledExecutorService;

public class MeasureAppConfig {
    private ScheduledExecutorService executor;
    private boolean isDebug;
    private ILogDelegate logDelegate;

    public MeasureAppConfig(ILogDelegate iLogDelegate, boolean z, ScheduledExecutorService scheduledExecutorService) {
        this.logDelegate = iLogDelegate;
        this.isDebug = z;
        this.executor = scheduledExecutorService;
    }

    public ScheduledExecutorService getExecutor() {
        return this.executor;
    }

    public ILogDelegate getLogDelegate() {
        return this.logDelegate;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public MeasureAppConfig setDebug(boolean z) {
        this.isDebug = z;
        return this;
    }

    public MeasureAppConfig setExecutor(ScheduledExecutorService scheduledExecutorService) {
        this.executor = scheduledExecutorService;
        return this;
    }

    public MeasureAppConfig setLogDelegate(ILogDelegate iLogDelegate) {
        this.logDelegate = iLogDelegate;
        return this;
    }
}
