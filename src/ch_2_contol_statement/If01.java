package ch_2_contol_statement;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        int su = 1 ;

        if(su%2==0){
            System.out.println("숫자"+su+ "은(는) 짝수 입니다.");
            System.out.println("하하하");
        }else{
            System.out.println("숫자 "+su+"은(는) 홀수 입니다.");
            System.out.println("호호호");
        }
        System.out.println("크크크");

        if (su < 5 && su%2 == 0 || su >= 1 ){
            System.out.println("짝수야 " + su + " 놀자~~~");
        }

    }
}
