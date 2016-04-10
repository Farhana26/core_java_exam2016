package string.problems;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean status = true;

        if(str1.length()!= str2.length())
        {
            status = false;

        }
        else{
            int count = 0;
            HashMap<Character,Integer> map = new HashMap<Character, Integer>();
            for(int i=0;i<str1.length();i++)
            {
                char ch=str1.charAt(i);
                if(map.containsKey(ch)){
                    count=map.get(ch);
                }
                    map.put(ch,++count);
                  count=0;
                ch=str2.charAt(i);
                if(map.containsKey(ch)){
                    count=map.get(ch);
                }
                map.put(ch,--count);
            }
              for(int value : map.values())
              {
                  if(value!=0)
                      status = false;
            }

        }
        if(status)
        {
            System.out.println(str1 + " " + str2 +" are anagram!!");
        }
        else{
            System.out.println(str1 + " " + str2 + " are not anagram");
        }

    }

}
