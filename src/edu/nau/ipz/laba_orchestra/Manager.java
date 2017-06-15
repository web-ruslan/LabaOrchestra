package edu.nau.ipz.laba_orchestra;

import java.util.ArrayList;

public class Manager extends Human{

    public Manager(String name) {
        super(name);
        System.out.println(name + " <працює>");
    }

    public void work(){
        System.out.println(" << Набирає музикантів >>");
        Orchestra orchestra = new Orchestra();
        hireMusicans(orchestra);
        Kapellmeister kapellmeister = new Kapellmeister("Деригент");
        Concert consert = new Concert("Концерт", kapellmeister);
        kapellmeister.work(consert, orchestra, this);
    }

    private void hireMusicans(Orchestra orchestra) {
        if (orchestra.needMusicians()) {
            for (int i=0; i < orchestra.getNeedValue(); i++){
                orchestra.addMusician(new Musician("Музикант " + (i +1)));
            }
        }
    }

    public void Pay(Concert concert) {
        ArrayList<Musician> concertMusicians = concert.getMusicians();
        System.out.println(concert.getKapellmeister().Name + " <отримує гонорар>");
        for (Musician musican:concertMusicians) {
            System.out.println(musican.Name + " <отримує гонорар>");
        }
    }
}
