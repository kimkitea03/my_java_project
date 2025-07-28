package ch_2_contol_statement;

public class Stringswitch {
    public static void main(String[] args) {
        String month= "January" ;
        int monthNumber;

        switch (month){
            case "january" :
                monthNumber =1;
                break;
            case "February" :
                monthNumber =2;
                break;
            case "March" :
                monthNumber =3;
                break;
            case "April" :
                monthNumber =4;
                break;
            case "May" :
                monthNumber =5;
                break;
            case "June" :
                monthNumber =6;
                break;
            case "July" :
                monthNumber =7;
                break;
            case "August" :
                monthNumber =8;
                break;
            case "September" :
                monthNumber =9;
                break;
            case "October" :
                monthNumber =10;
                break;
            case "Novermber" :
                monthNumber =11;
                break;
            case "December" :
                monthNumber =12;
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                System.exit(0);

        }
        System.out.println(month + "는 "+"월 입니다.");


    }
}
