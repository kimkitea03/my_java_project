package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class mylist {
    public static void main(String[] args) {
        //타입이 하나면 <타입>을 넣어주면 됨 2가지 이상이면 무족건 오브젝트 사용
        List<String> coffeeList = new ArrayList<String>();
        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("에스프레소");
        coffeeList.add("마끼야또");
        coffeeList.add("카페라떼");

        int idx = -1;
        String finddata="카페라떼";
        idx=coffeeList.indexOf(finddata);
        System.out.println(finddata+"의 인덱스 번호 : "+idx);

        idx=coffeeList.lastIndexOf(finddata);
        System.out.println(finddata+"의 인덱스 번호 : "+idx);

        finddata="카푸치노";
        idx=coffeeList.indexOf(finddata);
        System.out.println(finddata+"의 인덱스 번호 : "+idx);

        //카푸치노 항목이 존재하지 않으면, 2번째 위치에 추가해 보세요
        if (coffeeList.indexOf(finddata) == -1){
            coffeeList.add(2,"카푸치노");
//            idx=coffeeList.indexOf(finddata);
//            System.out.println(finddata+"의 인덱스 번호 : "+ idx);
        }

        System.out.println("확장 for 구문을 이용한 출력");
        //for (타입 단수이름 : 복수이름){...}
        for (String coffee : coffeeList){
            System.out.print(coffee+"\t");
        }
        System.out.println();

        finddata="콜드 브루";
        coffeeList.set(5,finddata);

        finddata="카푸치노";
        coffeeList.remove(finddata);

        coffeeList.add(finddata);

        for (String xx : coffeeList){
            System.out.println(xx);
        }

        String itme = coffeeList.get(3);
        System.out.println("특정 위치 요소 : "+itme);


        System.out.println("일반 for 구문으로 요소 출력하기");

        for (int i = 0; i < coffeeList.size() ; i++) {
            String date = coffeeList.get(i);
            System.out.println(date);
        }




//        finddata="에스프레소";
//        idx=coffeeList.indexOf(finddata);
//        System.out.println(finddata+"의 인덱스 번호 : "+idx);


        System.out.println("요소 크기 : " + coffeeList.size());
    }
}
