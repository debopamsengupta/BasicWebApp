package com.develogical.knowledge;

public class Calculator {
    String request;

    public Calculator(String request) {
        this.request = request;
    }

    public int getResult() {
        String numbers = request.split("is ")[1];
        if (request.contains("plus"))
            return Integer.parseInt(numbers.split("plus")[0].trim()) + Integer.parseInt(numbers.split("plus")[1].trim());
        if (request.contains("minus"))
            return Integer.parseInt(numbers.split("minus")[0].trim()) - Integer.parseInt(numbers.split("minus")[1].trim());;
        if (request.contains("divided"))
            return Integer.parseInt(numbers.split("divided")[0].trim()) / Integer.parseInt(numbers.split("divided")[1].trim());;
        if (request.contains("times"))
            return Integer.parseInt(numbers.split("times")[0].trim()) * Integer.parseInt(numbers.split("times")[1].trim());;
        return 0;
    }
}
