import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class NumberTest {
    @ParameterizedTest
    @DisplayName("객체 생성시, 생성자의 파라미터로 부터 입력 받은 숫자를 저장한다.")
    @CsvSource(value = {"1"})
    void createNumber(int input) {
        //when
        Number actualNumber = new Number(input);

        //then
        assertThat(actualNumber).isEqualTo(new Number(input));
    }
}
