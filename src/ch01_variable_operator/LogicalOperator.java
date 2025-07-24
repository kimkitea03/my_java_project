package ch01_variable_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        int x=3, y=2 ;
        System.out.println("x : " + x + " , y : " + y);
        System.out.println("수식 : (x >= y) " + (x >= y));
        System.out.println("수식 : !(x >= y) " + !(x >= y));
        System.out.println("수식 : (x == y) " + (x == y));
        System.out.println("수식 : (x != y) " + (x != y));

        System.out.println("수식 : (-1 < 0) " + (-1 < 0));

        System.out.println("수식 : ((3>2) && (3>4)) " + (( 3 > 2 ) && ( 3 > 4 )));
        /*3은2이보다 크다 식 1번 진실 3은4보다 크다 식 2번 거짓 &&은 논리곱이기에 거짓으로 증명됨
        3은 2보다 크고 3은 4보다 큼 (식 1번은 맞았지만 식 2번에서 모순이 생김)
         */
        System.out.println("수식 : (( x != y ) && ( -1 > 0 )) " + (( x != y ) && ( -1 > 0 )));
        /* x와 y는 같지않다 x는 3 y는 2 식 1번 참 -1은 0보다 크다 식 2번 거짓 &&이 논리 연산자로 들어왔기에 거짓으로 증명됨
        x(3)와/과 y(2)는 같지 않고 -1은 0보다 크다 (식 1번은 맞았지만 식 2번에서 모순이 생김)
         */
        System.out.println("수식 :  ('a' > 'b') " + ('a' > 'b'));
        /*문자는 순서대로 정리하여 내부적으로 숫자(바스킷코드)로 바뀐다
         'a'는 98로 'b'는 99로 바뀌어 수식이 98>99가 되어 거짓으로 증명됨

         */
        System.out.println("수식 : " + (x >= y));
    }
}
