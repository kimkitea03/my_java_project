package ch_2_contol_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <=10 ; i++) {
            total += i;
        }
        System.out.println("총합 01: " +total);

        total =0;
        /*
        for(초기식 int i = 1 조건식 i <= 100 또는 i < 101 증감식 i + 3 또는 i += 3) {

        }
         */
        for (int i = 1; i <= 100 ; i += 3) {

            total += i;
        }

        System.out.println("총합 02: " +total);
        total =0;
        for (int i = 97; i > 1 ; i -= 5) {
            total += i;

        }
        System.out.println("총합 03 : " + total);
        total =0;
        for (int i = 1 ; i <97 ; i += 5) {
            total += i*i;
            //제곱 구하는 방법
        }
        System.out.println("총합 04: " + total);
        total=0;
        for (int i = 1 ; i <6 ; i++) {
            total +=i*(i+1);
            //곱해야 할 대상도 늘어날때 쓰는방법
        }
        System.out.println("총합 05: " +total);
    }
}
