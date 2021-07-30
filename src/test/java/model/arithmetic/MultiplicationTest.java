package model.arithmetic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplicationTest {
    @Test
    @DisplayName("두수를 곱하였을 때, 곱센 한 값을 반환")
    void Multiple() {
        Multiplication multiplication = new Multiplication(2, 13);
        assertThat(multiplication.operate()).isEqualTo(26);
    }
}