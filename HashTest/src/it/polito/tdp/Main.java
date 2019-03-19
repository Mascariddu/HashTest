package it.polito.tdp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> studenti = new HashSet<Student>();

		Student s1 = new Student(1,"Mario", "Rossi");
		Student s2 = new Student(1, "Mario", "Rossi");
		
		studenti.add(s1);
		studenti.add(s2);
		
		System.out.println("Student1 equals Student2:" + s1.equals(s2));
		System.out.println("Dimensione:" + studenti.size());
		System.out.println("contiene Mario Rossi? \n" + studenti.contains(new Student(1,"Mario", "Rossi")));
		
		System.out.println("Student1 hashCode:" + s1.hashCode());
		System.out.println("Student1 hashCode:" + s2.hashCode());
		
		System.out.println("Student1 and Student2 equals:" + s1.equals(s2));
	}

}
