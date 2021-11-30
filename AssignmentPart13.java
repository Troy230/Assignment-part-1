
package assignmentpart1.pkg3;
import java.util.Scanner;
/**
 *
 * @Eden Kendo-Pindi
 */
public class AssignmentPart13 {

   
    public static void main(String[] args) {
        

       //  Octal value 

        int octal = 2020;  

  

       int myOctal = 2020;  

       // Digits of octal number  

       int P1 = 0;  

  

       int P2 = 0;  

  

       int P3 = 0;  

  

       int P4 = 0;  

      // Tells computer to look at individual numbers 

      P1 = myOctal%10;  

  

      myOctal = myOctal/10;  

  

      P2 = myOctal%10;  

  

      myOctal = myOctal/10;  

  

      P3 = myOctal%10;  

  

      myOctal = myOctal/10;  

  

      P4 = myOctal%10;  

      // Converts octal to decimal 

      double D1 = P4 * Math.pow(8, 3);  

  

      double D2 = P3 * Math.pow(8, 2);  

  

      double D3 = P2 * Math.pow(8, 1);   

  

      double D4 = P1 * Math.pow(8, 0);   

  

      double decimal = D1 + D2 + D3 + D4;  

      // Shows information 

      System.out.printf("Please enter a 4-digits Octal number : %s%n%n", octal);  

  

      System.out.printf("Octal number   : %s%n", octal);  

  

      System.out.printf("Decimal number : %4.0f%n", decimal);  

  

         

  

        

  

         

  

    }  

  

      

  

}  

    
    

