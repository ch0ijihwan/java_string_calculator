package model.evaluation;

public class ExpressionValues {
    String value;

    public ExpressionValues(String value) {
        this.value = value;
    }

    public String[] splitValues() {
        return this.value.replaceAll("\\s", " ").split(" ");
    }
}
