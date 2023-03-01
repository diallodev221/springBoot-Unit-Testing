package com.devfun.springbootunittesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class SpringBootUnitTestingApplicationTests {

    Calculator underTest = new Calculator();
    @Test
    void itShouldAddTwoNumbers() {
        // Given
        int numberOne = 10;
        int numberTwo = 5;

        // When
        int result = underTest.add(numberOne, numberTwo);

        // Then
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    static class Calculator {
        int add(int a, int b) {return a + b;}
    }

}
