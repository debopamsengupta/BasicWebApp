package com.develogical.knowledge;

public class PowerCalculator {
    String request;

    public PowerCalculator(String request) {
        this.request = request;
    }

    public int getResult() {
        String of = request.split("to the power of")[1].trim();
        String base = request.split("to the power of")[0].replace("what is", "").trim();
        return (int) Math.pow(Double.valueOf(base), Double.valueOf(of));
    }
}
