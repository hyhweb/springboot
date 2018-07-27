package com.hotsale.core.utils;

/**
 * Created by Administrator on 2018/4/11.
 */
public class RandomUtil {

    /**
     * <p>获取100-999之间的随机数</p>
     */
    public static int getRandomLenThree(){
        return (int)(Math.random()*900)+100;
    }
}
