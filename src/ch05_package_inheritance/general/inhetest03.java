package ch05_package_inheritance.general;

public class inhetest03 {
    public static void main(String[] args) {
        // 다양한 음료 객체 생성
        americano03 americano = new americano03("아메리카노",4000.0,200.0);
        Espresso03 Espresso = new Espresso03("에스프레소",5000.0,2);
        latte03 latte = new latte03("라테",6000.0,"아몬드 우유");

        americano.printInfo();

        Espresso.printinfo();

        latte.printinfo();

    }


}
