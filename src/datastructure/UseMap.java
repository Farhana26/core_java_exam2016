package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<String> lastsixnum = new ArrayList<String>();
		lastsixnum.add("123456");
		lastsixnum.add("256325");
		lastsixnum.add("245569");
		lastsixnum.add("253666");

		List<String> lastsixnum1 = new ArrayList<String>();
		lastsixnum1.add("589665");
		lastsixnum1.add("458555");
		lastsixnum1.add("412557");

		List<String> lastsixnum2 = new ArrayList<String>();
		lastsixnum2.add("142141");
		lastsixnum2.add("111111");
		lastsixnum2.add("222222");

		Map<String, List<String>> map = new LinkedHashMap<String,List<String>>();
		map.put("347", lastsixnum);
		map.put("929", lastsixnum1);
		map.put("917", lastsixnum2);

		for(Map.Entry<String,List<String>> space:map.entrySet()){
			System.out.println(space.getKey()+" "+space.getValue());
		}

	}

}
