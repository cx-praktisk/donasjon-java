package main.java;

import java.util.ArrayList;
import java.util.List;

public class Inputmapper {

    Mapper mapper = new Mapper();

    /**
     * Fyll inn kode her for å oversette inputen til å bli en verdi. Mapper inneholder penge-enhetene
     * @param inputlines Liste med strenger på formatet "<tall> <penge-enhet>"
     * @return en liste som inneholder tallverdien for hver av elementene i input'en
     */
    public List<Integer> getValueFromInputlines(List<String> inputlines) {
        List<Integer> valuesLines = new ArrayList<>();
        // Her kan du feks gå i Mapper å mappe fra penge-enhet til å finne verdien av enheten
        // du må også gange det med tallet.
        return valuesLines;
    }
}
