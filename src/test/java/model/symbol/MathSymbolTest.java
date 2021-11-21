package model.symbol;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MathSymbolTest {
    @Test
    @DisplayName("getSymbol() 메서드 호출시, Enum 에 깔려있는 값에 해당하는  , 수학 기호를 반환한다." +
            "ex) MathSymbol.PLUS 에서 getSymbols() 을 호출 하면 +가 반환된다.")
    void getSymbol()
    {
        //given
        String expectedMathSymbol = "+";

        //when
        String actualSymbol = MathSymbol.PLUS.getSymbol();

        //then
        assertThat(actualSymbol).isEqualTo(expectedMathSymbol);
    }
    @Test
    @DisplayName("of 메서드 실행 시, 사칙연산 연산자가 아닌 값을 입력 받으면 예외처리를 반환한다.")
    void of() {
        //given
        String inputtedMathSymbol = "(";

        //then
        assertThatThrownBy(() -> MathSymbol.of(inputtedMathSymbol))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("연산자의 형태가 잘못 되었습니다.");
    }
}