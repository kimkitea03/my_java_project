package ch01_variable_operator;

public class Operator01 {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 8 ;

        boolean bool1 = a != b ; //a는 10 b는 8이다 수식은 a와 b는 같지 않다 이다 그러므로 진실이 나온다
        boolean bool2 = --a == b++ ; // (10-1)은 9, (8+1)은 9이다 하지만 B++는 마지막에 계산되는 것이므로 9 == 8이다 그러므로 거짓이 나온다
        boolean bool3 = a++ != --b ;  // 9 != (9-1) 이므로 거짓
        boolean bool4 = bool3 && (5>7) ; // 10 != 7 && (5>7) 수식1 참 수식 2 거짓 이므로 거짓
        boolean bool5 = !bool4 || ( bool1 && bool2 ) ;
        /*! 11 != 6 && (5>7) || 11 != 8 && (11-1) == 7 진실 ||거짓이므로 참
        !로 인하여 거짓이였던 bool4 가 진실이 됨
         */

        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("bool3 : " + bool3);
        System.out.println("bool4 : " + bool4);
        System.out.println("bool5 : " + bool5);


    }
}
