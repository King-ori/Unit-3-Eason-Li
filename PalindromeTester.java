import java.util.Scanner;
public class PalindromeTester{
  public static void main(String []args){

    int word = 0;

    while (word == 0){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter 'x' to start and 'y' to quit");
    	Scanner input2 = new Scanner(System.in);
    	if (input.next() == (input.next().substring(0 , 1)))
        	word = 1;

      System.out.println("Please enter a word");
    	String userInput = input.next();
    	int inputLength = userInput.length();
      int count = 0;

      String reversedInput = "";
    	for (int i = 0; i != inputLength; i++ ){
          reversedInput += userInput.charAt(inputLength - i - 1);
          count ++;
    	}

      double result = userInput.compareTo(reversedInput);


      if (result == 0)
        	System.out.println("It is a palindrome!");
        	else
        	System.out.println("It is not a palindrome");
    	}
	}
}
