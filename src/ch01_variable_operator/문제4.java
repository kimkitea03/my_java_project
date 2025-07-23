package ch01_variable_operator;

public class 문제4 {
    public static void main(String[] args) {

        int width = 10 ;
        int height = 5 ;
        int erea = width * height ;
        int perimeter = (width + height) * 2 ;


        System.out.println("밑면은 " + width + " 이다 ");
        System.out.println("길이는 " + height + " 이다");
        System.out.println("사각형의 넓이를 구하는 식을 대입하면" + width + " * " + height + " 이다");
        System.out.println("따라서 사각형의 넓이는 " + erea + " 이다 ");
        System.out.println("사각형의 둘래를 구하는 식을 대입하면" + '(' + width + " + " + height + ") * " + "2 이다" );
        System.out.println("따라서 사각형의 둘래는 " + perimeter + " 이다 ");
    }
}
