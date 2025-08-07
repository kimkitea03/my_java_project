package ch05_package_inheritance.animaltest;

public class uniconmain {
    public static void main(String[] args) {

        unicon unidol = new unicon("유니돌","M","당근");
        unidol.display();
        unidol.flutter();

        System.out.println();

        unicon unison = new unicon("유니순","F","건초");
        unison.display();


        //다향성 테스트
        //unicon을 animal, horse, vird 타입으로 다뤄 봅니다.

        animal Animal = new unicon("다향성","M","사과");
        Animal.eat();

        horse Horse = (horse) Animal;
        Horse.run();

        bird Bird = (bird) Horse;
        Bird.fly();
    }
}
