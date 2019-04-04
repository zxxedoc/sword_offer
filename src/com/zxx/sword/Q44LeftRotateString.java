package com.zxx.sword;

public class Q44LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str == null || str.length() ==0)return "";
        if(n < 0)return "";
        int bits = n % str.length();
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(bits,str.length()));
        sb.append(str.substring(0,bits));
        return sb.toString();
    }
}
