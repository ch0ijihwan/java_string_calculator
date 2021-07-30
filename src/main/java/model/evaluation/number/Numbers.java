package model.evaluation.number;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Numbers {
    private List<Number> numbers;

    public Numbers(String[] dividedValues) {
        numbers = IntStream.range(0, dividedValues.length)
                .filter(Numbers::isEven)
                .mapToObj(index -> new Number(dividedValues[index]))
                .collect(Collectors.toList());
    }

    public int Size() {
        return numbers.size();
    }

    private static boolean isEven(int index) {
        return index % 2 == 0;
    }

    public List<Number> getNumbers() {
        {
            return this.numbers;
        }
    }
}
