package model.calculation;

import model.symbol.MathSymbol;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SubtractionTest {
    private Calculation calculation;

    @BeforeEach
    void setUp() {
        calculation = new Subtraction();
    }

    @ParameterizedTest
    @DisplayName("hasMathSymbol() 호출 시, 파라미터로 부터, \"-\"를 입력 받으면 true 를 반환하고, 그렇지 않으면 false 를 반환한다.")
    @CsvSource(value = {"+,false", "-,true", "/,false", "*,false"})
    void hasMathSymbol(String symbol, boolean expected) {
        //when
        boolean actual = calculation.hasMathSymbol(MathSymbol.of(symbol));

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("calculate 실행 시, 파라미터로 부터 입력된 값을 나눠서 반환한다.")
    void calculate() {
        //given
        int inputX = 2;
        int inputY = 1;
        int expected = 0;

        //when
        int actual = calculation.calculate(inputX, inputY);

        //then
        assertThat(actual).isEqualTo(expected);
    }
}