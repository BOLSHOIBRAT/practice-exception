package org.itstep.task01;

public class Main {
    public static void main(String[] args) {
        List list = new List(10);
        for (int i = 0; i < 11; i++) {
            try {
                list.add(i);
            } catch (FullListException e) {
                System.err.println(e.getMessage());
            }
        }
        for (int i = 0; i < 11; i++) {
            try {
                list.removeLast();
            } catch (EmptyListException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
