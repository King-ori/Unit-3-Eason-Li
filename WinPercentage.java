import java.util.Scanner;
public class WinPercentage{
  public static void main(String[]args){

    Scanner sc;
    boolean isRunning=true;
    int Total = -1 ;
    int Won = -1;

    while(isRunning){
      sc=new Scanner(System.in);
      System.out.println("Please type in the total number of games you played");
      if(sc.hasNextInt()){
        Total=sc.nextInt();
        isRunning=false;
      }else{
        System.out.println("Problem will loop again");
        continue;
      }
    }

    isRunning=true;
    while(isRunning){
      sc=new Scanner(System.in);
      System.out.println("Please type in the total number of games you won");
      if(sc.hasNextInt()){
        Won=sc.nextInt();
        if(Won>Total){
          System.out.println("The number of games won cannot be greater than the total number of games you played");
          System.out.println("Problem will loop again");
          continue;
        }
        isRunning=false;
      }else{
        System.out.println("Problem will loop again");
        continue;
      }
    }

    double Percentage= (double) Won/Total;
    System.out.println("won = " + Won);
    System.out.println("total = " + Total);
    double Per=Math.round((Percentage*10000)/100.0);
    System.out.println("The percentage of games you won out of all games you played is" + Per+"%");
  }
}
