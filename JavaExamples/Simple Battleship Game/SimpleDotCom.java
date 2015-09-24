import java.util.ArrayList;

public class SimpleDotCom {

	private ArrayList<String> location cells; // an ArrayList of cell location
	private String name; // the DotCom's name
\

	public void setLocationCells(ArrayList<String> loc) { // a setter method that updates the DotCom's location. (Rndom location provided by the GameHelper placeDotCom() method)
			locationCells=loc;
		}

		public void setName(String n) { // this line is a basic setter method
			name = n;
		}

public String checkYourself(String userInput) {
		String result = "miss"
		int index = locationCells.indexOf(userInput); // The ArrayList indexOf() method in action! If the  user guess is one of the entries in the ArrayList, indexOf() will return its ArrayList locaton. If not, indexOf() will return - 1. This is the explaination by the book. Not Sure what it meants
	if (index>=0) {
		locationCells.remove(index); // Using ArrayList's remove() method to delete an entry;
		
		if (locationCells.isEmpty()) {
			result = "kill";
			System.out.println("Sir, we have positive confirmation that we have sank the enemy " + name);
		} else { 
				result = "hit";}
			} //close if
		}// close outer if

		return result; // what is the result? the if and else statements above?
	}// close method
} // close class