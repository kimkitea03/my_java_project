package ch06_adstract_interface.cartest;

public class Avante extends Car{
    private String comment;

    public Avante(String name, int price, Key key, String comment) {
        super(name, price, key);
        this.comment = comment;
    }

    @Override
    public String toString() {
        String message = "코멘트 : "+ comment;
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
