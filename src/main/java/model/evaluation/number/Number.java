package model.evaluation.number;

import java.util.regex.Pattern;

public class Number {
    private static final String NUMBER_REGEX = "^[0-9]*$";
    private static final Pattern NUMBER_PATTERN = Pattern.compile(NUMBER_REGEX);
    private final int number;

    public Number(String number) {
        if (!NUMBER_PATTERN.matcher(number).matches()) {
            throw new IllegalArgumentException("피연산자가 이상합니다.");
        }
        this.number = Integer.parseInt(number);
    }
    public int value() {
        return this.number;
    }
}
