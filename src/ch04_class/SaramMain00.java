package ch04_class;

public class SaramMain00 {
    public static void main(String[] args) {
        String yusin_nationality;
        String yusin_name;
        double yusin_hihgt;
        double yusin_weight;
        String yusin_hobby;
        String yusin_blood;

        yusin_nationality="대한민국";
        yusin_name ="김유신";
        yusin_hihgt=172.5;
        yusin_weight=72.5;
        yusin_hobby="당구";
        yusin_blood="AB";

        System.out.println("국적 : "+yusin_nationality);
        System.out.println("이름 : "+yusin_name);
        System.out.println("키 : "+yusin_hihgt);
        System.out.println("몸무게 : "+yusin_weight);
        System.out.println("취미 : "+yusin_hobby);
        System.out.println("혈액형 : "+yusin_blood);

        String soon_nationality;
        String soon_name;
        double soon_hihgt;
        double soon_weight;
        String soon_hobby;
        String soon_blood;

        soon_nationality="대한민국";
        soon_name ="유관순";
        soon_hihgt=168.5;
        soon_weight=52.4;
        soon_hobby="축구";
        soon_blood="O";

        System.out.println("국적 : "+soon_nationality);
        System.out.println("이름 : "+soon_name);
        System.out.println("키 : "+soon_hihgt);
        System.out.println("몸무게 : "+soon_weight);
        System.out.println("취미 : "+soon_hobby);
        System.out.println("혈액형 : "+soon_blood);


        String yusin [] = {"대한민국","김유신","172.5","72.5","당구","AB"};
        String soon[]={"대한민국","유관순","168.5","52.4","축구","O"};

        String jon[]={"국적(nationality) : ", "이름(name) : " , "키(height : ","몸무게(weight) : ","취미(hobby) : ","혈액형(blood) : "};
        for (int i=0; i < 6; i++){
            System.out.println(jon[i]+soon[i]);
        }
        for (int i=0; i < 6; i++) {
            System.out.println(jon[i] + yusin[i]);
        }
    }
}
