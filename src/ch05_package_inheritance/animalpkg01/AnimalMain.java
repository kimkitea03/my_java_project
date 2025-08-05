package ch05_package_inheritance.animalpkg01;

public class AnimalMain {
    public static void main(String[] args) {
        Animal01[] animal = {
          new GoldFish01("금붕어",2,"거실 어항",10,2),
          new Lion01("사자",15,"세렝게티",10,4),
          new Eagel01("독수리",20,"푸른창공",50,2)

        };
        for (int i = 0; i < animal.length; i++) {
            animal[i].showInfo();

            if (animal[i] instanceof GoldFish01){
                GoldFish01 goldFish01 = (GoldFish01) animal[i];
                goldFish01.swim();
                System.out.println("---------------------------------------------------------");
            } else if (animal[i] instanceof Lion01) {
                Lion01 lion01 = (Lion01) animal[i];
                lion01.run();
                System.out.println("---------------------------------------------------------");
            } else if (animal[i] instanceof Eagel01) {
                Eagel01 eagel01= (Eagel01) animal[i];
                eagel01.fly();
            }else {

            }

        }
    }
}
