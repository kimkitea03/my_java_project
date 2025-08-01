package ch04_class;

public class moviemain02 {
    public static void main(String[] args) {
        movie02[] movies ={
          new movie02("아바타2","제임스 카메론",8.83,1080,192,5670),
                new movie02("듄2","드니 빌뇌브",8.97,201,166,4725)

        };
        for (int i = 0; i < movies.length ; i++) {
            movies[i].display();
        }
    }
}
