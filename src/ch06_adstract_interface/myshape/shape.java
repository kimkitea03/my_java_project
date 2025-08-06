package ch06_adstract_interface.myshape;

public abstract class shape {
    //일반화 : 모든 도형에서 사용하는 면적, 둘레, 라인 색상, 채우기 생상등은 수퍼 클래스에서 사용합니다.
    protected double area; //면적
    protected double perimeter;//도형의 둘래
    private String linecolor;//라인 색상
    private String fillcolor;//채우기 생상

//내용이 정의되지 않는 모델 개념으로, 불완전한 메서드이다.
    public abstract double calcAree();
    public abstract double calcperimeter();
    public abstract void display();


    public shape() {
    }

    public shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor;
        this.fillcolor = fillcolor;
    }



}
