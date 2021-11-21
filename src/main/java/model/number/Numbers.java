package model.number;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Numbers {
    private final List<Number> inputtedNumbers;

    public Numbers(List<String> expression) {
        inputtedNumbers = expression.stream()
                .filter(this::isInteger)
                .map(token -> new Number(Integer.parseInt(token)))
                .collect(Collectors.toUnmodifiableList());
    }

    private boolean isInteger(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return Objects.equals(inputtedNumbers, numbers.inputtedNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputtedNumbers);
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "inputtedNumbers=" + inputtedNumbers +
                '}';
    }
}
