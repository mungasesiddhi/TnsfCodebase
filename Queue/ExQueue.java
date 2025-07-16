package com.DAY12.Queue_Implementation;

import java.util.*;
public class ExQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue <Integer>q=new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(50);
		q.add(40);
		System.out.println(q);
		
		int positionpeek=q.peek();
		System.out.println(positionpeek);
		
		int posielment=q.element();
		System.out.println(posielment);
		
		System.out.println(q.remove());
		System.out.println(q);
		
		Iterator itr=q.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(q.poll());
		System.out.println(q);
		
		
		
			
	}

}
