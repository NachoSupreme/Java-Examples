class MathOperators {
	String numbers;
	int x;
	int y;}
	class MathOperatorsTestDrive {
		public static void main(String[] args) {
			int x = (int) (Math.random() * 25);
			int y = (int) (Math.random() * 25);

			while(x<200) {
				if(x%2==0) {
					System.out.println(x + " is an even number");
					x++;
				}
				else {
					System.out.println(x + " is an odd number");
					x++;

				}
				
							}
			
		}
	}
