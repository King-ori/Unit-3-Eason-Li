import java.util.Scanner;
public class DrinkingAge{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please type in your age");
    int age=sc.nextInt();
    if(age>=21){
      System.out.println("You are allowed to drink alchohol,party time!");
    }else{
      System.out.println("You are not allowed to drink alchohol yet kido:)");
    }
  }
}
