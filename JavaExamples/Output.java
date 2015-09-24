class Output {
public static void main(String[] args) {

	 Output o = new Output();
		o.go(); // how does it know what is go??
}

void go() {
		int y = 7;
		
		for(int x = 1; x < 8; x++) {
			y++; // y=8 x=2, y=9, x=3, y=10 x=4, y=11 x=5
				// y=12, y=13, x=6, y=14,y=15
				// 13 15 x = 6 

		if (x > 4) {
		System.out.print(++y + " "); }
		
		if (y > 14) {
		System.out.println(" x = " + x);
		break;
}
}
}
}