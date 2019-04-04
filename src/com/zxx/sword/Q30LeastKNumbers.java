package com.zxx.sword;

import java.util.ArrayList;
import java.util.Arrays;

public class Q30LeastKNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(input == null || input.length == 0 || input.length < k)return res;
        Arrays.sort(input);

        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;

    }
}
