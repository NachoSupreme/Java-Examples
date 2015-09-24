class RandomAddingEvenOdd {
	public static void main(String[] args) {

		
		int randomNumber = (int) (Math.random() * 1000);
		int sumEven = 0;
		int sumOdd = 0;
		
		System.out.println("Random number is " + randomNumber);

		// for (int y=1; y <= randomNumber; y++) {

		int y = 1;
		while (y <= randomNumber){
			if (y % 2 == 0) {
				sumEven = sumEven + y;}
				 else {
				sumOdd = sumOdd + y;}	
				y++;
	}
		

	System.out.println("The sum of the odd numbers is " + sumOdd);
	System.out.println("The sum of the even numbers is " + sumEven); }

}

