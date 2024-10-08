package app;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void plus() {
        assertEquals(4, Test.plus(3,1));
    }
}