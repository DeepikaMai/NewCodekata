import java.io.*;
import java.util.Scanner;
class Week
{
public static void main(String[] args)
{
String ch="";
System.out.println("enter the choice");
Scanner s=new Scanner(System.in);
ch=s.nextLine();
switch(ch)
{
case "monday":
case "Monday":
System.out.println("Workingday('" + ch + "') -> true");
break;
case "tuesday":
case "Tuesday":
System.out.println("Workingday('" + ch + "') -> true");
break;
case "wednesday":
case "Wednesday":
System.out.println("Workingday('" + ch + "') -> true");
break;
case "thursday":
case "Thursday":
System.out.println("Workingday('" + ch + "') -> true");
break;
case "friday":
case "Friday":
System.out.println("Workingday('" + ch + "') -> true");
default:
System.out.println("Workingday('" + ch + "') -> false");
break;
}
}
}
