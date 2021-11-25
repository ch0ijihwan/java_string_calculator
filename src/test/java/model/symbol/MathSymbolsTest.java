package model.symbol;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class MathSymbolsTest {
    @Test
    @DisplayName("List<String> 형태의 수식 리스트를 입력 받으면, 이중 홀수 인덱스 값에 해당하는 값을 뽑아 Queue<MathSymbol> 형태로 저장한다.")
    void createMathSymbols() {
        //given
        List<String> inputtedExpression = Arrays.asList("1", "+", "2", "-", "3");
        List<String> expectedSymbols = Arrays.asList("dummy", "+", "dummy", "-", "dummy");
        MathSymbols mathSymbols;

        //when
        mathSymbols = new MathSymbols(inputtedExpression);

        //then
        assertThat(mathSymbols).isEqualTo(new MathSymbols(expectedSymbols));
    }

    @Test
    @DisplayName("size() 호출 시,  가지고 있는 mathSymbol 의 개수를 반환한다.")
    void size() {
        //given
        List<String> inputtedExpression = Arrays.asList("1", "+", "3", "-", "2");
        MathSymbols mathSymbols = new MathSymbols(inputtedExpression);
        int expectedSize = 2;

        //when
        int actualSize = mathSymbols.size();

        //then
        assertThat(actualSize).isEqualTo(expectedSize);
    }

//
}