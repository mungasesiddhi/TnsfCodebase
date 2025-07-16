package com.DAY13.SET_Implementation;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Student>set=new HashSet<Student>();
		set.add(new Student(101,"abc",45.09));
		set.add(new Student(102,"abj",50.89));
		set.add(new Student(103,"ayu",70.54));
		set.add(new Student(104,"tyu",90.67));
		set.add(new Student(105,"jkl",89.56));
		
		System.out.println(set);


	}

}
