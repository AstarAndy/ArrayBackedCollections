package org.acf.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class ArrayBackedSet<E> implements Set<E> {

    private static final int DEFAULT_BLOCK_SIZE = 16;
    private E[] internalTable;
    private int nbrEntries;

    public ArrayBackedSet() {

        this(DEFAULT_BLOCK_SIZE);
    }

    @SuppressWarnings("unchecked")
    public ArrayBackedSet(int initialSize) {
        nbrEntries = 0;
        internalTable = (E[]) new Object[initialSize];
    }


    @Override
    public int size() {
        return nbrEntries;
    }

    @Override
    public boolean isEmpty() {

        return (nbrEntries == 0);

    }

    @Override
    public boolean add(E e) {
        nbrEntries++;
        if (nbrEntries > internalTable.length) {
            resizeTable();
        }

        internalTable[(nbrEntries - 1)] = e;

        return true;

    }

    @Override
    public boolean contains(Object o) {
        return true;
        //throw new ArrayIndexOutOfBoundsException("contains (E e) method. Fix for testing");

    }

    @Override
    public void clear() {
        return;
        //throw new ArrayIndexOutOfBoundsException("contains (E e) method. Fix for testing");

    }

    protected boolean resizeTable() {
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
        //throw new ArrayIndexOutOfBoundsException("contains (E e) method. Fix for testing");

    }

    /*
        The remaining methods will be implemented at a later day
     */

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

}
