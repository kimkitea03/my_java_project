package ch05_package_inheritance.animaltest;

public interface bird {
     //public static final int speed=300; 앞에  퍼블릭, 스테틱, 파이널을 적든 안적든 포함이다.
     int speed=300;


    void fly();//pubilc abstract void fly();

    default void flutter(){// 기본 동작 정의
        System.out.println("날개를 펄럭입니다.");
    }

}
