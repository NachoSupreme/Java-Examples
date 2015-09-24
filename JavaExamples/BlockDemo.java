class BlockDemo {
     public static void main(String[] args) {
     		int x=10;
     		boolean taco = true;
          while (x>5 && taco)
            { // begin block 1
               System.out.println("Taco is true.");
               x = x - 1;
               System.out.println("x now equals " + x);
          } // end block one
          if (taco==false) { // begin block 2
               System.out.println("Taco is false.");
          } // end block 2
     }
}