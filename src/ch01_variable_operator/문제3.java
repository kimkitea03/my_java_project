package ch01_variable_operator;

public class 문제3 {
    public static void main(String[] args) {

        //변수 정의, 대입
        double a = 10.0 ; //반지름
        double b = 3.14 ; //원주율
        // 반지름 * 반지름 * 원주율 = 원의 면적
        double c = a * a * b ; //면적

        //출력
        System.out.print("반지름이 " + a + "일때");
        System.out.println("원의 면적은 " + c + "입니다");
    }
}
