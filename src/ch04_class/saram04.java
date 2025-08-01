package ch04_class;

import java.util.Scanner;

public class saram04 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    Scanner scan = null;//해당 장치를 생성자에서 초기화 시킴

    //public 반환타입 이름 (매게변수) {...}

    public saram04(String name, double height, double weight, String hobby, String blood){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.hobby=hobby;
        this.blood=blood;

    }

    public saram04(){//생성자는 반환타입을 적을 필요가 없다.
        this.name="김철수";
    }

    public saram04(String name, double height, double weight, String blood) {
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.hobby="볼링";
        this.blood=blood;

    }


    public void display() {
        System.out.println("이름 : "+this.name);
        System.out.println("키 : "+this.height);
        System.out.println("몸무게 : "+this.weight);
        System.out.println("취미 : "+this.hobby);
        System.out.println("혈액형 : "+this.blood);


       // if (scan==null){
         //   System.out.print("정수 입력 : ");
           // int su = this.scan.nextInt();
            //System.out.println("입력된 정수 : "+su);
        }

}
