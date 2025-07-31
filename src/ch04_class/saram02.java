package ch04_class;

public class saram02 {
    //static변수= 클래스 변수(클래스 이름으로 접근이 가능하기에 클래스 변수라고 부름)=정적 변수
    static String nationality = "대한민국" ;

    //멤버 변수들(인스턴스 변수)
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    //double PI = 3.14; //인스턴스 변수
    final double PI = 3.14; //final을 사용하면 읽기만 가능해짐 / 상수 (constant)

    public void display() {//멤버 메소드
        //PI = 5.14;
        int total = 0;
        for (int i = 1; i <11 ; i++) {
            total+=i; // 색이 없는 변수는 지역변수

        }
        System.out.println("총합 : "+total);


        System.out.println("국적 : "+nationality); // 보라색인데 누워있는건 스테틱변수
        System.out.println("이름 : "+name);
        //보란색 변수는 멤버 변수
        System.out.println("키 : "+height);
        System.out.println("몸무개 : "+weight);
        System.out.println("취미 : "+hobby);
        System.out.println("혈액형 : "+blood);
    }
}
