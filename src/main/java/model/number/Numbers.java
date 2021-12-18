package model.number;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Numbers {
    private static final int START_INDEX = 0;
    private final Queue<Number> inputtedNumbers;

    public Numbers(final List<String> expression) {
        inputtedNumbers = IntStream.range(START_INDEX, expression.size())
                .filter(this::isEvenNumber)
                .mapToObj(index -> new Number(expression.get(index)))
                .collect(Collectors.toCollection(LinkedList::new));

    }

    private boolean isEvenNumber(final int number) {
        return number % 2 == 0;
    }

    public int poll() {
        return Objects.requireNonNull(inputtedNumbers.poll()).getValue();
    }

    public boolean hasNext() {
        return !inputtedNumbers.isEmpty();
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
