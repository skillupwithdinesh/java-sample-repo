package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    void testAdd2() {
        assertEquals(50, App.add(20, 30));
    }

    @Test
    void testAdd3() {
        assertEquals(15, App.add(20, -5));
    }
}
