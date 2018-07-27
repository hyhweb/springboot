package com.hotsale.core.utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {

    private static final String KEY_AES = "AES";
    private final static String ENCODE = "UTF-8";
    private final static String MODEL = "AES/CBC/PKCS5Padding";

    public static void main(String[] args) throws Exception {
        String data = "e10adc3949ba59abbe56e057f20f883e";
        String key = "fe73d002b78f49f1";
        String encrypt = encrypt(data, key);
        System.out.println("encrypt "+ encrypt);
        String decrypt = decrypt(encrypt, key);
        System.out.println("decrypt "+decrypt);

    }

    public static String encrypt(String src, String key) {
        try{
            byte [] raw=key.getBytes(ENCODE);
            //5.根据字节数组生成AES密钥
            SecretKeySpec skeySpec = new SecretKeySpec(raw, KEY_AES);
            Cipher cipher = Cipher.getInstance(MODEL);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec,new IvParameterSpec(raw));
            byte[] encrypted = cipher.doFinal(src.getBytes(ENCODE));
            String s = HexUtil.encodeToString(encrypted);
//        BASE64Encoder encoder = new BASE64Encoder();
//        String strs = encoder.encode( s.getBytes(ENCODE)).replace("\r\n","");
            String strs = Base64.encodeBase64String(s.getBytes(ENCODE));
            return strs;
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    public static String decrypt(String src, String key){
        try{
            byte [] raw=key.getBytes(ENCODE);
            SecretKeySpec skeySpec = new SecretKeySpec(raw, KEY_AES);
            Cipher cipher = Cipher.getInstance(MODEL);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec,new IvParameterSpec(raw));
            byte[] bytes = Base64.decodeBase64(src);
            byte[] encrypted1 = HexUtil.decode(new String(bytes,ENCODE));
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original);
            return originalString;
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }


}
