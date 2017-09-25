/**
Given an array of N integers, can you find the sum of its elements?

Input Format

The first line contains an integer,N, denoting the size of the array. 
The second line contains N space-separated integers representing the array's elements.

Output Format

Print the sum of the array's elements as a single integer.
**/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        // This function is meant to add up all elements of an integer array
        
        //variables that are needed for this function.
        int sum = 0; 
        
        //For loop to add up array.
        for(int i = 0; i < n; i++){
            sum = sum + ar[i]; 
            //System.out.println(sum); //This line was for testing
        }
        //System.out.println(sum); //This line was for testing
        return sum; 
    }

    //This main method is provided by hackerrank. I just made the simpleArraySum
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}