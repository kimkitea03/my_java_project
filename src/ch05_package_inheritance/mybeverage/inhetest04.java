package ch05_package_inheritance.mybeverage;

public class inhetest04 {
    public static void main(String[] args) {
        beverage04 beverage1 = new americano04("아메리카노",4000.0,250.0);
        //승급: 서브클래스가 일시적으로 슈퍼 클래스의 타입으로 변환이 되는 과정

        //슈퍼 클래스에 있는 메서드는 상속 개념에 의하여 접근이 가능함.
        beverage1.showInfo();

        System.out.println(beverage1.toString());

        //승급시 서브 클래스의 변수와 메서드는 일시적으로 접근을 못하게 설계되어 있습니다.
        //단, 강등을 하게 되면 서브 클래스 내의 변수와 매소드를 접근할 수 있게 된다.
        americano04 ame =  (americano04)beverage1;//강등
       ame.sipAmericano();



        beverage04 beverage2 = new espersso04("에스프레소",5000.0,2);
        beverage2.showInfo();

        espersso04 esp = (espersso04) beverage2;
        esp.drinkessopreso();

        beverage04 beverage3 = new latte04 ("라떼" ,6000.0,"아몬드 우유");
        beverage3.showInfo();

        latte04 lat = (latte04) beverage3;
        lat.enjoylatte();

        //승급 개념과 배열 같이 사용하기
        // 배열 초기화 기법 : 타입[] 배열이름={요소1,요소2,...}

        beverage04[] beverage = {
                beverage1,
                new espersso04("마이뿌레소",2000.0,1),
                new latte04 ("바나나 라떼" ,3000.0,"바나나 우유")

        };

        for (int i = 0; i < beverage.length ; i++) {
            System.out.println("----------------------");
            beverage[i].showInfo();

            System.out.println(beverage[i].toString());

//          객체 beverage[i]는 americano04 클래스로 생성된 물건이 맞나요?
            if(beverage[i] instanceof americano04){
                americano04 xxx= (americano04) beverage[i];
                xxx.sipAmericano();
            } else if (beverage[i] instanceof espersso04){
                espersso04 yyy= (espersso04) beverage[i];
                yyy.drinkessopreso();
            }else if (beverage[i] instanceof latte04){
                latte04 zzz= (latte04) beverage[i];
                zzz.enjoylatte();
            }else{

            }
        }


    }
}
