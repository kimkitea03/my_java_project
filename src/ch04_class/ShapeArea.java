package ch04_class;

public class ShapeArea {

    public void area(int i, double y) {
        System.out.println("원의 넓이: " +((i*i)*y));

    }
    public void area(int i, int a) {
        System.out.println("사각형의 넓이: " +(i*a));

    }

    public void area(int i, int i1, int i2) {
        System.out.println("사다리꼴의 넓이: " +((i+i1)*i2)/2);
    }
}
