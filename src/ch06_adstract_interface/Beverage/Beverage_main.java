package ch06_adstract_interface.Beverage;

public class Beverage_main {
    public static void main(String[] args) {
        Beverage[] beverages={
          new Americano("아메리카노",4000.0,2),
          new Espresso("에스프레소",2000.0,30),
          new Latte("라떼",3000.0,"스팀 된 우유")

        };

        for (int i = 0; i < beverages.length ; i++) {
            System.out.println("------------------------------------------------------------");
            beverages[i].showDate();
            beverages[i].drink();
            beverages[i].make();
            System.out.println();


        }

    }
}
