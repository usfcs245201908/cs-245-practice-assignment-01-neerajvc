package com.company;

public class Practice01MathIterative implements Practice01Math{

    public int fib (int n){
        if(n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        int nth = 1;

        for(int i=2; i<n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }

    public int fact (int n){
        int product = 1;
        for ( int i=1; i<=n; i++ )
            product *= i;
        return product;

    }

}
