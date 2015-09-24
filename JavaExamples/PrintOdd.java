class PrintOdd {
	public static void main(String[] args) {
		int x = 0;

		while (x<100) {
			if (x%2==0) {
			System.out.println(x + " is even ");
			x = x+1;}
		else {
			System.out.println(x + " is odd ");
			x=x+1; }
	}
}
}