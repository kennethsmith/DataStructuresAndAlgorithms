package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashingTest {

    @Test
    void hash() throws Exception {
        Hashing hash = new Hashing();
        String a1 = Hashing.hash("a");
        String a2 = Hashing.hash("a");
        String b = Hashing.hash("b");
        assertEquals(a1, a2);
        assertNotEquals(a1, b);
    }

    @Test
    void hashException() {
        assertThrows(
            Exception.class,
            () -> {
                Hashing.hash("a", "a");
            },
            "Expected Hashing.hash to throw, but it didn't"
        );
    }
}