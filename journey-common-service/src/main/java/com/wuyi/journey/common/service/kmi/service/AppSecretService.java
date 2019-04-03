package com.wuyi.journey.common.service.kmi.service;

import com.wuyi.journey.common.service.kmi.utils.AesUtils;

/**
 * Created  by songjh on 2018-12-26 21:32.
 */
public class AppSecretService {

    public static void main(String[] args){
        /** 加密 **/
        String password = "aqc_paas";
        String encrptContent = AesUtils.encrypt(password, "songjh");
        System.out.println(encrptContent);
        /** 签名**/
        /** 验签 **/
        /** 解密 **/
        String decrptContent = AesUtils.decrypt(encrptContent, "songjh");
        System.out.println(decrptContent);
    }
}
