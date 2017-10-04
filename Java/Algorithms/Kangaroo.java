import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        
        //Variable to store results to return 
        String results = "";
        
        //if the position and "velocity" of one kangaroo is lower than the other they will never meet
        if((x1<x2) && (v1<v2)){
            results = "NO";
        //Else check that the "velocity" of both kangroos are not the same
        }else{
            if((v1 != v2) && ((x2-x1) % (v1-v2) == 0)){
                results = "YES";
            }else{
                results = "NO";
            }
        }
        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}