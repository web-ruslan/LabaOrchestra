package edu.nau.ipz.laba_orchestra;

public class Party {
    private Music Music;
    public Party(Music music) {
        this.Music = music;
        System.out.println("Партія " + music.toString() + " <видано>");
    }

    @Override
    public String toString() {
        return Music.toString();
    }
}
