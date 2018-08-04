package com.project.java.collection.api;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/* 
HashMap vs. HashTable
- HashTable is synchronized and thread safe [Main Thing]
- HashMap is non synchronized. It is not-thread safe and can�t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
- HashMap allows one null key and multiple null values whereas Hashtable doesn�t allow any null key or value.
- HashMap is generally preferred over HashTable if thread synchronization is not needed
*/
 
public class JavaImplementHashTable {

	public static void main(String[] args) {
		Map<Integer,String> map = new Hashtable<Integer,String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(3, "Four");
		
		try{
			map.put(4,null);
		}
		catch(Exception e){
			System.out.println("Hashtable doesn�t allow any null key or value");
		}
		
		try{
			map.put(null,null);
		}
		catch(Exception e){
			System.out.println("Hashtable doesn�t allow any null key or value.");
		}
		System.out.println("Hashtable: ");
		
		for(Map.Entry<Integer,String> m:map.entrySet()){
			System.out.println(m.getKey() + "-" + m.getValue());
		}
		System.out.println();
		
		Map<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(3, "One");
		hashMap.put(2, "Two");
		hashMap.put(1, "Three");
		hashMap.put(4, "Three");
		hashMap.put(5,null);
		hashMap.put(null,null);
		
		try{
			hashMap.put(null,"Four");
			System.out.println("HashMap allows one null key and multiple null values");
		}
		catch(Exception e){
			System.out.println("Will not come here!");
		}
		
		System.out.println("HashMap: ");
		for(Map.Entry<Integer,String> m:hashMap.entrySet()){
			System.out.println(m.getKey() + "-" + m.getValue());
		}
	}
}