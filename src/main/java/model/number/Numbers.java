package model.number;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Numbers {
    private static final int FIRST_INDEX = 0;
    private static final int SECOND_INDEX = 1;
    private List<Number> inputtedNumbers;

    public Numbers(final List<String> expression) {
        inputtedNumbers = expression.stream()
                .filter(this::isInteger)
                .map(token -> new Number(Integer.parseInt(token)))
                .collect(Collectors.toUnmodifiableList());
    }

    private boolean isInteger(final String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int poll() {
        int firstNumber = inputtedNumbers.get(FIRST_INDEX).getValue();
        int lastIndex = inputtedNumbers.size();
        inputtedNumbers = inputtedNumbers.subList(SECOND_INDEX, lastIndex);
        return firstNumber;
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
