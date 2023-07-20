package com.example.springboot1.Anotion;

import java.lang.annotation.*;

/**
 * @author yzd
 * @Description: 限流
 * @create 2021-05-07 13:46
 **/
@Inherited
@Documented
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AccessLimit {

    /**
     * 限定次数
     *
     * @return
     */
    int limit() default 5;

    /**
     * 时间段内
     *
     * @return
     */
    int sec() default 5;
}

