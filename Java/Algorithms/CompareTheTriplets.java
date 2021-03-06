/**
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet A = (a1,a2,a3) , and the rating for Bob's challenge to be the triplet B = (b0,b1,b2).

Your task is to find their comparison points by comparing a0 with b0, a1 with b1, a2 and b2 with .

If ai > bi, then Alice is awarded 1 point.
If ai < bi, then Bob is awarded 1 point.
If ai = bi, then neither person receives a point.
Comparison points is the total points a person earned.

Given A and B, can you compare the two challenges and print their respective comparison points?

Input Format

The first line contains 3 space-separated integers, a0, a1, and a2, describing the respective values in triplet . 
The second line contains 3 space-separated integers, b0, b1, and b2, describing the respective values in triplet .

Output Format

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.
**/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

    static int[] compare(int a0, int a1, int a2, int b0, int b1, int b2){
        // Variables to store scores
        int aliceScore = 0; 
        int bobScore = 0;
        
        //create array to hold the two score required
        int[] resultsArray = new int[2];
        
        //comparing a0 and b0
        if(a0 > b0){
            aliceScore++;
        }
        if(b0 > a0){
            bobScore++; 
        }
        if(a0 == b0){
            //do nothing no points 
        }
        if(a1 > b1){
            aliceScore++;
        }
        if(b1 > a1){
            bobScore++; 
        }
        if(a1 == b1){
           //do nothing no points 
        }
        if(a2 > b2){
            aliceScore++;
        }
        if(b2 > a2){
            bobScore++; 
        }
        if(a2 == b2){
            //do nothing no points 
        }
        //enter the two scores into the array Alice first, Bob second 
        resultsArray[0] = aliceScore;
        resultsArray[1] = bobScore; 
        
        //return array for results 
        return resultsArray;
    }

    //main method is given by hackerrank, I am supposed to finish compare method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = compare(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        

    }
}
