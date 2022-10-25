package com.tencent.raft.raftframework.sla;

public final class SLAConstant {
    public static final String APP_INFO = "app_info";
    public static final String CALL_DEPRECATED = "call_deprecated";
    public static final String GET_IPC_SERVICE = "get_ipc_service";
    public static final String GET_SERVICE_COST = "get_service_cost";
    public static final String GET_SERVICE_ERROR = "get_service_error";
    public static final String GET_SERVICE_SUCCESS = "get_service_success";
    public static final String GET_STANDARD_INTERFACE_SERVICE = "get_standard_service";
    public static final int TYPE_DECLARE_SERVICE = 4;
    public static final String TYPE_DEPRECATED_START = "1";
    public static final int TYPE_HOST_ALL_SERVICE = 3;
    public static final int TYPE_HOST_SERVICE = 2;
    public static final int TYPE_RAFT_SERVICE = 1;
    public static final int TYPE_RAFT_STANDARD_SERVICE = 5;

    private SLAConstant() {
    }
}
