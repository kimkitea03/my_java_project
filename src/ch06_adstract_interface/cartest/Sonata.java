package ch06_adstract_interface.cartest;

public class Sonata extends Car{
    private String maker;

    public Sonata(String name, int price, Key key, String maker) {
        super(name, price, key);
        this.maker = maker;
    }

    @Override
    public String toString() {
        String message = "메이커 : "+ maker;
        return super.toString() + message;
    }

    @Override
    public void display() {
        String message= super.getName()+"의 현재 속도"+super.speed+"km";
        System.out.println(message);
    }

    @Override
    public void speedup(int speed) {
        super.speed+=speed;
        super.speed=super.checkspeed();

    }

    @Override
    public void speeddoun(int speed) {

        super.speed-=speed <0 ? -speed:speed;
        String message= super.getName()+"의 현재 속도"+super.speed+"km";
        System.out.println(message);

    }
}
