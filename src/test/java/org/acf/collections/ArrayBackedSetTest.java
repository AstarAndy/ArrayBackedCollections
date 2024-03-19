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

    @Test
    void containsTests() {
        boolean expected = false;
        boolean actual = sbSet.contains("I am here");
        assertEquals(expected, actual);

        sbSet.add("one");
        sbSet.add("I am here");
        sbSet.add("Three");

        expected = true;
        actual = sbSet.contains("I am here");
        assertEquals(expected, actual);


    }

    @Test
    void addTest() {
        int expected = 0;
        int actual = sbSet.size();
        assertEquals(expected, actual);

        sbSet.add("First One");
        sbSet.add("Another One");

        expected = 2;
        actual = sbSet.size();
        assertEquals(expected, actual);
    }

    //@Test
    void remove() {
    }

    //@Test
    void clearTests() {
        sbSet.add("I am here");
        boolean expected = true;
        boolean actual = sbSet.contains("I am here");
        assertEquals(expected, actual);

        sbSet.clear();
        expected = false;
        actual = sbSet.contains("I am here");
        assertEquals(expected, actual);

    }
}