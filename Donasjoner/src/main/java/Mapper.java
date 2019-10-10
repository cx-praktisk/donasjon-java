package main.java;

public class Mapper {

    enum ValidInput {
        tusenlapp(1000),
        femhundrelapp(500),
        tohundrelapp(200),
        hundrelapp(100),
        femtilapp(50),
        tyvekroning(20),
        tikroning(10),
        femkroning(5),
        enkroning(1);

        private final int value;

        ValidInput(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public ValidInput getValidInput(String text) {
        switch (text) {
            case "tusenlapp": case "tusenlapper":
                return ValidInput.tusenlapp;
            case "femhundrelapp": case "femhundrelapper":
                return ValidInput.femhundrelapp;
            case "tohundrelapp": case "tohundrelapper":
                return ValidInput.tohundrelapp;
            case "hundrelapp": case "hundrelapper":
                return ValidInput.hundrelapp;
            case "femtilapp": case "femtilapper":
                return ValidInput.femtilapp;
            case "tyvekroning": case "tyvekroninger":
                return ValidInput.tyvekroning;
            case "tikroning": case "tikroninger":
                return ValidInput.tikroning;
            case "femkroning": case "femkroninger":
                return ValidInput.femkroning;
            case "enkroning": case "enkroninger":
                return ValidInput.enkroning;
            default:
                throw new IllegalArgumentException("Inputverdien " + text + " er ikke gyldig");
        }
    }
}
