package com.zxx.sword;

import java.util.HashMap;

public class Q35FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() ==0)return -1;
        int res = -1;
        HashMap<Character,Boolean> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.remove(str.charAt(i));
                map.put(str.charAt(i),true);
            }else{
                map.put(str.charAt(i),false);
            }
        }
        for(int i = 0;i<str.length();i++){
            if(map.get(str.charAt(i))==false){
                res = i;
                break;
            }
        }
        return res;

    }
}
