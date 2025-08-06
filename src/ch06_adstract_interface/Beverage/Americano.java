package ch06_adstract_interface.Beverage;

public class Americano extends Beverage{
    private double shot;

    public Americano(String name, double price, int shot) {
        super(name,price);
        this.shot=shot;
    }

    @Override
    public void drink() {
        String message=super.name+"를 홀짝홀짝 마십니다.";
        System.out.println(message);
    }

    @Override
    public void make() {
        System.out.println(super.name+"의 제조법================================");
        String message="뜨거운 물 450ml와 에스프레소 "+shot+"샷을 준비해 줍니다.";
        System.out.println(message);
        message="뜨거운물 450ml를 컵에 담아준 뒤 에스프레소 "+shot+"샷을 따라주어 만들어 줍니다.";
        System.out.println(message);

    }
}
