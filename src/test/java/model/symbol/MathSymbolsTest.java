package model.symbol;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


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
        assertThat(mathSymbols.getInputtedMathSymbols()).isEqualTo(expectedSymbols);
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

    @Test
    @DisplayName("poll() 호출 시, 리스트의 제일 앞 값을 삭제하고, 값을 반환한다.")
    void poll() {
        //given
        List<String> inputtedExpression = Arrays.asList("1", "+", "3", "-", "2");
        MathSymbols mathSymbols = new MathSymbols(inputtedExpression);
        MathSymbol expectedSymbol = MathSymbol.PLUS;
        MathSymbols expectedSymbols = new MathSymbols(Arrays.asList("3", "-", "2"));

        //when
        MathSymbol actualSymbol = mathSymbols.poll();

        //then
        assertAll(
                () -> assertThat(actualSymbol).isEqualTo(expectedSymbol),
                () -> assertThat(mathSymbols).isEqualTo(expectedSymbols)
        );
    }
}