package STRINGS;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesinString {
	//OutPut= r=2 m=2 d=2
	public static void main(String[] args) {
		String s="Prrammodd";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for(Character ch: arr){
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}else{
				hm.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry: hm.entrySet()){
			if(entry.getValue()>1){
			System.out.println(entry.getKey()+"="+entry.getValue());
			}
		}
	}

}
