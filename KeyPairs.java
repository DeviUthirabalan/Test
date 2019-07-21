package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KeyPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int K;
		//String V;
		
		Map<Integer,String>  KeyPairs = new HashMap<Integer,String>();
		
		KeyPairs.put(3,"idly");
		KeyPairs.put(1,"cow");
		KeyPairs.put(2,"poriurunda");
		
		//System.out.print(KeyPairs.get(1));
		
		Set<Integer> set = KeyPairs.keySet();
		Collection<String> collection = KeyPairs.values();
		
		Iterator keyIterater = set.iterator();
		Iterator valueIterater = collection.iterator();
		
		
		List<Integer> keyList = new ArrayList<Integer>();
		List<String>  valueList = new ArrayList<String>();
		//keyList.add(keyIterater);
		
		while(keyIterater.hasNext()) {
			keyList.add((Integer) keyIterater.next());
			valueList.add((String) valueIterater.next());
		}
		
		Collections.sort(keyList);
		Collections.sort(valueList);
		
		System.out.print(keyList + " : ");
		System.out.print(valueList);
		
		
	}

}
