package com.bjxls.common.security.annotation;

import java.lang.annotation.*;

/**
 * 内部认证注解
 * 
 * @author bjxls
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InnerAuth
{
    /**
     * 是否需要校验用户信息，（username和userId是否为空）
     */
    boolean isUser() default false;
}