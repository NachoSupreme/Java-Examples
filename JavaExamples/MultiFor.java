class MultiFor {
	public static void main(String[] args) {

		
		for(int x=0;x<4; x++) {
			int y;
			for(y=4; y > 2; y--) {
			System.out.println(x + " " + y);
			} 

			System.out.print(" " + y + " ");	
			//0 4
			//0 3
			//1
	
		if (x==1) {
			x++;
		}//end if
		} // end first for loop
	}// end main method

}// end class

/*0 4
0 3
1 4 // don't understand how y increases
1 3
3 4
3 3
*/