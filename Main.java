public class Main {

   public static void main(String []args) {
      
      // WHILE loops repeat instructions in the loop body
      // as long as a certain CONDITION is TRUE 

      // COUNTER-CONTROLLED while loop 
      // STEP #1: Initialize control variable 
      int count = 2; 
      // STEP #2: Test a condition 
      while (count <= 10) {
         // Loop body executes as while (count <= 5) is true 
         System.out.println(count);
         // STEP #3: Change the variable 
         // (do this after the statements you want to repeat)
         count++;
      }

      // FOR LOOPS: when you know HOW MANY TIMES to iterate 
      // for (initialize; test condition; change)
      for (int i = 5; i <= 27; i++) {
         System.out.println(i);
      }
      // Modify the CHANGE step to skip certain numbers 
      for (int i = 0; i <= 10; i+=2) {
         System.out.println(i); 
      }
      // Watch your INITIAL values and your OPERATOR 
      for (int i = 0; i < 12; i+=2) {
         System.out.println(i); 
      }
      // this loop did the SAME THING as the loop above 

      // DECREMENTING for loops are like counting backwards 
      for (int i = 10; i > 0; i --) {
         System.out.println(i); 
         // Print a special message when i is 1 
         if (i == 1) {
            System.out.println("Blast off!");
         }
      }

      // LOOPS & STRINGS 
      // Use a loop to iterate through each character in a string object (TRAVERSAL)

      // Use a FOR loop to "visit every char" 
      String name = "matthew"; 
      int finalIndex = name.length(); 
      System.out.println("Final Index: " + finalIndex); 

      // build a reversed String using loop 
      String reversed = "";
      for (int i = finalIndex - 1; i >= 0; i--) {
         System.out.println("Current Index: " + i); 
         String currentLetter = name.substring(i, i+1); // char at index 
         System.out.println(currentLetter); 
         reversed += currentLetter; // add char to reversed name 
      }
      System.out.println("Your name backwards: " + reversed); 

      // WHILE loops can handle tasks other than when you know how many times to iterate 
      // EX) Find & replace characters until all are replaced 
      

   } // END MAIN METHOD 
} // END CLASS 
