package model.number;

import java.util.Objects;

public class Number {
    private static final String NUMBER_REGEX = "^[0-9]*$";
    private final int value;

    public Number(final String value) {
        validateInteger(value);
        this.value = Integer.parseInt(value);
    }

    public Number(final int value) {
        this.value = value;
    }

    private void validateInteger(final String token) {
        if (!token.matches(NUMBER_REGEX)) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return value == number.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Number{" +
                "value=" + value +
                '}';
    }
}