import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors{
  public static void main(String[]args){
    String ComputerChoice = "";

    Scanner sc = new Scanner(System.in);
    System.out.println("Hi! Do you wanna play a RockPaperScissors game with this PC? Y to continue N to end");
    String a = sc.nextLine();


    while(a.equals("Y")){
      System.out.println("R for Rock, P for paper and S for scissors. Which one do u pick?");
      String rps =sc.nextLine();
      Random rdm = new Random();
      int num = rdm.nextInt(12);



      if(num < 4){
        ComputerChoice = "R";
      }
      else if(num < 8){
        ComputerChoice = "P";
      }
      else{
        ComputerChoice = "S";
      }


      if(ComputerChoice.equals(rps)){
        System.out.println("It's tie!");
      }


      else if(ComputerChoice.equals("R")){
        if(rps.equals("P")){
          System.out.println("You beated the PC!");
        }
        else if(ComputerChoice.equals("S")){
          System.out.println("You lost to the PC!");
        }
      }


      else if(ComputerChoice.equals("P")){
        if(rps.equals("R")){
          System.out.println("You Lost to the PC!");
        }
        else if(rps.equals("S")){
          System.out.println("You beated the PC!");
        }
      }


      else{
        if(rps.equals("P")){
          System.out.println("You lost to the PC!");
        }
        else if(rps.equals("R")){
          System.out.println("You beated the PC!");
        }
      }
      System.out.println(ComputerChoice);


      System.out.println("Do u wanna play with PC again? A for yes and B for no?");
      String Answer = sc.nextLine();
      if(Answer.equals("B")){
        break;
      }
      else{
        continue;
      }
    }

  }
}
