import java.util.Scanner;
public class StringPrinter{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter your word");
    String a=sc.nextline();
    for(int i=0; i<a.length(); i++){
      System.out.println(a.chartAt(i));
    }

  }
}
