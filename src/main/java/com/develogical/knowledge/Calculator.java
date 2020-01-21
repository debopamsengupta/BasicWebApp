package com.develogical.knowledge;

public class Calculator {
    String request;

    public Calculator(String request) {
        this.request = request;
    }

    public int getResult() {
        String[] split = request.split(" ");
        int first = Integer.parseInt(split[2]);
        int second = Integer.parseInt(split[4]);
        if (request.contains("plus"))
            return first + second;
        if (request.contains("minus"))
            return first - second;
        if (request.contains("divided"))
            return first / second;
        if (request.contains("times"))
            return first * second;
        return 0;
    }
}
