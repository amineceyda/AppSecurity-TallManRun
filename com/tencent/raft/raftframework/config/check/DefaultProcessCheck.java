package com.tencent.raft.raftframework.config.check;

import com.tencent.raft.raftannotation.RService;
import com.tencent.raft.raftannotation.RServiceProcess;
import com.tencent.raft.raftframework.log.RLog;

public class DefaultProcessCheck implements IProcessCheck {
    private static final String TAG = "DefaultProcessCheck";

    public boolean check(Class<?> cls, String str, boolean z) {
        if (!z) {
            return true;
        }
        try {
            if (cls.isAnnotationPresent(RService.class)) {
                for (String str2 : ((RService) cls.getAnnotation(RService.class)).process()) {
                    if (RServiceProcess.ALL.equals(str2) || str.equals(str2)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (NullPointerException e2) {
            RLog.e(TAG, "check process exception", e2);
        }
        return true;
    }
}
