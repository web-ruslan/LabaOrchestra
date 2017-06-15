package edu.nau.ipz.laba_orchestra;

public class Music {
    private String Name;
    public Music(String name) {
        this.Name = name;
        System.out.println(name + " <вибрано>");
    }

    @Override
    public String toString() {
        return Name;
    }
}
