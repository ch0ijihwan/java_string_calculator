package model;

import model.calculation.*;
import model.symbol.MathSymbol;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static model.MathSymbolFinder.findStrategy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class MathSymbolFinderTest {
    @ParameterizedTest
    @DisplayName("finder() 메서드 호출 시, 파라미터로 부터 입력받은 MathSymbol 에 해당하는 계산전략을 찾아 반환한다.")
    @MethodSource("MathSymbolsProvider")
    void finderStrategy(MathSymbol mathSymbol, Class<Calculation> expect) {
        //when
        Calculation calculation = findStrategy(mathSymbol);

        //then
        assertThat(calculation.getClass()).isEqualTo(expect);
    }

    static Stream<Arguments> MathSymbolsProvider() {
        return Stream.of(
                arguments(MathSymbol.PLUS, Addition.class),
                arguments(MathSymbol.MINUS, Subtraction.class),
                arguments(MathSymbol.MULTIPLICATION, Multiplication.class),
                arguments(MathSymbol.DIVISION, Division.class)
        );
    }
}