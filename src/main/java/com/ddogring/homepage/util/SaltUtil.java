package com.ddogring.homepage.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * @ClassName generateSalt
 * @Author DdogRing
 * @Date 2021/2/23 0023 22:07
 * @Description 生成配合用户加密串
 * @Version 1.0
 */
public class SaltUtil {

    public static String generateSalt(Integer length){
        StringBuilder sb = new StringBuilder(10);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(String.valueOf(random.nextInt(10)));
        }
        return String.valueOf(sb);
    }
}
