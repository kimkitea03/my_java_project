package ch_2_contol_statement;

public class While01 {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        while (i<11){
            total += i;
            i++;

        }
        System.out.println("총합 01 : "+ total);

        i=1;
        total=0;
        while (i<= 100){
            total += i;
            i += 3;
        }
        System.out.println("총합 02 : " +total);

        i=97;
        total = 0;
        while (i>1){
            total+=i;
            i-=5;
        }
        System.out.println("총합 03 : " + total);

        i=1;
        total=0;
        while (i<97){
            total += i*i;
            i+=5;
        }
        System.out.println("총합 04 : " +total);

        i=1;
        total=0;
        while (i<6){//뭐보다 크다,뭐보다 크거나 같다 같은 등호 잘 확인하고 숫자 표기하기 자꾸 실수함
            total += i*(i+1); // 자꾸 =만 넣음 실수하지말고 +=인지 -=인지 잘 알고 넣어야함
            i++;

        }
        System.out.println("총합 05 : " + total);

    }
}
