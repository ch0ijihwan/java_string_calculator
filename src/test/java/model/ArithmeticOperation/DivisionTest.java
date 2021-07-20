package model.ArithmeticOperation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivisionTest {

    @Test
    @DisplayName("숫자 두개를 입력 받으면 그 두수를 나눈 값을 반환")
    void Div() {

        Division division = new Division("3","1");
        assertThat(division.Div()).isEqualTo(3);

    }



}