import java.util.Scanner;
public class Temperature{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    int Temp=sc.nextInt();
    System.out.println("please tell me the temperature");
    if(Temp>83){
      System.out.println("hot");
    }else if(68<=Temp && Temp<=83){
      System.out.println("ideal");
    }else if(45<=Temp && Temp<=67){
      System.out.println("cool");
    }else{
      System.out.println("cold");
    }
  }
}
