/**
Input Format

A single integer, n, denoting the size of the staircase.

Output Format

Print a staircase of size n using # symbols and spaces.

Note: The last line must have 0 spaces in it.
**/
import java.io.*;
import java.util.*;

public class Staircase {

    public static void main(String[] args) {
        //scan in the input
        Scanner scan = new Scanner(System.in); 
		//input integer is used to get the size of the staircase
        int inputInteger = scan.nextInt();
		
		//print out the staircase
        for(int i = 1; i <= inputInteger; i++){
            for(int j = 1; j <= inputInteger; j++){
                if(i+j > inputInteger){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}