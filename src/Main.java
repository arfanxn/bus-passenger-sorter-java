//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Character.*;

public class Main {
    private static final Scanner scannerInput = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<int[]> transjakarta = new ArrayList<int[]>() ;

        transjakarta.add(0, new int[]{10,0});
        transjakarta.add(1, new int[]{3,5});
        transjakarta.add(2, new int[]{5,0});

        System.out.println(getTotalPassenger(transjakarta));
    }

    private static int getTotalPassenger (ArrayList<int[]> bus) {
        int totalPassengers = 0 ;
        for (int[] passangers : bus) {
            totalPassengers += passangers[0];
            totalPassengers -= passangers[1];
        }
        return totalPassengers ;
    }


    public static int sumBaris (int number) {

//        int  result = 0 ;
//        for(int i = 0; i < number; i++) {
//            result += number;
//        }
//
//        System.out.println(result);

        int result = (number * number * number);

        System.out.println(result);

        return  result;

        /*
           ArrayList<ArrayList<Integer>> nestedNumbers = new ArrayList<ArrayList<Integer>>();
        nestedNumbers.get(0).add(1);

        for(int i = 0; i < number ; i++) {

            ArrayList<Integer> numbers =  new ArrayList<Integer>();

            System.out.println(numbers);

            for(int j = 0; j < number; j++) {
                int result = (j >= 0 ? numbers.get(j - 1) : 0) + 2;
                numbers.add(j, result);
            }

            System.out.println(numbers);
        }

        return  number;
        */
    }

   /*
    private static void rowSumOddNumbers(int n) {
        int lastNum = 0;
        int total = 0 ;
        for(int row = 1; row <= n; row++) {
            total = 0;
            for(int xRow = 0; xRow <= row; xRow++) {
                if (row > 1) {
                    lastNum += 2;
                    System.out.println(lastNum);
                    total += lastNum;
                } else {
                    System.out.println(xRow);
                    lastNum = xRow;
                    total = 1;
                }
            }

            System.out.println("TOTAL : " + total);
        }
    }
   */
}
