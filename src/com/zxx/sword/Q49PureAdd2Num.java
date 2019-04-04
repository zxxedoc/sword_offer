package com.zxx.sword;

import java.math.BigInteger;

public class Q49PureAdd2Num {
    public int Add(int num1,int num2) {
        int sum = 0;
        BigInteger a = BigInteger.valueOf((long)num1);
        BigInteger b = BigInteger.valueOf((long)num2);
        BigInteger res = a.add(b);
        sum = res.intValue();
        return sum;
    }
}
