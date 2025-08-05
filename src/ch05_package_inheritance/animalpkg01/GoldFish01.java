package ch05_package_inheritance.animalpkg01;

public class GoldFish01 extends Animal01{
    private int gill; // 아가미

    public GoldFish01(String name, int lifespan, String habitat, int speed, int gill) {
        super(name,lifespan,habitat,speed);
        this.gill=gill;
    }


    @Override
    public void showInfo() {
        String message = super.getName()+"아가미 개수는 " + gill+"개 입니다.";
        super.showInfo();
        System.out.println(message);
    }

    public void swim(){//해엄
        String message = super.getName()+"이(가) " +super.getSpeed()+"의 속도로 해엄칩니다.";
        System.out.println(message);
    }

}
