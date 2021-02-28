package com.ddogring.homepage.util;

import java.util.Date;

/**
 * @author DdogRing
 * @date 2021/1/8 09:54
 * @description 工具类
 */
public class Utils {

    /**
     * 生成当前时间戳 单位为秒
     * @author DdogRing
     * @date 2021/1/8
     * @param
     * @return int 秒
     */
    public static int generateCurrentTimeStamp(){
        return (int)(System.currentTimeMillis() / 1000);
    }

    /**
     * 时间转换 毫秒转换秒
     * @author DdogRing
     * @date 2021/1/8
     * @param time 毫秒
     * @return int 秒
     */
    public static int timeConversion(long time){
        return (int)(time / 1000);
    }

    /**
     * 判断对象是否为空
     * @author DdogRing
     * @date 2021/1/12
     * @param obj 需要判断的对象
     * @return boolean true为空 false不为空
     */
    public static boolean isEmpty(Object obj){
        return null == obj || "" == obj;
    }

    /**
     * 判断对象是否不为空
     * @author DdogRing
     * @date 2021/1/12
     * @param obj 需要判断的对象
     * @return boolean true不为空 false为空
     */
    public static boolean isNotEmpty(Object obj){
        return !isEmpty(obj);
    }

    /**
     * 判断对象是否为null
     * @author DdogRing
     * @date 2021/1/22
     * @param obj 需要判断的对象
     * @return boolean true为null false不为null
     */
    public static boolean isNull(Object obj){
        return null == obj;
    }

    /**
     * 判断对象是否不为null
     * @author DdogRing
     * @date 2021/1/22
     * @param obj 需要判断的对象
     * @return boolean true不为null false为null
     */
    public static boolean isNotNull(Object obj){
        return !isNull(obj);
    }

}
