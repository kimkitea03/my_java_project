package ch_2_contol_statement;

public class if_03 {
    public static void main(String[] args) {
        int su = 25 ;
        if (su%3==0){
            System.out.println(su+" 는(은) 3의 배수 입니다.");
            su *= 3 ;
            System.out.println(su);
            // 출력할때 ()를 이용하여 계산시켜 출력시키는 것도 깔끔해 보여 좋은 것 같다 생각함
        }else{
            System.out.println(su+" 는(은) 3의 배수가 아닙니다.");
            System.out.println((su+=5));
        }
    }
}
