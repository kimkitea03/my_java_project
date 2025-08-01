package ch04_class;

public class movie02 {
    private String name;
    private String Director;
    private double point;
    private double viewership_rating;
    private int Running_time;
    private int cost;

    public movie02(String name, String Director, double point, double viewership_rating, int Running_time, int cost) {
        this.name = name;
        this.Director = Director;
        this.point = point;
        this.viewership_rating = viewership_rating;
        this.Running_time = Running_time;
        this.cost = cost;


    }

    void display() {
        System.out.println("제목 : " + name);
        System.out.println("감독 : " + Director);
        System.out.println("관객수 : " + viewership_rating);
        System.out.println("평점 : " + point + "점");
        System.out.println("런닝타임 : " + Running_time + "분");
        System.out.println("제작비 : " + cost + "억원");

    }

}
