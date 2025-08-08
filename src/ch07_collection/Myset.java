package ch07_collection;

import java.util.HashSet;
import java.util.Set;

public class Myset {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();

        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노");//중복된 데이터는 한개로 본다.

        set.clear();

        set.add("아메리카노");
        set.add("카페라떼");
        set.add("에스프레소");
        set.add("믹스커피");

        String findData = "카푸치노";
        System.out.println(findData + " 존재여부 " + set.contains(findData));

        if (set.contains(findData)){
            System.out.println(findData +" 있음");
        }else {
            System.out.println(findData +" 없음");
        }

        //마키야또가 존재하는지 확인하고 없으면 추가해 보세요
        String addData = "마끼야또";

        if (set.contains(addData)==false) {
            System.out.println(addData+"는 현제 : "+ set.contains(addData));
            System.out.println(addData +"가 없네요 추가하겠습니다.");
            set.add("마끼야또");
            System.out.println(addData+ "는 생성되었습니다. "+ set.contains(addData));
        }

        //remove() 메소드를 사용하여 믹스커피를 삭제하고 삭제성공이라는 문구를 출력해 주세요.
        //없으면 존재하지 않음이라는 문구를 출력해 주세요

        findData="믹스커피";

        if (set.remove(findData)){
            System.out.println(findData+"삭제완료 ");
        }else {
            System.out.println("존재하지 않음");
        }

        System.out.println("확장 for 구문을 이용한 요소 출력");

        //for(타입 단수이름: 복수이름){...}
        for (Object item :set){
            System.out.println(item);
        }

        System.out.println("요소 크기 : "+set.size());
    }
}
