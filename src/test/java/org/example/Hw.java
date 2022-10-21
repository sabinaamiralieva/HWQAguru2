package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Hw {

    @Test
    public void exampleTest0() {
        Assertions.assertFalse(2 > 1);
    }

    @Test
    void exampleTest1() {
        Assertions.assertTrue(5  >= 2);
    }
}