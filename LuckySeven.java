
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kelsey
 */
public class LuckySeven {

    public static void main(String[] args) {
        int count;
        int total = 0;
        int dollars;
        Scanner myscanner = new Scanner(System.in);
        
        Random rint = new Random();
        
        
        System.out.println("How many dollars do you have to spend?");
        int dollarsPerloop = myscanner.nextInt();
        
        for (int i =1; i <=100; i++) {
            count=0;
            dollars = dollarsPerloop;
            System.out.println("start dollars: " + dollars);
            while (dollars > 0) {
                count++;
                int dice1 = rint.nextInt(6) + 1;
                int dice2 = rint.nextInt(6) + 1;
                if (dice1 + dice2 == 7) {
                    dollars += 4;
                } else {
                    dollars -= 1;
                }

            }
            System.out.println("end dollars: " + dollars);
            System.out.println("count: " + count);
            total = total + count;
        }
        int averageCount = total / 100;

        // Display the results
        System.out.println("You are broke after an average of " + averageCount + " rolls.\n");
    }

//        Random generator = new Random();
//        Scanner myscanner = new Scanner(System.in);
//        int die1, die2, // two dice
//                dollars, // initial number of dollars (input)
//                dollarsPerLoop, // 
//                count, // number of rolls to reach depletion
//                totalCount, // total count
//                averageCount;		// average count
//        // countAtMax;    // count when the maximum is achieved
//
//        // Initialize variables
//        count = 0;
//        totalCount = 0;
//        averageCount = 0;
//
//        // Request the input
//        System.out.print("How many dollars do you have? ");
//        dollarsPerLoop = myscanner.nextInt();
//
//        // Loop 100 times
//        for (int i = 1; i <= 100; i++) {
//
//            // System.out.println("INCREMENT " + i);
//            // Initialize variables with each loop
//            dollars = dollarsPerLoop;
//            System.out.println("start dollars: " + dollars);
//
//            count = 0;
//
//            // Loop until the money is gone   
//            while (dollars > 0) {
//                count++;
//
//                // Roll the dice.
//                die1 = generator.nextInt(6) + 1; // 1-6 
//                die2 = generator.nextInt(6) + 1; // 1-6
//
//                // Calculate the winnings or losses
//                if (die1 + die2 == 7) {
//                    dollars += 4;
//                } else {
//                    dollars -= 1;
//                }
//
//            }
//
//            // Money is now gone
//            System.out.println("end dollars: " + dollars);
//            System.out.println("count: " + count);
//
//            // Add number of rolls to total count of rolls
//            totalCount = totalCount + count;
//            System.out.println("totalCount: " + totalCount);
//
//        }
//
//        // Divide total count of rolls by 100 for an average
//        averageCount = totalCount / 100;
//
//        // Display the results
//        System.out.println("You are broke after an average of " + averageCount + " rolls.\n");
//    }
}
