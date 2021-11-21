package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    @Test
    @DisplayName("getResult() 호출 시, 객체가 갖고 있는 수식에 해당하는 연산 후 결과 값을 반환한다.")
    void calculate()
    {
        //given
        String [] inputtedExpression = new String[]{"1","+","3"};
        Expression expression = new Expression(inputtedExpression);
        Calculator calculator = new Calculator(expression);
        int expected = 4;

        //when
        int actual = calculator.getResult();

        //then
        assertThat(actual).isEqualTo(expected);
    }
}