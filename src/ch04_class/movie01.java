package ch04_class;

public class movie01 {
    private String name ;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    private String Director;
    public void setDirector(String Director){
        this.Director = Director;
    }
    public String getDirector(){
        return Director;
    }
    private int Running_time;

    public int getRunning_time() {
        return Running_time;
    }

    public void setRunning_time(int running_time) {
        Running_time = running_time;
    }

    private double viewership_rating ;

    public double getViewership_rating() {
        return viewership_rating;
    }

    public void setViewership_rating(double viewership_rating) {
        this.viewership_rating = viewership_rating;
    }
    private  double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    private double point;

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }









String showmovieswhatchingInfo(){
        double cost2 = cost/0.45;
    String message=name+"은 "+ (int)cost2 +"억원 정도에 손익 분기점을 남겼다.";
    return message;
}




String showDifferenceInfo(){
    double cost1;

        if ((viewership_rating * 15) > cost){
            cost1= (viewership_rating*15)-cost;
            String message=name+"은 "+cost1+"억원의 수익을 얻었습니다.";
            return message;
        } else {
            cost1 =(viewership_rating*15)-cost;
            String message=name+"은 "+ cost1+"억원의 손해를을 얻었습니다.";
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

