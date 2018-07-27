package com.hotsale.core.utils;

public class NumberUtil {

  
    /**
     *
     * @param amount 除数
     * @param count 被除数
     * @return
     */
    public static boolean check(int amount,int count){
        if(amount%count==0){
            return true;// 能被除尽
        }
        else{

            int m=count;
            while(m%2==0){
                m=m/2;// 当模2不=0时，去尝试对5取模
            }
            while(m%5==0){
                m=m/5;// 当模5不=0时，则将m让除数取模
            }
            if(amount%m!=0){
                return false;// 不能除尽，如果取模不为0，则表示有2和5以外的因子，数学原理也是别人告诉我的：除数能被分解成N个2或N个5或者N2N5组合，则表示可以除尽
            }
        }




        return true;
    }
}
