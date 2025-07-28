package ch_2_contol_statement;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 12;
        int last_day ;

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                last_day = 31 ;
                System.out.println(month + "월의 마지막 날은 " + last_day+"일 입니다.");
                break;
            case 2:
                last_day = 28;
                System.out.println(month + "월의 마지막 날은 "+ last_day + "일 입니다.");
                break;
            case 4: case 6: case 9: case 11:
                last_day= 30;
                System.out.println(month + "월의 마지막 날은 " + last_day +"일 입니다.");
                break;
            default:
                System.out.println(month + "은 잘못된 입력입니다.");
                System.exit(0);//프로그렘 강제종료 System.exit(0)이렇게만 치면 됨
        }
    }
}
