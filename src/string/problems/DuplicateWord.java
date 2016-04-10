package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language Java is also an Island of Indonesia. Java is widely used language";
       // String st1 = st.toLowerCase();
        String [] word = st.split(" ");

       int count =0;
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<word.length;i++) {
            String words = word[i].toLowerCase();
            if (map.containsKey(words)) {
                count = map.get(words);
                map.put(words, ++count);

            } else
                map.put(words, 1);
        }
        for(Map.Entry<String,Integer> curser : map.entrySet()){
            if(curser.getValue()>1)
                System.out.println("KEY : "+ curser.getKey() + " value :" + curser.getValue());

        }
    }

}
