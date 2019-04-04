package com.zxx.sword;

import java.util.LinkedList;

public class Q13ReOrderArray {
    public void reOrderArray(int [] array) {
        LinkedList<Integer> oddList = new LinkedList<>();
        LinkedList<Integer> evenList = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 == 0)evenList.offer(array[i]);
            else oddList.offer(array[i]);
        }
        int oddLen = oddList.size();
        for (int i = 0; i < oddLen; i++) {
            array[i] = oddList.poll();
        }
        for (int i = oddLen; i < array.length;i++) {
            array[i] = evenList.poll();
        }

    }
}
