package ch01_variable_operator;

public class ms7 {
    public static void main(String[] args) {
        int a = 10 , b = 20, c ;

        c = ++a + b++ ;
        /*
        c  =  **a  +  b++   ++가 변수 앞에 있으면 나한테 가장 먼저 1 증가시켜 , ++가 변수 뒤에 있으면 날 가장 마지막에 1 증가시켜
      순서  3   1   2   4
      따라서 a = 1 + a , c = (1 + a) + b , b = b + 1 이 됨
      여기서 c = (1 + a) + (1 + b)가 되지 않은 이유는 b++보다 = 이 먼저 실행되기 때문에 c = (1 + a) + b 가 되는거다.
         */

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

           c = a++  +  --b ;
        /*   3  4   2   1
        a = 1 + a
        b = 1- b
        c = a + (1 - b)
         */
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a = 15 ;
        b = 12 ;

            c = --a + --b ;
        /*    4  1  3  2
        a = a - 1
        b = b - 1
        c = (a - 1) + (b - 1)
         */

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a = 10 ;
        b = 20 ;

        ++a ; // a = 10 + 1 = 11
        b-- ; // b = 20 - 1 = 19
        c = ++a + b--; // c = (11 + 1) + 19 = 31
        // b= 19-1 = 18 , a = 12 , c = 31

        /*
        a = 1 + 1 + a
        b = b - 1 - 1
        c = (1 + 1 + a) + (b - 1) / c = (1 + 1 + 10) + (20 - 1)
        칸이 다르면 후위 증감 연산자라도 먼저 계산이 되어 내려온다.


         */

        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

    }
}
