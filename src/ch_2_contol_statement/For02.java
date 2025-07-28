package ch_2_contol_statement;

public class For02 {
    public static void main(String[] args) {
        int odd = 0 , even = 0;

        for (int i = 1; i < 11 ; i++) {

            if (i%2 == 0){ // i%1 == 0 으로 할 수 없는 이유는 1의 배수는 짝수에도 포함이기에 그렇다.
                even += i ;

            }else{
                odd += i;
            }

        }
        System.out.println("홀수의 총 합 : " + odd);
        System.out.println("짝수의 총 합 : " + even);



            odd=0;
            even=0;


        for (int i = 1; i < 11 ; i++) {

           switch (i%2){
               case 0 :
                   even +=i;
                   break;
               case 1:
                   odd += i;
                   break;
           }

        }
        System.out.println("홀수의 총 합 : " + odd);
        System.out.println("짝수의 총 합 : " + even);
    }
}
