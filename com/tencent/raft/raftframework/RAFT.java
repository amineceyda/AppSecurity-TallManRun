package com.tencent.raft.raftframework;

import android.content.Context;
import com.tencent.raft.raftframework.config.RaftConfig;
import com.tencent.raft.raftframework.exception.RAFTCallBeforeInitException;
import com.tencent.raft.raftframework.exception.RAFTIPCNotSupportException;
import com.tencent.raft.raftframework.exception.RAFTNotDeclareServiceException;
import com.tencent.raft.raftframework.exception.RAFTServiceNotFoundException;
import com.tencent.raft.raftframework.exception.RAFTServiceNotMatchException;
import java.util.Map;

public class RAFT {
    private static RaftConfig sRaftConfig = RaftConfig.createBuilder().build();

    private RAFT() {
    }

    public static <T> T get(Class<T> cls) throws RAFTCallBeforeInitException, RAFTServiceNotFoundException, RAFTNotDeclareServiceException {
        return RAApplicationContext.getInstance().getService(cls);
    }

    public static <T> T get(Class<T> cls, String str) throws RAFTCallBeforeInitException, RAFTServiceNotFoundException, RAFTNotDeclareServiceException {
        return RAApplicationContext.getInstance().getRService(cls, str);
    }

    public static <T> Map<String, T> getAll(Class<T> cls) throws RAFTCallBeforeInitException, RAFTServiceNotFoundException, RAFTServiceNotMatchException {
        return RAApplicationContext.getInstance().getAllRService(cls);
    }

    public static RaftConfig getConfig() {
        return sRaftConfig;
    }

    public static Context getContext() {
        return RAApplicationContext.getInstance().getContext();
    }

    @Deprecated
    public static String getDeclareConstant(String str) {
        return RAApplicationContext.getInstance().getDeclareConstant(str);
    }

    @Deprecated
    public static Object getDeclareService(String str) {
        return RAApplicationContext.getInstance().getDeclareService(str);
    }

    public static <T> T getIPCSync(Class<T> cls) throws RAFTCallBeforeInitException, RAFTNotDeclareServiceException, RAFTIPCNotSupportException {
        return RAApplicationContext.getInstance().getIPCSync(cls, "");
    }

    public static <T> T getIPCSync(Class<T> cls, String str) throws RAFTCallBeforeInitException, RAFTNotDeclareServiceException, RAFTIPCNotSupportException {
        return RAApplicationContext.getInstance().getIPCSync(cls, str);
    }

    public static void init(Context context) {
        init(context, sRaftConfig);
    }

    public static void init(Context context, RaftConfig raftConfig) {
        sRaftConfig = raftConfig;
        RAApplicationContext.getInstance().startup(context, raftConfig);
    }

    public static boolean isInit() {
        return RAApplicationContext.getInstance().hasStartUp();
    }

    public static void setConfig(RaftConfig raftConfig) {
        sRaftConfig = raftConfig;
        RAApplicationContext.getInstance().notifyConfigChange();
    }
}
