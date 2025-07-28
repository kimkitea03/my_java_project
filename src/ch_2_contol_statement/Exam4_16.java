package ch_2_contol_statement;

public class Exam4_16 {
    public static void main(String[] args) {

        int star = 24;
        int enter = 7;

        for (int i = 1; i <= star ; i++) {
            System.out.print('*');

            if (i%enter == 0 ){ // 변수 또는 숫자에 배수 때 마다 사용하겠다 하고싶으면 쓰는 식
                System.out.println();
            }
        }
    }
}
