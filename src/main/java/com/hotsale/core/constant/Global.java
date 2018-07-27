package com.hotsale.core.constant;

/**
 * Created by Administrator on 2017/12/18.
 */
public final class Global {
    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_TIME_PATTERN_2 = "yyyy-MM-dd HH:mm";
    public static final String DATE_PATTERN = "yyyy-MM-dd";
    public static final String MONTH_PATTERN = "yyyy-MM";
    //登录后令牌
    public static final String X_ACCESS_TOKEN = "x-access-token";

    // 外部调用 api token
    public static final String API_TOKEN = "token";

    // 外部调用 api signature 签名
    public static final String API_SIGNATURE = "signature";

    // 外部调用 api timestamp 时间戳
    public static final String API_TIMESTAMP = "timestamp";


    //缓存key,登录用户前缀
    public static final String LOGIN_TOKEN_USER = "LOGIN.TOKEN.USER.";
    //缓存key,登录司机前缀
    public static final String LOGIN_TOKEN_DRIVER = "LOGIN.TOKEN.DRIVER.";
    //缓存key,用户登录密钥前缀
    public static final String LOGIN_SECRET_KEY_USER = "LOGIN.SECRET.USER.";
    //缓存key,司机登录密钥前缀
    public static final String LOGIN_SECRET_KEY_DRIVER = "LOGIN.SECRET.DRIVER.";
    //缓存key,用户登录验证码前缀
    public static final String LOGIN_CODE_USER = "LOGIN.CODE.USER.";
    //缓存key,司机登录验证码前缀
    public static final String LOGIN_CODE_DRIVER = "LOGIN.CODE.DRIVER.";
    //缓存key,司机修改密码验证码前缀
    public static final String PWD_CODE_DRIVER = "PWD.CODE.DRIVER.";
    //缓存key,司机修改手机号验证码前缀
    public static final String PHONE_CODE_DRIVER = "PHONE.CODE.DRIVER.";
    //缓存key,用户注册验证码前缀
    public static final String REGISTER_CODE_USER = "REGISTER.CODE.USER.";
    //缓存key,用户申请密码验证码前缀
    public static final String RESET_CODE_USER = "RESET.CODE.USER.";
    //缓存key,用户申请密码短信码前缀
    public static final String RESET_SMS_USER = "RESET.SMS.USER.";

    /**
     * 队列名称
     */
    public class Queue{
        //危险品位置跟踪
        public final static String DANGEROUS_GOODS_TRACK ="dangerousGoodsTrack";
        public final static String DRIVER_SCHEDULE ="driver.schedule";
    }

}
