class Dog {
		int size;
		String name;
		void bark(int numOfBarks) {
			while (numOfBarks >0) {
				System.out.println("Ruff");
				numOfBarks = numOfBarks - 1;
			}
		}

		

	}

public class DogTestDrive {
	public static void main(String[] args) {
		Dog one = new Dog();
		one.size = 70;
		Dog two = new Dog();
		two.size = 8;
		Dog three = new Dog();
		three.size =35;
		Dog d = new Dog();
		d.bark(3);
		one.bark();
		two.bark();
		three.bark();
		d.bark();

}	

	
	}
