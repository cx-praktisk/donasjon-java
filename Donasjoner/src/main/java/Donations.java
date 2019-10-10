package main.java;

import java.io.IOException;
import java.util.List;

public class Donations {

    static FileReader reader = new FileReader();
    static Inputmapper inputmapper = new Inputmapper();
    static Calculator calculator = new Calculator();

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            throw new IllegalArgumentException("Du må oppgi en filpath som argument");
        }
        List<String> inputlines = reader.readDictionary(args[0]);
        reader.validateInputLines(inputlines);
        List<Integer> inputValues = inputmapper.getValueFromInputlines(inputlines);
        int sum = calculator.sumInputValues(inputValues);

        System.out.println("Summen av donasjoner er: " + sum);
    }
}