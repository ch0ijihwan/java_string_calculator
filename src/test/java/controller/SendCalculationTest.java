package controller;

import model.ArithmeticOperation.Addition;
import model.ArithmeticOperation.Division;
import model.ArithmeticOperation.Multiplication;
import model.ArithmeticOperation.Subtraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class SendCalculationTest {

    private SendCalculation sendCalculation;

    private Addition addition;
    private Subtraction subtraction;
    private Division division;
    private Multiplication Multiplication;

    @BeforeEach
    void setUp() {





    }

    @Test
    @DisplayName("numbers 와 symbols를 받으면 각 숫자와 연산자에 따른 연산 후 결과 반환.[  number가 6, 3, 1 symbols 가 +, - 인 경우 9 반환 ]"  )
    void calculation() {

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("3","3","1"));

        ArrayList<String> symbols = new ArrayList<>(Arrays.asList("+","-"));

        sendCalculation = new SendCalculation(numbers,symbols);



        assertThat(sendCalculation.Calculation())
                .isEqualTo("5");
    }

}