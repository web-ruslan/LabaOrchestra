package edu.nau.ipz.laba_orchestra;

import java.util.Random;

public class Helper {
    public static boolean randomSelect(float chance) {
        Random rand = new Random();
        final int MAX = 100;
        int randomNum = rand.nextInt(MAX);
        return randomNum < MAX*chance;
    }
}
