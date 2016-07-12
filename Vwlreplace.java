import java.util.Scanner;

public class Vwlreplace {
	public static void main(String[] args)
	{
		System.out.println("Enter the String:");
    try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            char[] try1= str.toCharArray();
            for (int i=try1.length-1;i>=0;i--)
            System.out.print(try1[i]);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        char[] strnw=try1.toString;
 strnw= strnw.replaceAll("[AEIOUaeiou]", "");
 System.out.println(strnw);
}}
