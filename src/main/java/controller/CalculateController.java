package controller;

public class CalculateController {
    String value;

    public CalculateController(String value) {
        this.value = value;
    }

    public String[] splitValues() {
        return this.value.replaceAll("\\s", " ").split(" ");
    }
}
