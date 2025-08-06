package ch06_adstract_interface.myshape;

public class circle extends shape{
    private double redius ; //반지름
    private double xpos; //x좌표
    private double ypos; //y좌표


    public circle(String linecolor, String fillcolor, double redius, double xpos, double ypos) {
        super(linecolor,fillcolor);
        this.redius=redius;
        this.xpos=xpos;
        this.ypos=ypos;
    }
    //implementation: 구체화(구현)
    @Override // 부모 클래스의 추상 메서드를 오버라이딩 했습니다.
    public double calcAree() { // 각 클래스는 각자의 맡은 역활을 여기에 구현하면 됩니다.
        return 3.14*this.redius*this.redius;
    }

    @Override //둘레 = 2.0*파이*반지름
    public double calcperimeter() {
        return 2.0*3.14*this.redius;
    }

    @Override
    public void display() {
        super.area=this.calcAree();
        super.perimeter=this.calcperimeter();
        System.out.println("원의 정보");
        System.out.println("원의 면적 : " + super.area);
        String message = "원 중심 : ("+this.xpos+", "+this.ypos+")";

        System.out.println(message);
        System.out.println("원의 둘레" + super.perimeter);

    }

}

