package com.pck.pro_democommon.util;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalTime;

/**
 * @description: 日期工具类
 * @program: pro_demo
 * @author: pancikai
 * @create: 2019/07/18 10:14
 * @version: 1.0
 */
public class DateUtils {

    /**
     * 判断时间范围
     *
     * @param target 要判断的时间
     * @param begin  开始时间
     * @param end    结束时间
     * @return 如果target时间界于开始和结束时间，则返回true，否则返回false
     */
    public static boolean isTimeBetween(String target, String begin, String end) {

        if(StringUtils.isBlank(target) ||StringUtils.isBlank(begin)  || StringUtils.isBlank(end) ) {
            return false;
        }
        LocalTime localTarget = LocalTime.parse(target);
        LocalTime localBegin = LocalTime.parse(begin);
        LocalTime localEnd = LocalTime.parse(end);

        return localBegin.isAfter(localTarget) && localEnd.isBefore(localTarget);
    }
}
