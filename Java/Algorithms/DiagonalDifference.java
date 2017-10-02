/**
Given a square matrix of size N x N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.


Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
**/
import java.io.*;
import java.util.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        //Take in input 
        Scanner scan = new Scanner(System.in); 
        //parse input into integer value to be used later
        final int number = Integer.parseInt(scan.nextLine()); 
        //make variable to hold value desired
        int diagonalDifference = 0; 
        //for loop to go through and calculate the diagonal difference 
        for(int i = 0; i < number;i++){
            String[]row = scan.nextLine().split(" ");
            diagonalDifference += (Integer.parseInt(row[i])-Integer.parseInt(row[number-1-i]));
        }
        System.out.println(Math.abs(diagonalDifference));
        
    }
}