package ch01_variable_operator;

public class new_class_2 {
    public static void main(String[] args) {
        String name ;
        double kor , eng ;
        double average;
        // 같은 타입이면 ,(콤마)로 한 줄에 쓸 수 있음 예) double kor, eng ;

        name = "홍길동" ;
        kor = 40.0 ;
        eng = 43.0 ;
        average = (kor+eng)/2 ; //평균 구하는 법은 (a+b)/더할 것들에 갯수

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("평균 : " + average);
    }
}
