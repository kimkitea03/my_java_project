package ch06_adstract_interface.cartest;

public class Grandeur extends Car{
    private double fuel; // 연비
    private String remark; // 연비에 대한 메모

    public Grandeur(String name, int price, Key key, double fuel) {
        super(name, price, key);
        this.fuel = fuel;
        if (this.fuel>=20.0){
            this.remark="better";
        } else if (this.fuel>=15.0) {
            this.remark="good";
        }else {
            this.remark="poor";
        }
    }



    @Override
    public String toString() {
        String message = "연비 : "+ this.fuel +"\n";
        message += "연비 메모 : "+this.remark;
        return super.toString() + message;
    }

    @Override
    public void display() {
        Double mileSpeed = super.speed/1.6 ;
        String message= super.getName()+"의 현재 속도"+mileSpeed+"mile";
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
