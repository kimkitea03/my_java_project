package ch07_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mymap {
    public static void main(String[] args) {
        Map<String, Integer> teamMap= new HashMap<String, Integer>();

        teamMap.put("LG 트윈스",1);
        teamMap.put("ssg 랜더스",2);
        teamMap.put("두산 베어스",3);
        teamMap.put("KT 위즈",4);

        String findIteam = "NC 다이노스";
        boolean bool = teamMap.containsKey(findIteam);
        System.out.println(findIteam + "팀이 목록에 있나요 ? "+ bool);

        //nc 팀이 존재하는지 채크하고 없으면 순위 5위에 추가해주세요

        if (teamMap.containsKey(findIteam) == false){
            teamMap.put("NC 다이노스",5);
            System.out.println(findIteam+"팀을 추가했습니다.");
        }

        //순위가 6위인 팀이 존재하는지 체크하고, 존재하지 않으면 KIA 타이거즈를 추가해 주세요
        //그리고, 존재여부를 적절한 문구로 출력해 주세요.
        int pos = 6;

        bool=teamMap.containsValue(pos);
        if (teamMap.containsValue(pos)){
            System.out.println(pos+"위 팀은 있습니다.");
        } else {
            System.out.println(pos+"위 팀이 존재하지 않습니다. 추가하겠습니다.");
            teamMap.put("KIA 타이거즈",pos);
        }

        String[] teams = {"롯데 자이언트","한화 이글스","키움 히어로즈","삼성 라이온즈"};
        for (int i = 0; i <teams.length ; i++) {
            teamMap.put(teams[i],i+7);

        }

        findIteam="삼성 라이온즈";
        Integer rank= teamMap.get(findIteam);

        if (rank == null){
            System.out.println(findIteam+"팀은 존재하지 않습니다. ");
        }else {
            String message = "팀명 : "+ findIteam+ ", 순위 : "+rank;
            System.out.println(message);
        }

        System.out.println("다음 팀들의 정보를 출력해 주세요");
        String[] findTeams = {"두산 베어스","KT 위즈","빙그레 이글스"};

        for (String one : findTeams){
            rank=teamMap.get(one);
            if (rank != null){
                String message = "팀명 : "+ one+ ", 순위 : "+rank;
                System.out.println(message);
            }else {
                System.out.println(one + "팀이 존재하지 않아서 추가합니다.");
                teamMap.put(one,11);
            }
        }


        System.out.println("전체 목록을 출력해 봅니다.");
        Set <String> items = teamMap.keySet();


        for (String key : items){
            String message =key+ "팀은 "+"순위가 "+teamMap.get(key)+"위 입니다.";
            System.out.println(message);
        }


        System.out.println("요소 크기 : "+teamMap.size());
        System.out.println(teamMap.toString());




        teamMap.clear();
        if (teamMap.isEmpty()){//웬만한 코딩프로그렘에서 Be동사가 나오면 100% 참 거짓 판독하는 것임
            System.out.println("teamMap is empty");
        }else {
            System.out.println("teamMap is not empty");
        }

    }
}
