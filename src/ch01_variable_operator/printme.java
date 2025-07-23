package ch01_variable_operator;

public class printme {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        double weight;
        String blood; // 할당
        char munja = 'd' ; //이렇게 바로 변수 할당과 동시에 정의 할 수 있음
        boolean bool;

        name = "홍길동";
        age = 30;
        height = 175.5;
        weight = 62.4;
        blood = "AB";
//        munja = 'd';
        bool = false;

        String message = "이름 : " + name;
        System.out.println(message);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("몸무게 : " + weight);
        System.out.println("혈액형 : " + blood);
        System.out.println("문자 : " + munja);
        System.out.println("진위 : " + bool);

    }
}
