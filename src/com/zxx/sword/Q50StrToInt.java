package com.zxx.sword;

public class Q50StrToInt {
    public int StrToInt(String str) {
        if(str == null || str.length() == 0)return 0;
        //仅有一个非数字字符
        if(str.length() == 1 && (str.charAt(0)<'0'||str.charAt(0)>'9'))return 0;
        int res = 0;
        boolean flag = true;
        if(str.charAt(0) == '-'){
            flag = false;
            str =str.substring(1,str.length());
        }
        if(str.charAt(0) == '+'){
            str =str.substring(1,str.length());
        }
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i)<'0'||str.charAt(i)>'9')return 0;
            res = res * 10 + str.charAt(i)-'0';
        }
        if(flag)return res;
        else return -res;

    }
}
