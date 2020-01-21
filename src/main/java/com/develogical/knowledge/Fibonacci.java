package com.develogical.knowledge;

public class Fibonacci {
    String request;

    public Fibonacci(String request) {
        this.request = request;
    }

    private int fib(int n)
    {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public int getResult() {
        String result = request.split("what is the ")[1];
        result = result.split(" ")[0].replace("th", "").replace("st", "").replace("nd", "");
        int x = Integer.parseInt(result);
        return fib(x);
    }
}
