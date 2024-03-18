package org.acf.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayBackedSetTest {

    private ArrayBackedSet<String> sbSet;

    @BeforeEach
    void setUp() {
        sbSet = new ArrayBackedSet<>();
    }

    @Test
    void size() {
        int expected = -1;
        int actual = sbSet.size();
        assertEquals(expected, actual);

    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void add() {
    }

    @Test
    void remove() {
    }

    @Test
    void clear() {
    }
}