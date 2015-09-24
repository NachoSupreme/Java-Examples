public class PhraseOMatic {
	public static void main (String[] args) {
		//Make three sets of words to choose from. Add your own!
		String[] wordListOne= {"Nessreen"};
		String[] wordListTwo= {"is"};
		String[] wordListThree= {"sexy","bootylicious","georgeous","beautiful","a bubblebutt"};

	//Find out how many words are in each list
		int oneLength= wordListOne.length;
		int twoLength= wordListTwo.length;
		int threeLength= wordListThree.length;

	//Generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

	//Now build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

	//Printout Phrase
		System.out.println(phrase);}
	}