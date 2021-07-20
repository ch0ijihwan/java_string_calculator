package model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Numbers {

    private static final String NUMBER_REGEX = "^[0-9]*$";
    private static final Pattern NUMBER_PATTERN = Pattern.compile(NUMBER_REGEX);


    private final String[] dividedValues;

    Numbers(String[] dividedValues) {
        this.dividedValues = dividedValues;

    }

    public List<String> parseOperands() {
        List<String> numbers = new ArrayList<>();

        IntStream.range(0, this.dividedValues.length)
                .filter(this::isEven)
                .forEach(index -> {
                    validateNumber(this.dividedValues[index]);
                    numbers.add(this.dividedValues[index]);
                });
        return numbers;
    }


    private static void validateNumber(String number) {
        if (!NUMBER_PATTERN.matcher(number).matches()) {
            throw new IllegalArgumentException("연산자가 이상합니다");
        }
    }

    private boolean isEven(int index) {
        return index % 2 == 0;
    }

}
