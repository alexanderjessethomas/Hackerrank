/**
HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student's grade according to these rules:

If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of .
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
For example, grade = 84 will be rounded to 85 but grade = 29 will not be rounded because the rounding would result in a number that is less than 40.

Given the initial value of grade for each of Sam's n students, write code to automate the rounding process. For each gradei, round it according to the rules above and print the result on a new line.

Input Format

The first line contains a single integer denoting n (the number of students). 
Each line i of the n subsequent lines contains a single integer, gradei, denoting student i's grade.

Output Format

For each gradei of the n grades, print the rounded grade on a new line.
**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

    static int[] solve(int[] grades){
        // Complete this function
        
        //lowest grade someone can recieve that will be curved
        int cutOffGrade = 38; 
        
        //for loop to go through grade list and curve grades
        for(int i = 0; i < grades.length; i++){
            //dont curve if less than cutoff
            if(grades[i] < 38){
                grades[i] = grades[i];
            //curve if the students grade is 3 or less from next multiple of five
            }else if ((grades[i] % 5) >= 3){
                grades[i] = grades[i] + (5-(grades[i] % 5));
            //dont do anything. 
            }else{
                grades[i] = grades[i];
            }
        }
        //return new list of curved grades
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
