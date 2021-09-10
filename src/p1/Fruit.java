package p1;

public class Fruit implements Comparable<Fruit> {
	
	private String name;
	public Fruit() {	
	}
	public Fruit(String name) {
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
	public int compareTo(Fruit o) {
		return name.compareTo(o.name);
	}
}
