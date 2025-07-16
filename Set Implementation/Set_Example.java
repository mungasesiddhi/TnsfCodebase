package com.DAY13.SET_Implementation;
import java.util.*;

public class Set_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		set.add(24);
		set.add(05);
		set.add(15);
		set.add(13);
		set.add(22);
		
		System.out.println(set);
		boolean b = set.contains(24);
		System.out.println(b);
		
		boolean b2 = set.isEmpty();
		System.out.println(b2);
		
		set.remove(15);
		System.out.println(set);
		
		Iterator<Integer> i = set.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next()+" ");
		}
	
		
		
	}

}
