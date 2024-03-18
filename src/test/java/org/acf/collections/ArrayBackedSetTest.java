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
    void sizeTests() {
        int expected = 0;
        int actual = sbSet.size();
        assertEquals(expected, actual);

        sbSet.add("First One");
        sbSet.add("Another One");
        expected = 2;
        actual = sbSet.size();
        assertEquals(expected, actual);

    }

    @Test
    void isEmptyTests() {
        boolean expected = true;
        boolean actual = sbSet.isEmpty();
        assertEquals(expected, actual);

        sbSet.add("Something  there");
        expected = false;
        actual = sbSet.isEmpty();
        assertEquals(expected, actual);

    }

    //@Test
    void contains() {
    }

    //@Test
    void add() {
    }

    //@Test
    void remove() {
    }

    //@Test
    void clear() {
    }
}