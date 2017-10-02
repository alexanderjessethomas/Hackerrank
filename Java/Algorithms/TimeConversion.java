/**
Input Format

A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM  orhh:mm:ssPM ), where 01<=hh<=12 and 00<=hh<=23.

Output Format

Convert and print the given time in 24-hour format, where 00<=hh<=23.
**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//importing simple date format to create military time and standard time formats for parsing 
import java.text.SimpleDateFormat;
//import Date utility to use with converting formats
import java.util.Date;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        //setting the input string to its own variable
        String timeToConvert = s;
        //creating a new Date to work with
        Date standardParse = new Date();
        
        //setting up the formats to use with this program
        SimpleDateFormat militaryFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat standardFormat = new SimpleDateFormat("hh:mm:ssa");
        
        //try and catch for parsing data
        try{
            //parsing timeToConvert to standard time formatt
            standardParse = standardFormat.parse(timeToConvert);
        }catch(ParseException e){
            e.printStackTrace();
        }
        //converting standardFormat to militaryFormat and then converting Date to String 
        String results = militaryFormat.format(standardParse).toString();
        
        //returning results
        return results;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}