package ch_2_contol_statement;

import javax.swing.*;

public class Exam4_18 {
    public static void main(String[] args) {
        int su = 7;

        for (int i = 1; i <=su ; i++) {
            String message = i + "의 제곱은 " + (i*i) +"입니다.";
            System.out.println(message);

        }

        int su01 = 3;
        int su02 = 7;
        int su03 = 0;

        for (int i = su01; i <= su02 ; i++) {
            su03 += i;
        }
        String message1 = su01 + "부터 " + su02 +"까지의 합은 "+ su03 +"입니다.";
        System.out.println(message1);
    }
}
