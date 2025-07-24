package ch01_variable_operator;

public class 문제5 {
    public static void main(String[] args) {
        int x = 14 , y = 5 ;
        System.out.println("더하기 : " + (x + y));
        System.out.println("빼기 : " + (x - y));
        System.out.println("곱하기 : " + (x * y));
        System.out.println("나누기 : " + (x / y));
        System.out.println("나머지 : " + (x % y));

        System.out.println("동일 라인에선 곱셈 / 나눗셈이 먼저 실행 됩니다. : " + (2+3*3));
        System.out.println((2+3)*3);
        System.out.println(14/5.0);
    }
}
