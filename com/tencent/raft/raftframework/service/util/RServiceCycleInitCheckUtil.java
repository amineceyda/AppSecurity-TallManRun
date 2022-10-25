package com.tencent.raft.raftframework.service.util;

import com.tencent.raft.raftframework.RAFT;
import java.util.ArrayList;

public class RServiceCycleInitCheckUtil {
    private static final ThreadLocal<ArrayList<String>> API_CYCLE_CHECK = new ThreadLocal<>();

    private RServiceCycleInitCheckUtil() {
    }

    public static void checkAndRemove(String str) {
        if (RAFT.getConfig().isDebugVersion()) {
            ThreadLocal<ArrayList<String>> threadLocal = API_CYCLE_CHECK;
            if (threadLocal.get() != null && !threadLocal.get().isEmpty() && str.compareTo((String) threadLocal.get().get(0)) == 0) {
                threadLocal.remove();
            }
        }
    }

    public static boolean checkAndSet(String str) {
        if (!RAFT.getConfig().isDebugVersion()) {
            return true;
        }
        ThreadLocal<ArrayList<String>> threadLocal = API_CYCLE_CHECK;
        if (threadLocal.get() == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            threadLocal.set(arrayList);
        } else if (threadLocal.get().contains(str)) {
            return false;
        } else {
            threadLocal.get().add(str);
        }
        return true;
    }

    public static void removeOnException() {
        if (RAFT.getConfig().isDebugVersion()) {
            ThreadLocal<ArrayList<String>> threadLocal = API_CYCLE_CHECK;
            if (threadLocal.get() != null) {
                threadLocal.remove();
            }
        }
    }
}
