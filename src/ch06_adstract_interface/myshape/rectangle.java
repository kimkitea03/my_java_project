package ch06_adstract_interface.myshape;

public class rectangle extends shape {
    private double width;//너비
    private double height;//높이

    public rectangle(String linecolor, String fillcolor, double width, double height) {
        super(linecolor,fillcolor);
        this.width=width;
        this.height=height;
    }

    @Override
    public double calcAree() {
        return this.width*this.height;
    }

    @Override
    public double calcperimeter() {
        return (this.height+this.width)*2;
    }

    @Override
    public void display() {
        super.area=calcAree();
        super.perimeter=this.calcperimeter();
        System.out.println("사각형 정보");
        System.out.println("면적 : " + super.area );
        System.out.println("사각형의 둘레" + super.perimeter);

    }

}
