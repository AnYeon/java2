package p1;

import java.util.*;


public class Main {
	
	public static void main(String args[]) {
		
		List<Student> al=new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1=new Student("Kim");
		al.add(s1);
		Student s2= new Student("Choi");
		al.add(s2);
		al.add(new Student("Park"));
		al.add(new Student("King"));
		al.add(new Student("Jake"));
		al.add(new Student("Pawn"));
		al.add(new Student("Wook"));
		al.add(new Student("Sung"));
		al.add(new Student("Ban"));
		al.add(new Student("Jeong"));
		
		Collections.sort(al);
		
		for(Student s :al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		
		List<Fruit> fr=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s3=new Fruit("Banana");
		fr.add(s3);
		Fruit s4= new Fruit("Apple");
		fr.add(s4);
		fr.add(new Fruit("Watermelon"));
		fr.add(new Fruit("Kiwi"));
		fr.add(new Fruit("Grape"));
		fr.add(new Fruit("Pear"));
		fr.add(new Fruit("Peach"));
		fr.add(new Fruit("Cherry"));
		fr.add(new Fruit("Orange"));		
		Collections.sort(fr);
		
		for(Fruit s :fr) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(fr, Collections.reverseOrder());
		
		for(int i=0; i<fr.size(); i++) {
			System.out.println(fr.get(i).toString());
		}
		
		
		
	}

}
