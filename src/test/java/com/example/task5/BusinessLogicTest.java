package com.example.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusinessLogicTest {

    @Test
    void test1() {
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.moveObject(4, 8);
        assertEquals(businessLogic.getDepth(), 4);
    }

    @Test
    void test2() {
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.moveObject(18, 46);
        assertEquals(businessLogic.getDepth(), 0);
    }

    @Test

    void test3() {
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.moveObject(6, 9);
        businessLogic.getDepth();
    }

    @Test
    void test4() {
        BusinessLogic businessLogic = new BusinessLogic();
        businessLogic.moveObject(11, 17);
        assertThrows(IllegalArgumentException.class, businessLogic::getDepth);
    }
}