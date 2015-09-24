public class SimpleDotComTestDrive {
	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();

		int[] locations = {2,3,4};

		dot.setLocationCells(locations); //invoke the setter method on the dot com
										// What is exactly does this mean and how does it accomplish this

		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
		}
	}
