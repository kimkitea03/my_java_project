package ch04_class;

public class moviemain01 {
    public static void main(String[] args) {
        movie01 avatar_2 = new movie01();
        movie01 dune_2 = new movie01();

        avatar_2.name="아바타 2 물의길";
        avatar_2.Director="제임스 카메론";
        avatar_2.point=8.83;
        avatar_2.viewership_rating=1080;
        avatar_2.Running_time=192;
        avatar_2.cost=5670;
        avatar_2.showmovieswhatchingInfo();
        avatar_2.showDifferenceInfo();
        avatar_2.display();
        System.out.println(avatar_2.showmovieswhatchingInfo());
        System.out.println(avatar_2.showDifferenceInfo());

        dune_2.name="듄 파트2";
        dune_2.Director="드니 빌뇌브";
        dune_2.point=8.97;
        dune_2.viewership_rating=201;
        dune_2.Running_time=166;
        dune_2.cost=4725;
        dune_2.showmovieswhatchingInfo();
        dune_2.showDifferenceInfo();
       dune_2.display();
        System.out.println(dune_2.showmovieswhatchingInfo());
        System.out.println(dune_2.showDifferenceInfo());


    }


}
