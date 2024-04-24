package io.codelex;

import io.codelex.JavaAdvancedTest.Exercise3.Joiner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoinerTest {

    @Test
    void shouldJoinInt() {
        Joiner<Integer> joiner = new Joiner<>("-");
        assertEquals("1-2-3-4-5", joiner.join(1, 2, 3, 4, 5));
    }

    @Test
    void shouldJoinString() {
        Joiner<String> joiner = new Joiner<>(" ");
        assertEquals("Hello world from Joiner", joiner.join("Hello", "world", "from", "Joiner"));
    }

}
