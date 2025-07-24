package ch01_variable_operator;

public class ms10 {
    public static void main(String[] args) {
        int a = 30, b = 50 ;
        int result = 0 ;
        result= a >= b ? a - b : b - a ;
        /*
         a가 b 이상이면 a-b 해주시고 이상이 아니면 b-a 해주세요

        사용 형식 : result = Condition ? truepart : falsepart ;
        한국말로 사용 형식 풀이 : result = 조건식 ? 참일때 : 거짓일때
         Condition은 조건식을 의미하며, 식이 참인 경우 truepart 영역이 실행됩니다.
        거짓이면 falsepart 영역이 실행됩니다
        condition, trepart, falsepart는 항 1,2,3이다
        삼항 연상자 또는 조건 연상자라고 함
         */
        System.out.println("절대 값" + result);


        int x = 5 ;

        result = x%2 == 0 ? x+3 : x*x ;
        /* 짝수 홀수 대입하는 방법 변수 % 2 == 0/ 2로 계속 나누면 짝수일 경우 0 홀수일 경우 1이기 때문임
        x가 짝수면 3더해주고 작으면 제곱해줘
         */
        System.out.println("결과 : " + result);


        x=8 ;
        int y = 40 ;
        result = x >= y ? x : y ;
        // x가 y보다 크거나 같으면 x를 보여주고 아니면 y를 보여줘
        System.out.println("큰 수" + result);

        result = x <= y ? x : y ;
        // x가 y보다 작거나 같으면 x를 보여주고 아니면 y를 보여줘
        System.out.println("작은 수" + result);



        x = 5 ;
        y = 12 ;

        String str = y%x == 0 ? "Yes" : "No" ;
        // 문자가 들어가기에 int로 시작하는 것이 아닌 String으로 시작해야 함
        System.out.println("정수가 : " + str );

        int su = 7 ;// 숫자 7은(는) 홀수입니다.

        String clf = su%2 == 0 ? "짝수 입니다" : "홀수입니다" ;
        String mmessage = su + " 은(는) " + clf;
        System.out.println(mmessage);
        //message로 정리해서 sout에 넣으면 보기에 더 깔끔한 것 같다.

        int score = 30 ; //60점 이상이면 합격 85점이므로 합격입니다.
        String vkf = score >= 60 ? " 이여서 합격 입니다." : " 이여서 불합격 입니다." ;
        String Message = "60점 이상이면 합격 " + score + vkf ;
        System.out.println(Message);

    }
}
