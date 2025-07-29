package ch_2_contol_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        int total=0, count =0;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("점수 입력 : ");
            int gard = scan.nextInt();
            System.out.println("숫자 : "+gard);

            if (gard >= -9 && gard <= 0) {
                gard = -gard;
            }else if (gard < -10){
                System.out.println("시스템을 종료합니다.");
                break;
            }else {

            }
            total += gard;
            count++;
        }

        System.out.println("총점 : "+total);
        System.out.println("평균 : "+(double)total/count);

    }
}
