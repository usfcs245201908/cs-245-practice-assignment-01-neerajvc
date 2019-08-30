package com.company;

public class Practice01MathIterative implements Practice01Math{

    public int fib (int n){
        int x, y, z;
        if(n == 0)
            return 0;
        else {
            x = 0;
            y = 1;
            for (int i = 0; i <= n; i++) {
                z = x + y;
                x = y;
                y = z;
            }
            return y;
        }
    }

    public int fact (int n){
        int result=1,i=1;
        while(i<=n){
            result=result*i;
            i++;
        }
        return result;

    }

}
