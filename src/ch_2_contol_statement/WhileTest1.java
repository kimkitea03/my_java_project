package ch_2_contol_statement;

public class WhileTest1 {
    public static void main(String[] args) {
        int i=1,dna=3,temp=0;
        while (i < 10){
            temp=i*dna; //변수 않넣고 밑에 (i*dan)을 넣어도 상관없음
            System.out.println(dna+" * "+i+"="+temp);//바뀔때마다 나오는 결과값을 보고싶다면 여기에 적으면 됨
            i++;
        }
            //결과만 보고싶다면 sout을 여기다 사용


    }
}
