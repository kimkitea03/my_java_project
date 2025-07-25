package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        double d = 100 ;
        System.out.println("d : " + d);
        // 100.0 이 된다 (이걸 암시적인 형 변환이라고 한다.)

        int i = (int)12.5 ;
        System.out.println("i : " + i);
        // 12가 나온다 (int)라는 캐스팅 연산자를 사용하여 바꿔줬기에 이걸 암묵적 형 변환이라 한다.

        //               명시적            암시적
        // (double) 14/5 -------> 14.0/5------------> 14.0/5.0------------>2.8
        System.out.println( 14/5 );
        System.out.println( (double)14/5 );
        //double이라는 실수 타입을 이용하여 14.0/5를 만들었다.(명시적 형변환) 14.0은 실수 5는 정수기에 프로그렘이 실수로 변환하여 14.0/5.0 이라고 바꾸었다 (암시적 형변환)


        //               산술연산                    명시적
        //(double) (14/5) ------------> (double)(2) -------------> 2.0
        System.out.println( (double)(14/5) );
        // (14/5)를 계산한뒤 나온 수를 실수로 대입했다 따라서 (14/5)를 계산하고 나온 수인 2를 정수에서 실수인 2.0으로 바꾸었다 (명시적 형변환)

        int kor = 50 , eng = 60 , math = 80 ;

        int total = kor + eng + math ;
        double everage = total/3 ;
        /*     산술연산   암시적
           190/5 ----> 63 ---> 63.0
          everage에 대입하기 전 산술을 먼저 함 그 후 everage에 대입할때 암시적 형변환이 이루어지기에 63.0이 되는 것
          뒷자리 소수점도 정확하게 만들어주길 바란다면 나누는 값에 .0으로 바뀌주던가 total 앞에 (double)을 넣어주던가
          int total을 double total로 바꾸어 주면 된다
         */

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + everage);

        //예시
        everage = total/3.0 ;
        System.out.println("평균 : " + everage);

        char ch1 = 'c' ;
        char ch2 = 'a' ;

        boolean bool1 = ch1 > ch2 ;
        // 암시적 형변환이 되므로 99 > 97 즉 진실이 된다.
        System.out.println("bool1 : " + bool1);

        int resurt = ch1 - ch2 + 5 ;
        System.out.println("resurt : " + resurt);

        char ch3 = 'a' ;

        String co = ch3 >= 'A' && ch3 <= 'Z' ? "yes" : "no" ;
        //소문자는 중간에 다른 표기에 바스킷 코드가 있어서 대문자로 만드는게 더 효율적이다.
        String message = "ch3이 대문자 입니까? " + co ;
        System.out.println( message);


    }
}
