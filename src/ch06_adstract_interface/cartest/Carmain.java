package ch06_adstract_interface.cartest;

public class Carmain {
    public static void main(String[] args) {
    Car[] mycar = {
            new Avante("아반떼",100,Key.KEY,"가장 많은 판매"),
            new Sonata("소나타",300,Key.SMART,"Hyundai"),
            new Grandeur("그랜져",200,Key.SMART,19.5)
    };

        for (int i = 0; i < mycar.length ; i++) {
            System.out.println("=====================================");
            mycar[i].trunOn();
            Radio.play(Frequency.FM, 91.9);
            mycar[i].sayHello(mycar[i].getName(),2);

            // 객체 출력한다는 의미는 암시적으로 toString() 메소드를 호출합니다.
            System.out.println(mycar[i]);

            mycar[i].display();

            mycar[i].speedup(20);
            mycar[i].display();

            mycar[i].speedup(Speed.ALLOWED_MAX_SPEED);
            mycar[i].display();

            mycar[i].speeddoun(15);
            mycar[i].display();

            mycar[i].trunOff();


        }
    }
}
