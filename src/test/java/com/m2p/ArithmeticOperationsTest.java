package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationsTest {
    ArithmeticOperations arithmeticObject = new ArithmeticOperations();

    //Addition testcases:
    @Test
    void getFourWhenThreeAddedToOne(){
        //Arrange
        int expectedValue = 4;

        //Act
        int actualValue = arithmeticObject.add(3,1);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //Subtraction testcases:
    @Test
    void getSevenWhenFiveSubtractedFromEleven(){
         int expectedValue = 6;

        //Act
        int actualValue = arithmeticObject.subtract(11,5);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void getMinusSixWhenFiveSubtractedFromEleven(){
        int expectedValue = -6;

        //Act
        int actualValue = arithmeticObject.subtract(5,11);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //Multiplication testcases :
    @Test
    void getEightWhenTwoMultipliedToFour(){
        int expectedValue = 8;

        //Act
        int actualValue = arithmeticObject.multiply(2,4);

        //Assert
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void getMinusEightWhenMinusTwoMultipliedToFour(){
        int expectedValue = -8;

        //Act
        int actualValue = arithmeticObject.multiply(-2,4);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void getMinusEightWhenTwoMultipliedToMinusFour(){
        int expectedValue = -8;

        //Act
        int actualValue = arithmeticObject.multiply(2,-4);

        //Assert
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void getEightWhenMinusTwoMultipliedToMinusFour(){
        int expectedValue = 8;

        //Act
        int actualValue = arithmeticObject.multiply(-2,-4);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    //division test cases:
    @Test
    void getFiveWhenTwentyFiveDividedByFive(){
        int expectedValue = 5;

        //Act
        int actualValue = arithmeticObject.divide(25,5);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void toThrowExceptionWhenDividedByZero(){
        assertThrows(ArithmeticException.class, () ->{
            arithmeticObject.divide(3,0);
        });
    }
}
