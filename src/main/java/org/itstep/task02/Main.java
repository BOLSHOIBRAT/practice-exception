package org.itstep.task02;

public class Main {
    public static void main(String[] args) {
        try {
            getPositiveLessHundredNumber(10);
            getPositiveLessHundredNumber(-10);
            getPositiveLessHundredNumber(200);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        } catch (GreatHundredException e) {
            e.printStackTrace();
        }
    }
    public static void getPositiveLessHundredNumber(int num) throws NegativeNumberException, GreatHundredException {
        if (num < 0) {
            throw new NegativeNumberException("Число не должно быть меньше нуля!");
        }
        if (num > 100){
            throw new GreatHundredException("Число должно быть меньше или равно 100!");
        }
    }
}
