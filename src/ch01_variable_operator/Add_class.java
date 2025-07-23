package ch01_variable_operator;

import java.sql.SQLOutput;

public class Add_class {
    public static void main(String[] args) { //main이 프로그렘 시작점이다4
        //int는 정수이다
        //변수를 선언(정의)
        int x; //정수형 데이터를 위하여 변수 x를 준비해 주세요.
        int y;
        int z;
        //현제 정수 3개 준비한 상태이다


        x = 3 ; // x라는 곳에 숫자 3을 할당(대입) 해주세요. (write)
        y = 5 ;
        z = x + y ; //여기서 x와 y는 위에 내용에서 읽고 z를 대입한다.
        //=은 자바애서 이퀄(같다)이/가 아니다. 오른쪽이 왼쪽으로 할당(대입)하는 것이다.


        String message ; //문자열 데이터를 위하여 변수 message를 준비해 주세요.

        // + 기호의 2가지 역할 : (1) 덧셈, (2) 문자열 결합
        message = x + " 더하기 " + y + " 는(은) " + z ; //수식을 위에 적었으니 +를 (1)수식으로 생각하지말고 (2) 문자열 결합으로만 생각

        System.out.println(message);

        //문장 내에서 변수 선언은 1번만 수행 가능하다 즉 같은 문자로 한번 더 정의할 수 없다는 것이다.

        x = 4 ; // 너 3이지, 없애고 4로 치환해
        y = 8 ;
        z = x * y ;

        message = x + " 곱하기 " + y + " 는(은) " + z ;
        System.out.println(message);

        // 변수 : 데이터를 저장시키기 위한 메모리 성에 붙여 주는 이름
        // 변수 선언 방법 : 데이터타입 변수 이름 : striming name





    }
}
