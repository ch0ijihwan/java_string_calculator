package model.evaluation;

import model.evaluation.number.Numbers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumbersTest {

    private Numbers numbers;
    @Test
    @DisplayName(" 식을 받을 경우 그중 피연산자만 반환함.")
    public void parseOperands() {
        numbers = new Numbers(new String[]{"1", "+", "3"});

        assertThat(numbers.Size())
                .isEqualTo(2);
    }


}

