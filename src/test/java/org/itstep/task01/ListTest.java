package org.itstep.task01;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {

    @Test (expected = FullListException.class)
    public void add() throws FullListException {
        List list = new List(1);
        list.add(1);
        list.add(1);
    }

    @Test (expected = EmptyListException.class)
    public void removeLast() throws EmptyListException, FullListException {
        List list = new List(1);
        list.add(1);
        list.removeLast();
        list.removeLast();
    }
}