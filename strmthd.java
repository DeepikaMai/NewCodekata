import java.util.*;
import java.lang.*;

public class strmthd {
 
  public static void main(String args[]){
    
    String strOriginal = "Hello World";
    System.out.println("Original String : " + strOriginal);
   
   
    strOriginal = new StringBuffer(strOriginal).reverse().toString();
       
    System.out.println("Reversed String : " + strOriginal);
  }
 
}
