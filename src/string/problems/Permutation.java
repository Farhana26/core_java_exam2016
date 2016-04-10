package string.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Permutation {

        public static void permutation(String res, String str) {
            if(str.length() == 0)
            {
                System.out.println(res);
                return;
            }

            for(int i = 0; i < str.length(); i++)
            {
                String x = str.substring(0, i)+str.substring(i+1); //find the substring

                permutation(res+str.charAt(i) , x); //character at position i is added to the result
            }
        }

    public static void main(String[] args) {

        /*=
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        if (n == 0) System.out.println("");
        else {
            permutation("", str);
        }



    }
}
