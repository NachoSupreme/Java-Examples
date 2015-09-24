import java.util.*


public class ArrayListMagnet {

ArrayList<String> a = new ArrayList<String>();

	public static void main(String[] args) {
		for (String element: al) {
			System.out.print(element + " ");
}
			System.out.println(" ");

	

	public static void printAL(ArrayList<String> al) {

		a.add(0,"zero");

		printAL(a);

		a.add(1,"one");

		printAL(a);

		a.add(2, "two");

		printAL(a);

		a.add(3, "three");
			printAL(a);


		a.remove(2);




		if(a.contains("three")) {
		a.add("four");
	}

	if(a.indexOf("four") !=4 {
		a.add(4, "4.2");
	}


}//end method
}//end main
}//end class


/*  
	zero one two three
	zero one three four
	zero one three four 4.2
	zero one three four 4.2
	*/ 