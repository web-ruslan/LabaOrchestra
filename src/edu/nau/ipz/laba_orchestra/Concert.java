package edu.nau.ipz.laba_orchestra;

import java.util.ArrayList;

public class Concert {
    public final static int N_MUSICS = 2;
    private String Name;
    private Kapellmeister aKapellmeister;
    private ArrayList<Musician> Musicians = new ArrayList<>();
    private ArrayList<Music> Musics = new ArrayList<>();
    public Concert(String name, Kapellmeister kapellmeister) {
        this.Name = name;
        this.aKapellmeister = kapellmeister;
    }
    public void addMusician(Musician musican) {
        Musicians.add(musican);
    }

    public ArrayList<Musician> getMusicians() {
        return Musicians;
    }

    public void addMusic(Music music) {
        Musics.add(music);
    }


    public ArrayList<Music> getMusics() {
        return Musics;
    }

    public Kapellmeister getKapellmeister() {
        return aKapellmeister;
    }
}
