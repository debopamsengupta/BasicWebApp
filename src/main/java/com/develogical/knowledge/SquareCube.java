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

        for(int y : integers)
        {
            double cubic = Math.pow(y, 1.0/3);
            double square = Math.sqrt(y);
            if (Math.abs((double)Math.round(cubic) - cubic) < 0.001 &&
                    Math.abs((double)Math.round(square) - square) < 0.001) {
                return y;
            }
        }

        return 0;
    }
}
