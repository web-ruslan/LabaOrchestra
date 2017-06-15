package edu.nau.ipz.laba_orchestra;

import java.util.ArrayList;

public class Kapellmeister extends Human {

    public Kapellmeister(String name) {
        super(name);
        System.out.println(name + " <створено>");
    }

    public void work(Concert consert, Orchestra orchestra, Manager manager) {
        System.out.println("<< Починає працювати деригент >>");
        System.out.println("<< Створює плейлист >>");
        createPlaylist(consert);
        System.out.println("<< Вибирає музикантів >>");
        createTeam(consert, orchestra);
        System.out.println("<< Створює та роздає партії >>");
        createParty(consert);
        System.out.println("<< Початок концерту >>");
        Play(consert);
        System.out.println("<< Концерт завершено... Чекаємо гонорару >>");
        manager.Pay(consert);
    }

    private void createTeam(Concert consert, Orchestra orchestra) {
        ArrayList<Musician> concertMusicians = orchestra.getMusicians();
        for (Musician musican:concertMusicians) {
            if(Helper.randomSelect(0.8f)) {
                consert.addMusician(musican);
                System.out.println(musican.Name + " <вибрано>");
            }
        }
    }

    private void createParty(Concert consert) {
        ArrayList<Music> concertMusic = consert.getMusics();
        ArrayList<Musician> concertMusicians = consert.getMusicians();
        for (Musician musican:concertMusicians) {
            System.out.println(musican.Name + ":");
            for (Music music:concertMusic) {
                int ind = concertMusicians.indexOf(musican);
                concertMusicians.get(ind).setParty(new Party(music));
            }
        }
    }

    private void Play(Concert consert) {
        ArrayList<Music> concertMusic = consert.getMusics();
        ArrayList<Musician> concertMusicians = consert.getMusicians();
        for (Music music:concertMusic) {
            for (Musician musican:concertMusicians) {
                if (musican.isPartyExist(concertMusic.indexOf(music))) {
                    System.out.print(musican + " < Грає... >");
                    System.out.println(musican.getParty(concertMusic.indexOf(music)).toString());
                }
            }
        }
    }

    private void createPlaylist(Concert consert) {
        for (int i=0; i < Concert.N_MUSICS; i++){
            Music tmp = new Music("Музичний твір " + (i + 1));
            consert.addMusic(tmp);
        }
    }
}
