package com.eva.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//md5加密工具类
public class MD5Code {
    public static String code(String str){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] bytes = md.digest();
            int i;
            StringBuffer buf = new StringBuffer();
            for (int offset = 0;offset<bytes.length;offset++){
                i = bytes[offset];
                if (i<0){
                    i+=256;
                }
                if (i<16){
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            //32位
            return buf.toString();
            //64位
            // return buf.toString().substring(8,24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(MD5Code.code("a1234567890123"));
    }
}
