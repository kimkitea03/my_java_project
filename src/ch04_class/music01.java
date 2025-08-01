package ch04_class;

public class music01 {
    private String name;
    private String singer;
    private String day;
    private double listener;


    public music01 (String name,String singer,String day, double listener){
        this.name=name;
        this.singer=singer;
        this.day=day;
        this.listener=listener;
    }

        void disaplay () {
            System.out.println("제목 : " + name);
            System.out.println("가수 : " + singer);
            System.out.println("발매일 : " + day);
            System.out.println("누적 조회수 : " + listener);
        }



}
