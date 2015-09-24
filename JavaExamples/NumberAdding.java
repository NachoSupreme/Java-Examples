class NumberAdding {
	public static void main(String[] args) {
		int y = 0;


		while (y<10) {
			int number1 = (int) (Math.random() * 100);
			System.out.print(" The first number is " + number1);
			int number2 = (int) (Math.random() * 100);
			System.out.println(" The second number is " + number2);
			int sum = number1+number2;
			System.out.println(" Their total is " + sum);
			y=y+1;
		}
	}
}