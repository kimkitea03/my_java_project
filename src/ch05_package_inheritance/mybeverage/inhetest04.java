package ch05_package_inheritance.mybeverage;

public class inhetest04 {
    public static void main(String[] args) {
        beverage04 beverage1 = new americano04("아메리카노",4000.0,250.0);
        //승급: 서브클래스가 일시적으로 슈퍼 클래스의 타입으로 변환이 되는 과정

        //슈퍼 클래스에 있는 메서드는 상속 개념에 의하여 접근이 가능함.
        beverage1.showInfo();

        //승급시 서브 클래스의 변수와 메서드는 일시적으로 접근을 못하게 설계되어 있습니다.
        //단, 강등을 하게 되면 서브 클래스 내의 변수와 매소드를 접근할 수 있게 된다.
        americano04 ame =  (americano04)beverage1;//강등
       ame.sipAmericano();



//        americano04 beverage2 = new espersso04("에스프레소",5000.0,2);
//        americano04 beverage3 = new latte04 ("아메리카노",6000.0,"아몬드 우유");


    }
}
