package org.example;

import java.lang.reflect.Array;

public class Fibonacci {

    /**
     * Return the <code>n</code>th Fibonacci number.
     *
     * @param n the index into the Fibonacci series. <code>n</code> is positive and less than 93.
     * @return if <code>n</code> < 0 or <code>n</code> > 92 then -1;
     * else if <code>n</code> < 2 then <code>n</code>;
     * else <code>fibN(n-1)</code> + <code>fibN(n-2)</code>.
     */
    public long fibN(int n) {
        long n0 = 0;
        long n1 = 1;
        if(n < 0) return -1L;
        else if(n > 92) return -1L;
        else if(n == 0) return n0;
        else if(n == 1) return n1;
        //if (n > 1 && n < 92) return fibN(n - 1) + fibN(n - 2);
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2; i < 93; i ++){
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
        
    }

    /**
     * Determine the sum of the first <code>n</code> Fibonacci numbers.
     *
     * @param n the index into the Fibonacci series. <code>n</code> is positive and less than 93.
     * @return the sum of the Fibonacci numbers 0 through n.
     */
    public long sumN(int n) {
        long sum = 0;
        for(int i = 0; i <= n; i++){
            sum = fibN(i) + sum;
        }
         return sum;
    }

    public Fibonacci() {

    }

    private final long[] memo = new long[93];
}