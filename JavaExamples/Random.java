class Random {
	

	public static void main(String[] args) {

		int y=1;

		int randomOne = (int) (Math.random() *10);

		while (y<26) {

			System.out.print(y + ": ");

			int randomTwo = (int) (Math.random() *10);

			if(randomOne > randomTwo){
				System.out.println(randomOne + " is greater than " + randomTwo);

			} 

			if(randomOne < randomTwo) {
				System.out.println(randomOne + " is less than " + randomTwo);


			}

			if (randomOne == randomTwo) {
				System.out.println(randomOne + " is equal to " + randomTwo);


			}

			randomOne = randomTwo;
			y=y+1;}

	
	}	
}


