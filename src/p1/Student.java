package p1;

public class Student implements Comparable<Student> {

		
		private String name;
		public Student() {	
		}
		public Student(String name) {
			this.name = name;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Student [name=" + name + "]";
		}
		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return name.compareTo(o.name);
		}
		
		

	

}
