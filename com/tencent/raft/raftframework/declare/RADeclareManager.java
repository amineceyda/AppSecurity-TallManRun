package com.tencent.raft.raftframework.declare;

import com.tencent.raft.raftframework.log.RLog;
import com.tencent.raft.raftframework.service.api.IServiceEntry;
import g.a.a.a.a;
import java.util.HashMap;
import java.util.Map;

public class RADeclareManager implements IRADeclareManager {
    public static final String TAG = "RADeclareManager";
    private Map<String, String> mDeclareConstants = new HashMap();
    private Map<String, Object> mDeclareServiceCache = new HashMap();
    private Map<String, IServiceEntry> mServiceEntryMap = new HashMap();

    public RADeclareManager(String str) {
        init(str);
    }

    private void init(String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (Map.Entry entry : ((Map) cls.getDeclaredField("sDeclareMap").get((Object) null)).entrySet()) {
                String str2 = (String) entry.getKey();
                IServiceEntry iServiceEntry = (IServiceEntry) entry.getValue();
                IServiceEntry iServiceEntry2 = this.mServiceEntryMap.get(str2);
                if (iServiceEntry2 != null) {
                    if (iServiceEntry2.getPriority() < iServiceEntry.getPriority()) {
                    }
                }
                this.mServiceEntryMap.put(str2, iServiceEntry);
            }
            for (Map.Entry entry2 : ((Map) cls.getDeclaredField("sConstantMap").get((Object) null)).entrySet()) {
                String str3 = (String) entry2.getKey();
                String str4 = (String) entry2.getValue();
                if (!this.mDeclareConstants.containsKey(str3)) {
                    this.mDeclareConstants.put(str3, str4);
                }
            }
            StringBuilder i2 = a.i("init success :");
            i2.append(this.mServiceEntryMap.size());
            RLog.d(TAG, i2.toString());
        } catch (Exception e2) {
            RLog.w(TAG, "init entryMap error :" + e2);
        }
    }

    public void destroy() {
        this.mDeclareServiceCache.clear();
        this.mServiceEntryMap.clear();
        this.mDeclareConstants.clear();
    }

    public String getDeclareConstant(String str) {
        return this.mDeclareConstants.get(str);
    }

    public Object getDeclareService(String str) {
        if (this.mDeclareServiceCache.containsKey(str)) {
            return this.mDeclareServiceCache.get(str);
        }
        IServiceEntry iServiceEntry = this.mServiceEntryMap.get(str);
        if (iServiceEntry == null) {
            RLog.w(TAG, a.w("cannot found declare >> ", str));
            return null;
        }
        Object obj = iServiceEntry.createService().service;
        this.mDeclareServiceCache.put(str, obj);
        return obj;
    }
}
