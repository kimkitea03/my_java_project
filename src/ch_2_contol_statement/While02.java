package ch_2_contol_statement;

public class While02 {
    public static void main(String[] args) {
        int i=1,odd=0,even=0;

        while (i<11){
            if (i%2==0){
                even +=i;
            }else {
                odd +=i;
            }
            i++;
        }
        System.out.println("홀수의 합 : " + odd);
        System.out.println("짝수의 합 : " + even);

        i=1; odd=0; even=0;
        while (i<11){
            switch (i%2){
                case 0:
                    even += i;
                    break;
                case 1:
                    odd += i;
                    break;
            }
            i++;
        }
        System.out.println("홀수의 합 : " + odd);
        System.out.println("짝수의 합 : " + even);

    }
}
