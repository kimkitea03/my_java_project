package ch04_class;

public class movie01 {
    String name , Director;
    int Running_time, viewership_rating ,cost;
    double point;




String showmovieswhatchingInfo(){
        double cost2 = ((cost/0.5)+cost)/0.5;
    String message=name+"은 "+ (int)cost2 +"억원 정도에 손익 분기점을 남겼다.";
    return message;
}




String showDifferenceInfo(){
    int cost1;
        if (viewership_rating*15000>cost){
            cost1= (viewership_rating*15000)-cost;
            String message=name+"은 "+cost1+"억원의 수익을 얻었습니다.";
            return message;
        }else{
            cost1=(viewership_rating*15000)-cost;
            String message=name+"은 "+cost1+"억원의 손해를을 얻었습니다.";
            return message;
        }

    }
    void display(){
        System.out.println("제목 : "+name);
        System.out.println("감독 : "+Director);
        System.out.println("관객수 : "+viewership_rating);
        System.out.println("평점 : "+point+"점");
        System.out.println("런닝타임 : "+Running_time+"분");
        System.out.println("제작비 : "+cost+"억원");
    }

}

