package ch05_package_inheritance.animalpkg01;

public class Animal01 {
    private int lifespan ; //수명
    public String name; // 이름
    private String habiat; // 서식지
    public int speed; // 속도

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Animal01(){

    }

    public Animal01(String name,int lifespan, String habiat, int speed){
        this.name=name;
        this.lifespan=lifespan;
        this.habiat=habiat;
        this.speed=speed;

    }


    public void showInfo() {
        String message="평균 수명이"+this.lifespan+"인 " + this.name+"의 ";
        message += "서식지는 "+this.habiat+"입니다";
        System.out.println(message);
    }
}
