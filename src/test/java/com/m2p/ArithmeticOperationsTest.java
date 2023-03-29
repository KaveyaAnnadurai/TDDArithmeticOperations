package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {
    ArithmeticOperations arithmeticObject = new ArithmeticOperations();

    @Test
    void getFourWhenThreeAddedToOne(){
        //Arrange
        int expectedValue = 4;

        //Act
        int actualValue = arithmeticObject.add(3,1);

        //Assert
        assertEquals(expectedValue,actualValue);
    }

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

}
