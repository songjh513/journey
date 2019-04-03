package com.wuyi.journey.common.core.logger;

/**
 * 日志工具
 * Created  by songjh on 2018-12-26 21:42.
 */
public class LoggerUtils {

    private static int i =0;
    static {
        i = 0;
        System.out.println(i);
    }


    private String aa(){
            String str = "hello";
        try {
            return str;
        }
        finally {
            str = "world";
            return str;
        }
    }
    public static void main(String[] args){
        String aa = new LoggerUtils().aa();
        System.out.println(aa);
    }
}
