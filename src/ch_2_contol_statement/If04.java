package ch_2_contol_statement;

import javax.swing.*;

public class If04 {
    public static void main(String[] args) {
        int score = 75 ;
        String point ;

        if(score >=90 ){
            point = " A ";
        }else if (score >= 80 && score <90){
            point =" B ";
        } else if (score >= 70 && score <80) {
            point = " C ";
        } else if (score>=60 && score < 70) {
            point = " D ";
        }else{
            point = " F ";
        }
        String message = "당신의 성적은"+ point + "입니다.";
        System.out.println(message);
    }
}
