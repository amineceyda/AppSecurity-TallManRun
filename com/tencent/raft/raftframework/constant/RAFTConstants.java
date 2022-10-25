package com.tencent.raft.raftframework.constant;

public interface RAFTConstants {
    public static final String RAFT_VERSION = "com.raft.uas/v1alpha2";
    public static final String RAFT_VERSION_STRING = "0.5.2.13";

    public enum Scope {
        SINGLETON("Singleton"),
        LAZY_SINGLETON("LazySingleton"),
        PROTOTYPE("Prototype"),
        WEAK_SINGLETON("WeakSingleton");
        
        public String alias;

        private Scope(String str) {
            this.alias = str;
        }

        public static Scope parse(String str) {
            Scope[] values = values();
            for (int i2 = 0; i2 < 4; i2++) {
                Scope scope = values[i2];
                if (scope.getAlias().equals(str)) {
                    return scope;
                }
            }
            return PROTOTYPE;
        }

        public String getAlias() {
            return this.alias;
        }
    }
}
