import java.util.Scanner;

public class Camelcase
 {
 public static void main(String args[]) {
  Scanner in=new Scanner(System.in);
   System.out.println("Enter any sentence : ");
  String input=in.nextLine();
  String result = "";
   char firstchar=input.charAt(0);
   result=result+Character.toUpperCase(firstchar);
    for(int i;i<=input.length();i++)
    {
    char currntchar=input.charAt(i);
    char prevchar=input.charAt(i-1);
    if(prevchar ==' ')
    result=result+Character.toUpperCase(currntchar);
     else
    result=result+currntchar;
    }
  System.out.println(result);
  }
}
  
