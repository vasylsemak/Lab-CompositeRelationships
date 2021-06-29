
public class ClassB {
	ClassA classA = new ClassA();

	public static void main(String[] args) {
		ClassB b = new ClassB();
		
		b.classA.setName("Maximko");
		
		System.out.println("You've set this name: " + b.classA.getName());
	}

}
