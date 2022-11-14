//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.sound.midi.Soundbank;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    private static final Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args) {
        float[] floatNumbers = new float[] {2.34f, 4.56f, 67.89f};
        roundUp(floatNumbers);
    }

    private static void roundUp (float[] floats) {
        int[] roundedUps = new int[floats.length];

        for(int i = 0; i < floats.length; i++) {
            float floatNum = floats[i] ;
            System.out.println(Math.round(floatNum));
        }
    }

    private static void () {

    }
}
