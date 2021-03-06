package com.ats.simpletest2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleTest2Test {

    /*
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }
    */

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
        System.out.println("@BeforeEach - executes before each test method in this class");
    }

    @Test
    void testSingleSuccessTest() {
        System.out.println("Success");
    }

    @Test
    void testSimpleTestMain() {
        SimpleTest2.main(null);
    }

    @Test
    void echo() {
        String input = SimpleTest2.echo("input");
        //ok
        assertEquals("input", input);
        //fail
        assertEquals("input", input);
    }

}