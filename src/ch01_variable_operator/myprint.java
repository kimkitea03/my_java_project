package ch01_variable_operator;
/*
 작성자:김기태
 작성일:7월 23일
 목적:처음 해보는 자바 프로그래밍
멀티라인 주석 사용 방법(한줄짜리가 아님)
 */
public class myprint {
    public static void main(String[] args) {
// 한줄 짜리 주석(comment)
        System.out.println("홍"); // 성을 출력합니다.
        System.out.println(); // 엔터만 사용합니다.
        System.out.println("길");
        System.out.println("동");

        System.out.print("대한 민국"); // ln이 없어 엔터 없이 글자를 출력합니다.
        System.out.println(" 화이팅");
        System.out.println();
        System.out.println("\"예체능\" 프로그램 메인 MC '강호동'"); // \"가 있어서 문제 없이 글자에 "를 사용할 수 있었다.
        System.out.println();
        System.out.println("이름\t국어\t영어\t수학"); // \t는 문단에 텝을 넣어준다.
        System.out.println("김철수\t50\t60\t70");
        System.out.println("박영희\t30\t40\t50");
    }
}
