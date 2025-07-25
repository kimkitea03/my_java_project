package ch_2_contol_statement;

public class adultcheck {
    public static void main(String[] args) {
        String name = "홍길동";
        int age = 19 ; //나이
        int _gender = 4; //성별 뒷자리수
        String gender ; //성별 한글
        String adult ;

        if (age>=19){
           adult = "성인" ;
        }else{
            adult = "아동" ;
        }

        if (_gender ==1 || _gender==3){
           gender="남자";
        }else{
            gender="여자";
        }
        String message = " 이름 : "+name+"님, 나이 : "+ age  + "세, 성인체크 : " + adult + ", 성별 : "+ gender ;
        System.out.println(message);

    }
}
