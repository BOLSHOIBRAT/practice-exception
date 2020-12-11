package org.itstep.task03;

public  class Triangle {

    private final int side1;
    private final int side2;
    private final int side3;

    public Triangle(int side1, int side2, int side3) throws CreateTriangleException {
        if ((side1 + side2) < side3) {
            throw new CreateTriangleException("Невозможно создать треугольник по заданным сторонам");
        }
        if ((side2 + side3) < side1){
            throw new CreateTriangleException("Невозможно создать треугольник по заданным сторонам");
        }
        if ((side3 + side1) < side2){
            throw new CreateTriangleException("Невозможно создать треугольник по заданным сторонам");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
