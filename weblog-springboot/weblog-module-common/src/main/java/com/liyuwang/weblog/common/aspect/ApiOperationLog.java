package com.liyuwang.weblog.common.aspect;


import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiOperationLog {
    String description() default "";
}
