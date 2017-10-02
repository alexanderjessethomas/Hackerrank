import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        //int n is the size of the input array 
        //int[] arr is the input array of candles
        
        //set max to first element in array 
        int max = ar[0];
        //initialize reult as zero 
        int result = 0;
        
        //for loop to find the tallest candle 
        for(int i = 0; i < n; i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        
        //for loop to count the number of candles shorter than the tallest
        for(int j = 0; j < n; j++){
            if(ar[j] < max){
                result++;
            }
        }
        //return count of smaller candles
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}