package ch05_package_inheritance.animalpkg01;

public class Lion01 extends Animal01{
    private int leg; //다리

    public Lion01(String name, int lifespan, String habitat, int speed, int leg) {
        super(name,lifespan,habitat,speed);
        this.leg=leg;
    }

    @Override
    public void showInfo() {
        String message = super.getName()+"의 다리 개수는 "+this.leg+"개 입니다.";
        super.showInfo();
        System.out.println(message);

    }

    public void run(){//뛰기
        String message = super.getName()+"이(가) "+this.getSpeed()+"의 속도로 달려 갑니다.";
        System.out.println(message);
    }

}
