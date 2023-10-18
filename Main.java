import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
   // Choose a random number from 0-100 
    int num1;
    int count;

    num1 = (int)(Math.random()*101);
    

   // Ask the user to guess a number from 0 to 100 
   System.out.print("Guess 1-100");
   // Get the first guess using scan.nextInt();
    count = scan.nextInt();

   // Loop while the guess does not equal the random number,
   while (count != num1)
   {
    if (count < num1)
    {
      System.out.print("Too low!");
    }
    else
    {
      System.out.print("Too high!");
    }
    count = scan.nextInt();
   }

     // If the guess is less than the random number, print out "Too low!"
   
     // If the guess is greater than the random number, print out "Too high!"
   
     // Get a new guess (save it into the same variable)
   

  // Print out something like "You got it!"
  System.out.print("You got it!");


  }
}