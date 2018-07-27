package com.hotsale.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by Admin on 2018/6/6.
 */
public class HmacSha256Util {

    private final static Logger logger = LoggerFactory.getLogger(HmacSha256Util.class);

    public static void main(String[] args) {
        String json = "{\"COST_APPLY_ID\":\"247\",\"TOTAL_AMOUNT\":\"\",\"BKG_STA\":\"A\",\"RESULT\":[{\"ASSIGN_NO\":\"241\",\"BOOKLIST\":[{\"CNTR\":\"\",\"ACTIVITY\":\"PK\",\"BKG\":\"PE1807180002\",\"BKG_SEQ\":\"1\"},{\"CNTR\":\"\",\"ACTIVITY\":\"GR\",\"BKG\":\"_PE1807180002\",\"BKG_SEQ\":\"1\"}]}]}";
        String s = encodeSha256_HMAC(json, "123456");
        System.out.println(s);
    }


    public static String encodeSha256_HMAC(String data, String key){
        String hash = "";
        try {
            Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
            sha256_HMAC.init(secret_key);
            byte[] bytes = sha256_HMAC.doFinal(data.getBytes());
            hash = byteArrayToHexString(bytes);
            hash = Base64Util.encode(hash);
        } catch (Exception e) {
            logger.error("Error HmacSHA256 ===========" + e.getMessage());
        }
        return hash;
    }

    /**
     * 将加密后的字节数组转换成字符串
     *
     * @param b 字节数组
     * @return 字符串
     */
    private static String byteArrayToHexString(byte[] b) {
        StringBuilder hs = new StringBuilder();
        String stmp;
        for (int n = 0; b!=null && n < b.length; n++) {
            stmp = Integer.toHexString(b[n] & 0XFF);
            if (stmp.length() == 1)
                hs.append('0');
            hs.append(stmp);
        }
        return hs.toString().toLowerCase();
    }

}
