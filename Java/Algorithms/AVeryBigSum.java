/**
You are given an array of integers of size N. You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

Input Format

The first line of the input consists of an integer N. The next line contains N space-separated integers contained in the array.

Output Format

Print a single value equal to the sum of the elements in the array.

Constraints 
**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {

    static long aVeryBigSum(int n, long[] ar) {
        // Complete this function
        
        //variable to store the sum that is going to be returned
        //long was used since the numbers are very large
        long sum = 0; 
        
        //for loop to go through array and add the elements together and store final value in sum
        for(int i = 0; i < n; i++){
            sum = sum + ar[i]; 
        }
        
        //return sum 
        return sum; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
