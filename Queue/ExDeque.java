package com.DAY12.Queue_Implementation;

import java.util.*;

public class ExDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String>d1=new ArrayDeque<String>();
		d1.add("abc");
		d1.add("ngh");
		d1.add("jkl");
		d1.add("you");
		System.out.println(d1);
		
		d1.poll();
		System.out.println(d1);
		d1.pollLast();
		System.out.println(d1);
		System.out.println();
		for(String str:d1) 
		{
			System.out.println(str);
		}
	}

}
