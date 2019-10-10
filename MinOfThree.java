import java.util.Scanner;
public class MinOfThree{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please give me three integer number");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();

    System.out.println("Please give me three integer numbers");
    if(num1<num2 && num1<num3)
      System.out.println("The smallest number of them is "+num1);
    if(num2<num1 && num2<num3)
      System.out.println("The smallest number of them is "+num2);
    if(num1<num2 && num1<num3)
      System.out.println("The smallest number of them is "+num3);

  }
}
