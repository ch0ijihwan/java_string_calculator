package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MathSymbolsTest {
    @Test
    @DisplayName("List<String> 형태의 수식 리스트를 입력 받으면, 이중 수학 기호만을 입력 받아 List<MathSymbol> 형태로 저장한다.")
    void createMathSymbols() {
        //given
        List<String> inputtedExpression = Arrays.asList("1", "+", "3", "-", "2");
        List<MathSymbol> expectedSymbols = Arrays.asList(MathSymbol.PLUS, MathSymbol.MINUS);
        MathSymbols mathSymbols;

        //when
        mathSymbols = new MathSymbols(inputtedExpression);

        //then
        assertThat(mathSymbols).isEqulsTo(expectedSymbols);
    }
}
