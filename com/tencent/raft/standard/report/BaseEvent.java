package com.tencent.raft.standard.report;

import java.util.HashMap;
import java.util.Map;

public class BaseEvent {
    private String code;
    private boolean isSuccess;
    private String key;
    private HashMap<String, String> reportParam = new HashMap<>();
    private int type;

    public BaseEvent(String str, String str2, boolean z) {
        this.key = str;
        this.code = str2;
        this.isSuccess = z;
    }

    public BaseEvent(String str, String str2, boolean z, int i2, HashMap<String, String> hashMap) {
        this.key = str;
        this.code = str2;
        this.isSuccess = z;
        this.type = i2;
        this.reportParam = hashMap;
    }

    public BaseEvent(String str, String str2, boolean z, Map<String, String> map) {
        this.key = str;
        this.code = str2;
        this.isSuccess = z;
        this.reportParam = (HashMap) map;
    }

    public String getCode() {
        return this.code;
    }

    public String getKey() {
        return this.key;
    }

    public Map<String, String> getReportParam() {
        return this.reportParam;
    }

    public int getType() {
        return this.type;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setReportParam(Map<String, String> map) {
        this.reportParam = (HashMap) map;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public void setType(int i2) {
        this.type = i2;
    }
}
