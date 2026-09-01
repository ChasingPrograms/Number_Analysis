package Number_Analysis;
import java.util.*;
public class numberAnalysis {
/*  
Mini Java Challenge Project ~ 
Build a Java program that analyses numberes entered by the user.

Requirements:
1. Prompting the user on how many numbers they want to analyse.
2. Store the numbers entered into an array.
3. Analysing if each number is odd or even.
4. Sum the total up to each number //Using Iteration
5. Find the factorial of each number //Using Recursion
6. Analyse if each number is a prime number or not.
7. Produce a final report.
*/
    public static void main(String [] args){
        
        //Requirement 1:
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, How many numbers would you like to analyse? (In Integers):");
        int n = scan.nextInt();
        while(n < 1){
            System.out.println("> INVALID NUMBER DETECTED <");
            System.out.println("How many numbers would you like to analyse? (In Integers):");
            n = scan.nextInt();
        }

        System.out.println("Creating " + n + " slots");

        //Requirment 2:
        long [] Arr = new long[n];
        for(int i = 0; i < Arr.length; i++){
            System.out.println("Type in a number... (Greater than -1 and in Integers):");
            Arr[i] = scan.nextInt();

            while(Arr[i] < 0){
                System.out.println("> NEGATIVE NUMBER DETECTED <");
                System.out.println("Type in a POSITIVE number... (In Integers):");
                Arr[i] = scan.nextInt();
            }
        }
        scan.close();

        System.out.println("======");
        System.out.println("Starting Analysis...");
        //Requirment 7:
        for( var x: Arr){
            System.out.println("Number: "+ x);
            System.out.println("Odd or Even: "+ oddEven(x));
            System.out.println("Sum: "+ sum(x));
            System.out.println("Factorial: "+ factorial(x));
            System.out.println("Prime: "+ prime(x));
            System.out.println("======");
        }
    }

    public static String oddEven(long x){ //Requirement 3:
        if((x % 2) == 0){
            return("Even");
        }

        else{
            return ("Odd");
        }
    }

    public static long sum(long x){ //Requirment 4:
        long result = 0;
        for(long i = 1; i <= x; i++){
            result = result + i;
        }
        return result;
    }

    public static long factorial(long x){ //Requirement 5:
        if(x >= 2){
            return(x*(factorial(x-1)));
        }

        else{
            return 1;
        }
    }

    public static String prime(long x){ //Requirment 6:
        if( x <= 1 ){
            return("Not Prime");
        }
        else{
            for(long i = 2; i < x; i++){
                if( x % i == 0){
                    return("Not Prime");
                }
            }
        }
        return("Prime");
    }
}