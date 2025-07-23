package ch01_variable_operator;

public class 문제2 {
    public static void main(String[] args) {

        //변수 정의, 대입
        double a = 20.0 ; //밑변
        double b = 10.0 ; //윗변
        double c = 15.0 ; //높이
        double d = (a + b) *c/2 ; // 면적
        // 면적 = (밑변 + 윗변) * 높이

        //출력
        System.out.println("밑변 : " + a);
        System.out.println("윗변 : " + b);
        System.out.println("높이 : " + c);
        System.out.println("면적 : " + d);

    }
}
