package com.DAY13.MAP_Implementation;
import java.util.*;
public class HashMapTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(101, "Vriti");
		ht.put(102,"vinay");
		ht.put(103, "Lonavala");
		ht.put(101, "praTiksha");
		System.out.println(ht);
		
		ht.putIfAbsent(105, "Pune");
		ht.put(101, "Tiksha");
		System.out.println(ht);
		
		ht.replace(101, "Vriti");
		System.out.println(ht);
		
		//for keys
		Set s=ht.keySet();
		System.out.println(s);
		
		//for values
		Collection<String>s1=ht.values();
		System.out.println(s1);

	}

}
