import java.util.Scanner;
public class DriveandDrink{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please tell me your age");
    int age=sc.nextInt();
    if(age>=17){
      if(age>=21){
        System.out.println("You are allowed to drink alchohol and drive a car,ahh!");
      }else{
        System.out.println("You are too young to drink alchohol, but you can drive already!");
      }
    }else{
      System.out.println("You are too young to drink alchohol, and drive!");
    }
  }
}
