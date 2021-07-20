package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {

    private Numbers numbers;

    @BeforeEach
    void setUp() {
        numbers = new Numbers(new String[]{"1", "+", "2"});
    }

    @Test
    @DisplayName(" 식을 받을 경우 그중 피연산자만 반환함.")
    public void parseOperands() {
        assertThat(numbers.parseOperands().size())
                .isEqualTo(2);
    }


}

