package com.tencent.raft.measure.config;

import com.tencent.raft.measure.log.DefaultLogDelegate;
import com.tencent.raft.measure.log.ILogDelegate;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class MeasureAppConfigBuilder {
    private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    private boolean isDebug = false;
    private ILogDelegate logDelegate = new DefaultLogDelegate();

    public MeasureAppConfig create() {
        return new MeasureAppConfig(this.logDelegate, this.isDebug, this.executor);
    }

    public MeasureAppConfigBuilder setExecutor(ScheduledExecutorService scheduledExecutorService) {
        this.executor = scheduledExecutorService;
        return this;
    }

    public MeasureAppConfigBuilder setIsDebug(boolean z) {
        this.isDebug = z;
        return this;
    }

    public MeasureAppConfigBuilder setLogDelegate(ILogDelegate iLogDelegate) {
        this.logDelegate = iLogDelegate;
        return this;
    }
}
