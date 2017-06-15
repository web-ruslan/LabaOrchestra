package edu.nau.ipz.laba_orchestra;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Musician> Musicians = new ArrayList<>();
    private static final int N_MEMBERS = 10;

    public boolean needMusicians() {
        return !(this.Musicians.size() == N_MEMBERS);
    }

    public int getNeedValue() {
        return N_MEMBERS - this.Musicians.size();
    }

    public void addMusician(Musician musician) {
        this.Musicians.add(musician);
    }

    public ArrayList<Musician> getMusicians() {
        return this.Musicians;
    }
}
