/**
Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to 10^(-4)  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
**/
import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //variables to keep track of positive, negative and the number of times zero shows up in the array
        float positiveNumbers = 0;
        float negativeNumbers = 0; 
        float zeroNumbers = 0;
        
        //Scan in and set numbers entered to parsed input
        Scanner scan = new Scanner(System.in); 
        int numbersEntered = Integer.parseInt(scan.nextLine());
        
        //for loop to go through and counter the number of positive and negative integers
        for(int i = 0; i< numbersEntered; i++){
            int number = scan.nextInt();
            if(number > 0){
                positiveNumbers++; 
            }else if(number < 0){
                negativeNumbers++;
            }else{
                //for counting zeros
                zeroNumbers++; 
            }
        }
        
        //printing out the three values wanted for this problem 
        System.out.println(positiveNumbers/numbersEntered);
        System.out.println(negativeNumbers/numbersEntered);
        System.out.println(zeroNumbers/numbersEntered);
    }
}