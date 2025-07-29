package ch_2_contol_statement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        int total=0, conut=0;//총점,시험본점수
        double average = 0.0;//평균점수 while구문 밑에 두어도 되지만 정수 정리할때 같이 하는게 좋음
        Scanner scan= new Scanner(System.in);//스케너 장치는 java.util에 있는데 수입한다.

        while(true){
            System.out.print("점수 입력 : ");
            int grade= scan.nextInt();//scan.nextInt는 스켄장치에서 grade한테 숫자를 수입한다. 스켄은 밑에 플레이에서 한다.
            System.out.println("숫자 : "+ grade);

            if (grade<=0){
                System.out.println("음수 또는 0이여서 종료합니다.");
                break;
            }
                total += grade; //양수가 아닌 경우 계산을 하면 안되기에 if구문에서 걸러진 뒤 계산할 수 있는 위치에 코딩을 해줌
                conut++;
        }
        System.out.println("총점 : " + total);
        average=total/conut;
        System.out.println("평균 : "+(double)total/conut);//

    }
}
