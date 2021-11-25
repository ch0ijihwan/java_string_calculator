package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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

    @Test
    @DisplayName("객체 생성시 입력 받은 수식에 대한 유효성을 검사한다." +
            "입렫된 숫자와 문자의 길이가 홀수개가 아니면 예외처리를 반환한다.")
    void validateExpression() {
        //given
        String[] inputtedExpression = new String[]{"1","+","2","+"};

        //then
        assertThatThrownBy(() -> new Expression(inputtedExpression))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("수식의 입력이 잘못 되었습니다.(수식의 길이가 짝수개 입니다. 수식의 길이는 홀수개여야 합니다.)");
    }

    @Test
    @DisplayName("객체 생성시 입력 받은 수식에 대한 유효성을 검사한다." +
            "최소한의 수식이 입력되지 않았을 경우 예외처리를 반환한다.")
    void validateExpression2() {
        //given
        String[] inputtedExpression = new String[]{"1"};

        //then
        assertThatThrownBy(() -> new Expression(inputtedExpression))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("최소한의 수식이 입력되지 않았습니다.");
    }
}