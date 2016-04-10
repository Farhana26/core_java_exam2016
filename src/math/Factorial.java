package math;

import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact=1;
        for(int i=1;i<=N; i++){
             fact= fact *i;

        }
        System.out.println(fact);
    }
}
