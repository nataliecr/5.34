import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("scissors (0) rock (1) paper (2): ");
    int choice = input.nextInt();
    
    int computer = (int)(Math.random() * 3);
    
    
    System.out.println("The computer is " + computer);
    System.out.println("You are " + choice);
            
    if(choice == computer){
        System.out.println(" too. It is a draw.");
    } // if
    else{
      if(((choice == 0) && (computer == 2)) || ((choice == 1) && (computer == 0))
         || ((choice == 2) && (computer == 1)))
          System.out.print("You won ");
      else
          System.out.print("You lost ");
    } // else
  } // main 
} // RockPaperScissors
