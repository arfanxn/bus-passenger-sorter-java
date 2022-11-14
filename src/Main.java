//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.sound.midi.Soundbank;
import java.math.BigInteger;
import java.util.Scanner;
import static java.lang.Character.*;

public class Main {
    private static final Scanner scannerInput = new Scanner(System.in);

    public static void main(String[] args) {
        String[] employees = {"C01XX" , "J02XX" , "N03XX" , "P04XX"};
//        countBusPassengersOnEachLevel(employees);
        countBusPassengersOnEachLevel(employees);
    }

    private static void countBusPassengersOnEachLevel (String[] passengers) {
        String[] busInfo = {"01-TopLevel", "02-MiddleLevel", "03-RegularStaff", "04-Staff"};
        int topLevel = 0 ;
        int middleLevel = 0 ;
        int regularStaffLevel = 0 ;
        int staffLevel = 0 ;

        for(int i = 0; i < passengers.length ; i++) {
           String passenger = passengers[i] ;
           char firstChar = passenger.charAt(0);
           char firstCharOfNIK = passenger.charAt(2);

           if (
                   (Character.compare(firstChar ,'C') == 0)
                        && (Character.compare(firstCharOfNIK ,'1') == 0)
           ) {
                topLevel += 1;
           }
           else if(
                   (Character.compare(firstChar ,'J') == 0)
                   && (Character.compare(firstCharOfNIK ,'2') == 0)
           ){
               middleLevel += 1;
           } else if(
                   (Character.compare(firstChar ,'N') == 0)
                           && (Character.compare(firstCharOfNIK ,'3') == 0)
           ){
               regularStaffLevel += 1;
           } else {
               staffLevel += 1;
           }

        }

        System.out.println("Total TopLevel : " + topLevel);
        System.out.println("Total MiddleLevel : " + middleLevel);
        System.out.println("Total RegularStaffLevel : " + regularStaffLevel);
        System.out.println("Total StaffLevel : " + staffLevel);
    }


    private static void roundUp (float[] floats) {
        int[] roundedUps = new int[floats.length];

        for(int i = 0; i < floats.length; i++) {
            float floatNum = floats[i] ;
            System.out.println(Math.round(floatNum));
        }
    }

}
