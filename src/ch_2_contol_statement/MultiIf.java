package ch_2_contol_statement;

public class MultiIf {
    public static void main(String[] args) {

        double ticket = 1000.0 ;
        double discount;
        int age = 19;
        double in ;
        String ag;
        String mes;


        if (age < 8 ){// discount=1.0; comment=0.5; 로만 하고 밑에 써놓은 걸로 해도 됨
        discount = 100 ;
            in = ticket - (discount/100) *ticket;
            ag = "유아";
             mes = "("+ discount+"% 할인)";
        } else if (age <14){
            discount = 50 ;
            in = ticket - (discount/100) *ticket;
            ag = "어린이";
            mes = "("+ discount+"% 할인)";
        } else if (age < 20) {
            discount = 30 ;
            in = ticket - (discount/100) *ticket;
            ag = "청소년";
           mes = "("+ discount+"% 할인)";
        } else if (age >= 65) {
            discount = 40 ;
            in = ticket - (discount/100) *ticket;
            ag = "노인";
            mes = "("+ discount+"% 할인)";
        }else {
            in = ticket;
            ag = "성인";
            mes = "(정가)";

        }
        String message=age + "살 : " + ag + mes;
        String mess = "가격은 " + (int)(in) +"입니다.";
        //ticket*(1-discount)을 사용해도 됨 대신 위에 discount에 각각 1.0,0.5,0.3,0.4을 넣어야함 위에 수식또 뺴야하고
        System.out.println(message);
        System.out.println(mess);
        //내 방식대로 함
    }
}
