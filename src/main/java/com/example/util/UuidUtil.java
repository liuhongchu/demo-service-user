package com.example.util;

import java.util.UUID;

/**
 * Created by liuhongchun on 2017/10/24.
 */
public class UuidUtil {
    /**
     * 获得一个UUID
     * @return String UUID
     */
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }

}
