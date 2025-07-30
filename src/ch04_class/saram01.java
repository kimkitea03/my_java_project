package ch04_class;
// 단계 1 ; 클래스 정의 (선언)
public class saram01 {
    //공유하고자 하는 변수는 static 키워드를 사용합니다.
    static String nationality;

    // 멤버 변수들은 기본 값이 존재한다.
    String name;
    double height;
    double weight;
    String hobby;
    String blood; //보란색 변수 멤버 변수


    //메소드 정의
    //반환타입 메소드이름 (매개변수 리스트){...}
    String showGenderInfo(int juminno) {
        String gender = "";
        if (juminno == 1 || juminno == 3) {
            gender = "남자";
        } else {
            gender = "여자";
        }
        String message = name + "님은 " + gender + "이군요.";
        return message;
    }
        //반환타입 메소드이름 (매개변수 리스트){...}
        //경우에 따라서 ()안에 매개변수가 필요없음

    String showBmiInfo(){
        double newheight = height/100.0 ; // cm를 m로 바꾸는 공식
        double rate = weight/(newheight*newheight); //bmi 공식
        String bmi ="";

        if (rate>=25.00){
            bmi="비만";
        }else if (rate >=23.00){
            bmi="과체중";
        } else if (rate>=18.50) {
            bmi="정상";
        }else{
            bmi="저체중";
        }
        String message = name+"님은 " + bmi+"입니다.";
        return message ;//검정(반전돼서 흰색임)색 지역변수

        }
    //반환타입 메소드이름 (매개변수 리스트){...} 반환 안하면 void사용
    void display(){
        System.out.println(name+"님의 신상 정보");
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name+"님");
        System.out.println("키 : " + height+"cm");
        System.out.println("몸무개 : " + weight+"kg");
        System.out.println("취미 : " + hobby);
        System.out.println("혈액형 : " + blood);

    }

}