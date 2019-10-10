package main.java;

import java.util.List;

public class Calculator {

    public int sumInputValues(List<Integer> inputValues) {
        int sum = 0;
        for (int value : inputValues) {
            sum = sum + value;
        }
        return sum;
    }
}
