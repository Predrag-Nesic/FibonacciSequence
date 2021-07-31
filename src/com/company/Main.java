package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fib(22));
        int niz[] = fib2(10);
        for(int i = 0; i < 10; i++) {
            System.out.println(niz[i]);
        }
        System.out.println(fib3(22));
        System.out.println(fib4(9));
    }

    public static int fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    
    public static int[] fib2(int n) {
        int[] fib = new int[n];
        fib[1] = 1;
        for(int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static int fib3(int n) {
        int x = 0;
        int y = 1;
        int z = 0;
        for(int i = 2; i < n; i++) {
            z = x + y;
            x = y;
            y = z;
        }
        return z;
    }

    public static int fib[] = new int[10];

    public static int fib4(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(fib[n] != 0) {
            return fib[n];
        }
        fib[n] = fib4(n - 1) + fib4(n - 2);
        return fib[n];
    }

}
