package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class EncodingTest {

    @Test
    void testBase64EncodingAndDecoding() {
        Encoding enc = new Encoding();
        String s = "Hello, world!";
        String e = "SGVsbG8sIHdvcmxkIQ==";
        Assertions.assertEquals(e, Encoding.encodeToBase64(s));
        Assertions.assertEquals(s, Encoding.decodeFromBase64(e));
    }
}