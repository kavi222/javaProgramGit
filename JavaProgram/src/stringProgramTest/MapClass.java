package stringProgramTest;

import java.util.*;

public class MapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "SPIDERS WEB OF LIES";
		str=str.replaceAll("\s", "");
		char[] y = str.toCharArray();
		int size = y.length;
		//HashMap - random order
		Map<Character, Integer> hmap = new HashMap<>();;
		int i=0;
		while(i!=size) {
			if(hmap.containsKey(y[i]) == false) {
				hmap.put(y[i],1);
			}else {
				int oldVal = hmap.get(y[i]);
				int newVal=oldVal+1;
				hmap.put(y[i], newVal);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> hhmap = hmap.entrySet();
		for(Map.Entry<Character, Integer> data : hhmap) {
			System.out.print(data.getKey());
			System.out.print("-");
			System.out.println(data.getValue());
		}
		System.out.print("---------------------------------LinkedHashMap----------------------");
		System.out.println("");
		
		//LinkedHashMap - in the given order
		
		Map<Character, Integer> lmap = new LinkedHashMap<>();
		int j=0;  
		while(j!=size) {
			if(lmap.containsKey(y[j]) == false) {
				lmap.put(y[j], 1);
			}else {
				int oldVal=lmap.get(y[j]);
				int newVal=oldVal+1;
				lmap.put(y[j], newVal);
			}
			j++;
		}
		Set<Map.Entry<Character, Integer>> llmap = lmap.entrySet();
		for(Map.Entry<Character, Integer> data : llmap) {
			System.out.print(data.getKey());
			System.out.print("-");
			System.out.println(data.getValue());
		}
		System.out.print("---------------------------------TreeMap----------------------");
		System.out.println("");
		
		//TreeMap - sorted ascending order
		
		Map<Character, Integer> tmap = new TreeMap<>();
		int k=0;
		while(k!=size) {
			if(tmap.containsKey(y[k]) == false) {
				tmap.put(y[k], 1);
			}else {
				int oldVal=tmap.get(y[k]);
				int newVal=oldVal+1;
				tmap.put(y[k], newVal);
			}
			k++;
		}
		Set<Map.Entry<Character, Integer>> ttmap = tmap.entrySet();
		for(Map.Entry<Character, Integer> data : ttmap) {
			System.out.print(data.getKey());
			System.out.print("-");
			System.out.println(data.getValue());
		}
		
		// difference is in the order in which the data is stored

	}

}
