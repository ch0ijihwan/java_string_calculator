package model.arithmetic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class subtractionTest {

    private Subtraction subtraction;
    @BeforeEach
    void setUp() {
        subtraction = new Subtraction("10", "4");

    }

    @Test
    @DisplayName("객체 내 두수의 뺄셈 값을 반환")
    void sub() {
        assertThat(subtraction.Sub()).isEqualTo("6");
    }
}