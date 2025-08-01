package ch04_class;

public class moviemain01 {
    public static void main(String[] args) {
//        movie01 avatar_2 = new movie01();
//        movie01 dune_2 = new movie01();
//
//        avatar_2.setName("아바타 2 물의길");
//        avatar_2.setDirector("제임스 카메론");
//        avatar_2.setPoint(8.83);
//        avatar_2.setViewership_rating(1080);
//        avatar_2.setRunning_time(192);
//        avatar_2.setCost(5670);
//
//
//
//        avatar_2.showmovieswhatchingInfo();
//        avatar_2.showDifferenceInfo();
//        avatar_2.display();
//        System.out.println(avatar_2.showmovieswhatchingInfo());
//        System.out.println(avatar_2.showDifferenceInfo());
//
//        dune_2.setName("듄 파트2");
//        dune_2.setDirector("드니 빌뇌브");
//        dune_2.setPoint(8.97);
//        dune_2.setViewership_rating(201);
//        dune_2.setRunning_time(166);
//        dune_2.setCost(4725);
//        dune_2.showmovieswhatchingInfo();
//        dune_2.showDifferenceInfo();
//       dune_2.display();
//        System.out.println(dune_2.showmovieswhatchingInfo());
//        System.out.println(dune_2.showDifferenceInfo());

        movie01[] movie = new movie01[2];

        movie[0]= new movie01("아바타2","제임스 카메론",8.83,1080,192,5670);
        movie[1]= new movie01("듄2","드니 빌뇌브",8.97,201,166,4725);

        for (int i = 0; i < movie.length ; i++) {
            movie[i].display();

        }

    }


}
