package com.tencent.raft.raftframework.config;

import com.tencent.raft.raftframework.config.check.DefaultProcessCheck;
import com.tencent.raft.raftframework.config.check.IProcessCheck;
import com.tencent.raft.raftframework.log.DefaultLogDelegate;
import com.tencent.raft.raftframework.log.ILogDelegate;
import com.tencent.raft.raftframework.remote.IRAFTRemoteProxy;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class RaftConfig {
    private static final String THREAD_NAME_RAFT_SDK = "raft-sdk";
    private Executor executor;
    private boolean isDebugVersion;
    private boolean isForceCheck;
    private ILogDelegate logDelegate;
    private boolean openSLAReporter;
    private IProcessCheck processCheck;
    private IRAFTRemoteProxy remoteProxy;

    public static class Builder {
        private Executor executor;
        public boolean isDebugVersion = false;
        private boolean isForceCheck = false;
        private ILogDelegate logDelegate = new DefaultLogDelegate();
        public boolean openSLAReporter = true;
        private IProcessCheck processCheck = new DefaultProcessCheck();
        private IRAFTRemoteProxy remoteProxy;

        public class a implements ThreadFactory {
            public final AtomicInteger a = new AtomicInteger(1);

            public a(Builder builder) {
            }

            public Thread newThread(Runnable runnable) {
                StringBuilder i2 = g.a.a.a.a.i(RaftConfig.THREAD_NAME_RAFT_SDK);
                i2.append(this.a.incrementAndGet());
                return new Thread(runnable, i2.toString());
            }
        }

        public RaftConfig build() {
            Executor executor2 = this.executor;
            if (executor2 == null) {
                executor2 = Executors.newSingleThreadExecutor(new a(this));
            }
            return new RaftConfig(this.openSLAReporter, this.isDebugVersion, this.isForceCheck, this.processCheck, this.logDelegate, this.remoteProxy, executor2);
        }

        public Builder setDebugVersion(boolean z) {
            this.isDebugVersion = z;
            return this;
        }

        public Builder setExecutor(Executor executor2) {
            this.executor = executor2;
            return this;
        }

        public Builder setForceCheck(boolean z) {
            this.isForceCheck = z;
            return this;
        }

        public Builder setLogDelegate(ILogDelegate iLogDelegate) {
            this.logDelegate = iLogDelegate;
            return this;
        }

        public Builder setOpenSLAReporter(boolean z) {
            this.openSLAReporter = z;
            return this;
        }

        public Builder setProcessCheck(IProcessCheck iProcessCheck) {
            this.processCheck = iProcessCheck;
            return this;
        }

        public Builder setRemoteProxy(IRAFTRemoteProxy iRAFTRemoteProxy) {
            this.remoteProxy = iRAFTRemoteProxy;
            return this;
        }
    }

    private RaftConfig(boolean z, boolean z2, boolean z3, IProcessCheck iProcessCheck, ILogDelegate iLogDelegate, IRAFTRemoteProxy iRAFTRemoteProxy, Executor executor2) {
        this.openSLAReporter = true;
        this.openSLAReporter = z;
        this.isDebugVersion = z2;
        this.isForceCheck = z3;
        this.processCheck = iProcessCheck;
        this.logDelegate = iLogDelegate;
        this.remoteProxy = iRAFTRemoteProxy;
        this.executor = executor2;
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public Executor getExecutor() {
        return this.executor;
    }

    public ILogDelegate getLogDelegate() {
        return this.logDelegate;
    }

    public IProcessCheck getProcessCheck() {
        return this.processCheck;
    }

    public IRAFTRemoteProxy getRemoteProxy() {
        return this.remoteProxy;
    }

    public boolean isDebugVersion() {
        return this.isDebugVersion;
    }

    public boolean isForceCheck() {
        return this.isForceCheck;
    }

    public boolean isOpenSLAReporter() {
        return this.openSLAReporter;
    }

    public void setDebugVersion(boolean z) {
        this.isDebugVersion = z;
    }

    public void setForceCheck(boolean z) {
        this.isForceCheck = z;
    }

    public void setLogDelegate(ILogDelegate iLogDelegate) {
        this.logDelegate = iLogDelegate;
    }

    public void setOpenSLAReporter(boolean z) {
        this.openSLAReporter = z;
    }

    public void setProcessCheck(IProcessCheck iProcessCheck) {
        this.processCheck = iProcessCheck;
    }

    public void setRemoteProxy(IRAFTRemoteProxy iRAFTRemoteProxy) {
        this.remoteProxy = iRAFTRemoteProxy;
    }
}
