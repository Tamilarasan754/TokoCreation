package com.KGiSL.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for simple App.
 */
 //@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {
    // @BeforeAll
    // static void beforeAll() {
    //     System.out.println("Before all tests");
    //     // Setup code that should run once before any test methods
    // }
    // @Test
    // void myTest1() {
    //     System.out.println("myTest1");
    // }
 
    // @Test
    // void myTest2() {
    //     System.out.println("myTest2");
    // }
    

    

    // @AfterAll
    // static void afterAll() {
    //     System.out.println("After all tests");
    //     // Cleanup code that should run once after all test methods
    // }

    @BeforeEach
    @Timeout(2)
    void beforeEach(TestInfo testInfo) {
        System.out.println("Before each test: " + testInfo.getDisplayName());
        // Setup code that should run before each test method
    }

    @AfterEach
    void afterEach() {
        System.out.println("After each test");
        // Cleanup code that should run after each test method
    }

    @Test
      @DisplayName("My Test Method 3")
     @Order(1)
     @RepeatedTest(5)
    // @Tag("slow")
    void testMethod1() {
        System.out.println("Test method 1");
        // Test logic for method 1
    }
    @Test
       @DisplayName("My Test Method 1")
     // @Order(2)
    // @Tag("slow")
    void testMethod2() {
        System.out.println("Test method 3");
        // Test logic for method 1
    }

    @Test
       @DisplayName("My Test Method 2")
   @Order(3)
    void testMethod3() {
        System.out.println("Test method 2");
        // Test logic for method 2
    }

    @Nested
    @DisplayName("Nested Test Class")
     @TestMethodOrder(MethodOrderer.Random.class)
    class NestedTestClass {

        @Test
        @DisplayName("Nested Test Method 1")
        @Order(2)
        void nestedTestMethod1() {
            System.out.println("Nested Test method 1");
            // Test logic for nested method 1
        }

        @Test
        @DisplayName("Nested Test Method 2")
        @Order(1)
        void nestedTestMethod2() {
            System.out.println("Nested Test method 2");
            // Test logic for nested method 2
        }
    }
    // @ParameterizedTest
    // @CsvSource({"1, 1, 2", "2, 3, 5", "3, 5, 8", "4, 8, 12"})
    // void addNumbers(int a, int b, int expectedResult) {
    //     Calculator calculator = new Calculator();
    //     int result = calculator.add(a, b);
    //     assertEquals(expectedResult, result, () -> a + " + " + b + " should equal " + expectedResult);
    // }

    // // Class representing a simple calculator
    // static class Calculator {
    //     int add(int a, int b) {
    //         return a + b;
    //     }
    // }
    //  @Test
    // @Timeout(5)
    // void testWithTimeout() throws InterruptedException {
    //     // Simulate a task that takes more than 5 seconds to complete
    //     Thread.sleep(6000);
    //     System.out.println("This should not be reached within 5 seconds");
    // }

    @Test
   //@RepeatedTest(5)
    @Disabled("This test is disabled for now")
    void disabledTest() {
        System.out.println("This test is disabled");
        // Test logic for disabled test

    }

    
}

