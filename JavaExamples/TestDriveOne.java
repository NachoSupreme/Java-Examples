
class TestDriveOne {
	public static void main(String[] args) {

		Books[] myBooks = new Books[3];
		int x=0;
		myBooks[0].title= "The Grapes of Java";
		myBooks[1].title= "The Java Gatsby";
		myBooks[2].title= "The Java Cookbook";
		myBooks[0].author = "Bob";
		myBooks[1].author = "Sue";
		myBooks[2].author = "Ian";
		

		while (x<3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.print(myBooks[x].author);
			x=x+1;}
	}
}