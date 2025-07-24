package ch01_variable_operator;

public class PlusMinus02 {
    public static void main(String[] args) {
        int x = 3, y = 5 , z ;

        z= x++ + --y ;
        /*
        x = x + 1 = 3 + 1 = 4  /3번째로 계산
        y = y - 1 = 5 - 1 = 4  /1번째로 계산
        z = x + (y - 1) = 3 + (5 - 1) = 7 / 2번째로 계산
       */
        System.out.println("x :" + x); // 4
        System.out.println("y :" + y); // 4
        System.out.println("z :" + z); // 7

        z += --x + y++ ;
        /*
        x = x - 1 = 4 - 1 = 3 /1번째로 계산
        y = y + 1 = 4 + 1 = 5 /3번째로 계산
        z = z + (1 - x) + y = 7 + (1 - 4) + 4 = 14 /2번째로 계산
         */
        System.out.println("x :" + x); // 3
        System.out.println("y :" + y); // 5
        System.out.println("z :" + z); // 14
    }
}
