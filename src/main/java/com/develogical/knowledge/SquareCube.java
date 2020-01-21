package com.develogical.knowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SquareCube {
    String request;

    public SquareCube(String request) {
        this.request = request;
    }

    public int getResult() {
        // which of the following numbers is both a square and a cube: 714, 15625
        String[] split = request.split(":");
        String[] data = split[1].split(",");
        List<Integer> integers = new ArrayList<>();
        for (String x : data) {
            x = x.trim();
            integers.add(Integer.valueOf(x));
        }

        for(int x : integers)
        {
            System.out.println(x);
            double cubic = Math.pow(x, 1.0/3);
            double square = Math.pow(x, 1.0/2);
            if ((double)(int)cubic == cubic && (double)(int)square == square) {
                return x;
            }
            else{
                System.out.println((double)(int)cubic);
                System.out.println(cubic);
            }
        }

        return 0;
    }
}
