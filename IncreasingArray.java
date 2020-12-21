/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 * @author Ryan Furton
 */
public class IncreasingArray {

    public static void main(String[] args) {

        //create empty array from user-specified input
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int intArray[] = new int[arrayLength];

        //fill array with user inputs
        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = input.nextInt();
        }
        //calculate # of incremental steps required to make array ascending
        long steps = 0;
        int maxInt = 0;

        for (int j = 1; j < arrayLength; j++) {
            if (intArray[j] < Math.max(maxInt, intArray[j - 1])) {
                steps += Math.max(intArray[j - 1] - intArray[j], maxInt - intArray[j]);
                maxInt = Math.max(intArray[j - 1], maxInt);
            }
        }
        System.out.print(steps);
    }
}
