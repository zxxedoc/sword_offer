package com.zxx.sword;

import java.util.ArrayList;
import java.util.Arrays;

public class Q02ReplaceSpace {
    public static String replaceSpace(StringBuffer str) {
        if(str == null || str.length() ==0)return "";

        String s = "%20";

        int spaceCount = 0;
        int originLen = str.length();
        int index = 0;
        while(index < originLen + 2 * spaceCount){
            if(str.charAt(index) == ' '){
                str.replace(index,index+1,s);
                spaceCount++;
                index += 3;
            }else {
                index++;
            }
        }
        return str.toString();

    }

    public static void main(String[] args) {
        String s = "we are happy ";
        String[] ss = s.split(" ");
        System.out.println(Arrays.toString(ss));
    }
}
