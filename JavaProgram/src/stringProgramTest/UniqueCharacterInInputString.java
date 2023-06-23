package stringProgramTest;

import java.util.*;

public class UniqueCharacterInInputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Kavi Arasu";
		str = str.replaceAll("\\s", "").toLowerCase();
		char[] y = str.toCharArray();
		int size = y.length;
		int i = 0;
		Map<Character, Integer> hmap = new LinkedHashMap<>();
		while (i != size) {
			if (hmap.containsKey(y[i]) == false) {
				hmap.put(y[i], 1);
			} else {
				int oldVal = hmap.get(y[i]);
				int newVal = oldVal + 1;
				hmap.put(y[i], newVal);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> hhmap = hmap.entrySet();
		/*
		  for(Map.Entry<Character, Integer> data : hhmap) { 
		  if(data.getValue() > 1) {
		  System.out.println("Doesn't contain all Unique character"); 
		  System.exit(0); 
		  }
		  } 
		  System.out.println("Contains all unique characters");
		 */

		/*
		  for(Map.Entry<Character, Integer> data : hhmap) { if(data.getValue() == 1) {
		 System.out.println(data.getKey()); //System.exit(0); }
		  
		  }
		 */
		for(Map.Entry<Character, Integer> data : hhmap) { if(data.getValue() == 1) {
			 System.out.println(data.getKey());
			 System.exit(0); 
			  
			  }
			
		}
		
	}

}
