package ch06_adstract_interface.myshape;

public class triangle extends shape{
    private double width;//너비
    private double height;//높이

    public triangle(String linecolor, String fillcolor, double  width, double height){
        super(linecolor,fillcolor);
        this.width=width;
        this.height=height;

    }

    @Override
    public double calcAree() {
        return this.width*this.height/2.0;
    }

    @Override
    public double calcperimeter() {
        //삼각형의 둘레 길이를 구하려면, 삼각 함수를 공부해야 합니다.
        return 20.0; // 편의상 20.0이라고 가정
    }

    @Override
    public void display() {
        super.area=this.calcAree();
        super.perimeter=this.calcperimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : "+super.area);
        System.out.println("삼각형의 둘레" + super.perimeter);
        System.out.println("라인 색상 : ");
        System.out.println("채우기 색상 : ");
    }
}
