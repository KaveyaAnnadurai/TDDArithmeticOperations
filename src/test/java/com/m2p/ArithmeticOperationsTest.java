package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    void getFourWhenThreeAddedToOne(){
        //Arrange
        ArithmeticOperations arithmeticObject = new ArithmeticOperations();
        int expectedValue = 4;

        //Act
        int actualValue = arithmeticObject.add(3,1);

        //Assert
        assertEquals(expectedValue,actualValue);
    }


}
