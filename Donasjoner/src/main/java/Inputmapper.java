package main.java;

import java.util.ArrayList;
import java.util.List;

public class Inputmapper {

    Mapper mapper = new Mapper();

    /**
     * Fyll inn kode her for å oversette inputen til å bli en verdi
     * @param inputlines
     * @return
     */
    public List<Integer> getValueFromInputlines(List<String> inputlines) {
        List<Integer> valuesLines = new ArrayList<>();
        int count;
        Mapper.ValidInput type;

        for (String line : inputlines) {
            String[] countAndType = line.split(" ");
            count = Integer.parseInt(countAndType[0]);
            type = mapper.getValidInput(countAndType[1]);

            valuesLines.add(count * type.getValue());
        }
        return valuesLines;
    }
}
