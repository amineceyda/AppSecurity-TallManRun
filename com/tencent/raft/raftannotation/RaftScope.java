package com.tencent.raft.raftannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RaftScope {
    public static final String LazySingleton = "LazySingleton";
    public static final String Prototype = "Prototype";
    public static final String Singleton = "Singleton";
    public static final String WeakSingleton = "WeakSingleton";

    @Retention(RetentionPolicy.SOURCE)
    public @interface TYPE {
    }

    String value() default "Prototype";
}
