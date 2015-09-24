class IntArray {
	public static void main(String[] args) {

		int[] numbers = {10,8,31,47,0,-50};
		int highest = numbers[0];

		
		for(int nextNum: numbers) {
			if(highest<nextNum){
				highest = nextNum;
			}

		}

	}
}