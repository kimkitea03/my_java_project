package ch04_class;

public class ShapeAreaMain {
    public static void main(String[] args) {
        ShapeArea obj = new ShapeArea() ;

        //메소드 오버로딩
        double PI=3.14;

        obj.area(10,PI) ; // 원
        obj.area( 5, 10 ) ; // 사각형
        obj.area( 5, 15, 10 ) ; // 사다리꼴



    }
}
