import java.util.*;
public class SimpleDotComGame {
		GameHelper helper = new GameHelper();
		ArrayList<DotCom> dotComsList= new ArrayList<DotCom>();
		int numOfGuesses = 0;


	private	void setUpGame() {
			DotCom one = new DotCom();
				one.setName("Nazies");
			DotCom two = new  DotCom();
				two.setName("Imperialists");
			DotCom three = new DotCom();
				three.setName("Communists");

				dotComsList.add(one);
				dotComsList.add(two);
				dotComsList.add(three);

				System.out.println("There are three major enemies out there in the water");
				System.out.println("These enemies are threatening to kill us");
				System.out.println("You need to destroy them before it is too late");
				System.out.println("Try to sink all of of the enemies as soon as possible before we are killed!");
			
			for(DotCom dotComToSet: dotComsList) { // repeat with each DotCom in the list
				ArrayList<String> newLocation = helper.placeDotCom(3); // Ask the helper for a dotCom location (an ArrayList of Strings)
				dotComToSet.setLocationCells(newLocation); // Call the setter method on this DotCom to give it the location you just got from the helper
			} // close for loop
		} // close setUpGame method

			
		
	private	void startPlaying() {
		while(!dotComsList.isEmpty()) { // why the ! Book says As long as the DotCom list is NOT empty (the ! means NOT, it's the same as (dotComsListisEmpty()==false))
			String userGuess = helper.getUserInput("Please enter target coordinates");
			checkUserGuess(userGuess);// calling the checkUserGuessmehtod
			}// close while
			finishGame(); // call the finishGame method
		}// close startPlaying method
	private	void checkUserGuess(String userGuess) {
			numOfGuesses++;
			String result = "miss"; // assume it's a miss unless told otherwise
			
			for (DotCom dotComToTest: dotComsList) { // what does this even mean? Book says that this is to repeat with all DotComs in the list
				result = dotComToTest.checkYourself(userGuess); // ask the DotCom to chck the user guess, looking for a hit(or kill). the dotComToTest consists of both if statements below
				if (result.equals("hit")) {
					break; // no point in testing others so leave loop early
				} // close if
				if (result.equals("kill")) {
					dotComsList.remove(dotComToTest); // remove the dead guy from the list
					break;
				} // close second if
				} // close for
				
				if (result.equals("hit")) {
				System.out.println("Sir, we have a positive confirmation that the enemy ship has been hit");
			}// close if
				if (result.equals("miss")) {
				System.out.println("Sir, our coordinates have missed the enemy target");
			} // close second if
		}// close method


	private	void finishGame() {
	System.out.println("All of the enemy combatents are now dead");
		if(numOfGuesses<=70) {
		System.out.println("You are a badass");
					System.out.println("You only took " + numOfGuesses + " tries to sink all of the enemies");
					System.out.println("Congratualations!");
				}// close if
				else {
				System.out.println("You took " + numOfGuesses + " guesses to sink the enemies");
			} // close else
		} //close method
		
		public static void main(String[] args) {
			SimpleDotComGame game = new SimpleDotComGame(); // create the game object
				game.setUpGame(); // tell the game object to set up the game
				game.startPlaying(); //tell the game object to start the main game play loop(keeps asking for user input and checking the guess)
		}//close method
	} // close class

