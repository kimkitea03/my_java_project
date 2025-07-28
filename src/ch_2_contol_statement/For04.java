package ch_2_contol_statement;

public class For04 {
    public static void main(String[] args) {
        int sum0=0,sum1=0,sum2=0;

        for(int i=1;i<11;i++) {
            switch (i%3) {//switch()에 표현식을 넣어야하는데 관계 연산자는 넣은 수 없음. (정수식,문자열)
                case 0 :
                    sum0 += i ;
                    break; //필수로 넣어야 함 그래야 i가 밑에도 영향이 안감
                case 1:
                    sum1 += i;
                    break;
                case 2:
                    sum2 += i;
                    break;
            }
        }
        System.out.println("sum0 : "+sum0 );
        System.out.println("sum1 : "+sum1 );
        System.out.println("sum2 : "+sum2 );

        sum0=0;
        sum1=0;
        sum2=0;

        for(int i=1;i<11;i++) {
            if(i%3 == 0){
                sum0+=i;
            } else if (i%3 == 1) {
                sum1 +=i;
            }else {
                sum2 +=i;
            }


        }
        System.out.println("sum0 : "+sum0 );
        System.out.println("sum1 : "+sum1 );
        System.out.println("sum2 : "+sum2 );

    }
}
