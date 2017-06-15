package edu.nau.ipz.laba_orchestra;

import java.util.ArrayList;

public class Musician extends Human {

    private ArrayList<Party> Parties = new ArrayList<>();

    public Musician(String name) {
        super(name);
        System.out.println(name + " <створено>");
    }

    public void setParty(Party party) {
        this.Parties.add(party);
    }

    public boolean isPartyExist(int index) {
        return Parties.contains(index);
    }

    public Party getParty(int index) {
            return Parties.get(index);
    }

    @Override
    public String toString() {
        return Name;
    }
}
