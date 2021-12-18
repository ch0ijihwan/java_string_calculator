package model.calculation;

import model.symbol.MathSymbol;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class DivisionTest {
    private Calculation calculation;

    @BeforeEach
    void setUp() {
        calculation = new Division();
    }

    @ParameterizedTest
    @DisplayName("hasMathSymbol() 호출 시, 파라미터로 부터, \"/\"를 입력 받으면 true 를 반환하고, 그렇지 않으면 false 를 반환한다.")
    @CsvSource(value = {"+,false", "-,false", "/,true", "*,false"})
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
        int inputX = 10;
        int inputY = 5;
        int expected = 2;

        //when
        int actual = calculation.calculate(inputX, inputY);

        //then
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("calculate 실행 시, 파라미터로 부터 입력 된 나눔수가 0 이면 예외처리를 반환한다.")
    void validateDivisor()
    {
        //given
        int inputX = 5;
        int inputY = 0;

        //then
        assertThatThrownBy(()->calculation.calculate(inputX,inputY))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자 0으로는 나눌 수 없습니다.");
    }
}