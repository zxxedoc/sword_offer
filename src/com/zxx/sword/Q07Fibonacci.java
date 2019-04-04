package com.zxx.sword;

import java.lang.reflect.Field;

public class Q07Fibonacci {
    public int Fibonacci(int n) {
        if(n == 0)return 0;
        if(n == 1)return 1;
        return Fibonacci(n - 1) + Fibonacci( n - 2);
    }
}
