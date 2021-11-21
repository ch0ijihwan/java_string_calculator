package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ExpressionTest {
    @Test
    @DisplayName("객체 생성 시, 입력 받은 수식을 List<String> 타입으로 저장한다.")
    void createCreate() {
        //given
        String[] inputtedExpression = new String[]{"1", "+", "2"};
        List<String> expectedExpression = Arrays.asList("1", "+", "2");

        //when
        Expression expression = new Expression(inputtedExpression);

        //then
        assertThat(expression).isEqualTo(new Expression(expectedExpression));
    }

    @ParameterizedTest
    @DisplayName("객체 생성시 입력 받은 수식에 대한 유효성을 검사한다." +
            "숫자, 연산자, 숫자, 연산자의 패턴으로 제대로 된 식이 입력 되었는지  평가한다.")
    @CsvSource(value = {"1 2 +", "1 2 3", "+ - *"})
    void validateExpression(String tokens) {
        //given
        String[] inputtedExpression = tokens.split(" ");

        //then
        assertThatThrownBy(() -> new Expression(inputtedExpression))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("수식의 형태가 이상합니다. 숫자 연산자 숫자 연산자의 반복 형태로 입력되지 않았습니다.");
    }
}