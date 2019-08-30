package com.company;

public class Practice01MathRecursive implements Practice01Math{

    public int fib (int n){
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

    public int fact (int n){
        if (n == 0)
            return 1;
        else return (n * fact (n - 1));
    }
}
