import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OrangeAndApple {
    public static void main(String[] args) {
        //Scan in input
        Scanner scan = new Scanner(System.in);
        //save input using variables
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        
        //Figure out number of apples on the house 
        //variable to store the number of apples on the house 
        int appleResult = 0;
        
        //for loop to calculate the number of apples on the house 
        for (int i = 0; i < m; i++) {
            int apples = a + scan.nextInt();
            if (apples >= s && apples <= t) {
                appleResult++;
            }
        }
        //Print results as per the problem instructions
        System.out.println(appleResult);
        
        //Figure out number of oranges on the house 
        //variable to store the number of oranges on the house 
        int orangeResult = 0;
        for (int j = 0; j < n; j++) {
            int oranges = b + scan.nextInt();
            if (oranges >= s && oranges <= t) {
                orangeResult++;
            }
        }
        //print results as per the problem instructions
        System.out.println(orangeResult);
    }
}
