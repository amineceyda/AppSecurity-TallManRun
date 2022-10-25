package com.tencent.raft.raftannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface RaftServiceConfig {
    RaftArg[] factoryArgs() default {};

    Class<?> factoryClass() default Void.class;

    String factoryMethod() default "";

    RaftArg[] initMethodArgs() default {};

    @Deprecated
    Class<?> interfaceClass() default Void.class;

    RaftMethod[] methods() default {};

    RaftArg[] properties() default {};

    String scope() default "Prototype";

    Class<?> serviceClass() default Void.class;
}
