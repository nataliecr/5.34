import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args){
    int wins = 0, losses = 0;
    
    do{  
      Scanner input = new Scanner(System.in);
      System.out.print("scissors (0) rock (1) paper (2): ");
      int choice = input.nextInt();
    
      int computer = (int)(Math.random() * 3);
    
    
      System.out.println("The computer is " + computer);
      System.out.print("You are " + choice + " ");
            
      if(choice == computer){
          System.out.println("too. It is a draw.");
      } // if
      else{
        if(((choice == 0) && (computer == 2)) || ((choice == 1) && (computer == 0))
           || ((choice == 2) && (computer == 1))){
            System.out.println("You won ");
            wins += 1;
        } // if win
        else{
            System.out.println("You lost ");
            losses += 1;
        } // else
      } // else
      System.out.println();
    } while (losses <= 2 && wins <= 2);
    } // main 
  } // RockPaperScissors
