/**
Given a square matrix of size N x N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.


Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
**/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		
		//Scanner to read in input 
        Scanner scan = new Scanner(System.in); 
		//read in integers entered 
        final int number = Integer.parseInt(scan.nextLine()); 
		//variable to to store the differnce once calculated 
        int diagonalDifference = 0; 
		
		//for loop for going through the matrix
        for(int i = 0; i < number;i++){
            String[]row = scan.nextLine().split(" ");
            diagonalDifference += (Integer.parseInt(row[i])-Integer.parseInt(row[number-1-i]));
        }
		//printout diagonal difference 
        System.out.println(Math.abs(diagonalDifference));
        
    }
}