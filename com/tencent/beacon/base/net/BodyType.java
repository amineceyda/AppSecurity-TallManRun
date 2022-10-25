package com.tencent.beacon.base.net;

public enum BodyType {
    JSON("application/json; charset=utf-8"),
    FORM("application/x-www-form-urlencoded"),
    DATA("multipart/form-data");
    
    public String httpType;

    private BodyType(String str) {
        this.httpType = str;
    }
}
