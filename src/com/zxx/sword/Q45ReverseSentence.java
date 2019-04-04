package com.zxx.sword;

public class Q45ReverseSentence {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0)return "";
        if(str == " ")return " ";
        String[] ss = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = ss.length - 1; i >= 0; i--){
            sb.append(ss[i]);
            if(i != 0)sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Q45ReverseSentence().ReverseSentence(" ").length());
    }
}
