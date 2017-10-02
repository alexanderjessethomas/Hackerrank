/**
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

Each integer is in the inclusive range [1, 10^9].
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)
**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MiniMaxSum {

    public static void main(String[] args) {
		//scan in input 
        Scanner in = new Scanner(System.in);
		
		//create a long array length five since the problem specifies length 5
        long[] arr = new long[5];
		//compy input into array 
        for(int i=0; i < 5; i++){
            arr[i] = in.nextInt();
        }
		//find minimum		
        long minimum = Math.min(arr[0],arr[1]);
        minimum = Math.min(minimum,arr[2]);
        minimum = Math.min(minimum, arr[3]);
        minimum = Math.min(minimum, arr[4]);
        
		//find maximum 
        long maximum = Math.max(arr[0],arr[1]);
        maximum = Math.max(maximum,arr[2]);
        maximum = Math.max(maximum, arr[3]);
        maximum = Math.max(maximum, arr[4]);
        
		//add up array values 
        long sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        
		//print out result
        System.out.println((sum-maximum) + " " + (sum-minimum));
        
        
    }
}
