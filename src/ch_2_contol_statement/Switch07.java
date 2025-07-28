package ch_2_contol_statement;

public class Switch07 {
    public static void main(String[] args) {
        int su =6;

        System.out.println("초급자가 코딩하는 방식");
        switch (su){
            case 1 :
                System.out.println("홀수");
                break ; // 이 문장이 없다면 항목에 해당된 것 밑으로 쭉 다 출력된다.
            case 2 :
                System.out.println("짝수");
                break ;
            case 3 :
                System.out.println("홀수");
                break ;
            case 4 :
                System.out.println("짝수");
                break ;
            case 5 :
                System.out.println("홀수");
                break ;
            case 6 :
                System.out.println("짝수");
                break ;
        }
        System.out.println("중급자가 코딩하는 방식");
        switch (su){
            case 1:
            case 3:
            case 5:
                System.out.println("홀수");
                break ; //여기서 끊어주기에 이렇게 해주는게 조금 더 깔끔해 보임
            case 2:
            case 4:
            case 6:
                System.out.println("짝수");
                break ;
            default:
                System.out.println("주사위 눈금이 올바르지 않습니다.");
        }
        System.out.println("라인 수를 줄이는 방식");
        switch (su){
            case 1: case 3: case 5: //case 1, 3, 5: 이것도 가능하게 바뀜 따라서 버전에 따라 다를 수 있음
                System.out.println("홀수");
                break ;
            case 2: case 4: case 6: //같은 걸을 출력하고 싶은 case는 한줄에 적어도 됨
                System.out.println("짝수");
                break ;
                default:
                System.out.println("주사위 눈금이 올바르지 않습니다.");
        }
    }
}
