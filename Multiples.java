import java.util.Scanner;
public class Multiples{
  public static void main(String[]args){
    int num1=-1;
    int num2=-2;
    boolean isRunning=true;
    Scanner sc;

    while(isRunning){
      sc=new Scanner(System.in);
      System.out.println("Please give me an interger number");
      if(sc.hasNextInt()){
        num1=sc.nextInt();
        isRunning=false;
      }else{
        System.out.println("Problem will loop again");
        continue;
      }
    }

    isRunning=true;
    while(isRunning){
      sc=new Scanner(System.in);
      System.out.println("Enter your upper limit");
      if(sc.hasNextInt()){
        num2=sc.nextInt();
        isRunning=false;
        if(num2< num1){
          System.out.println("THE NUMBER YOU GAVE IS BIGGER THAN THE FIRST NUMBER!");
          System.out.println("Problem will loop again");
          continue;
        }
      }else{
        System.out.println("Problem will loop again");
        continue;
      }
    }
    int count = 1;
    System.out.println("The multiples between your two number given is/are");
    for(int result=num1; result<= num2; result+=num1){
      System.out.print(result + " ");
      if (count % 5 == 0)
        System.out.println();
      count++;
    }
}
  }
