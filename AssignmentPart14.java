
package assignmentpart1.pkg4;
import java.util.Scanner;
/**
 *
 * @Eden Kendo-Pindi
 */
public class AssignmentPart14 {

  
    public static void main(String[] args) {
       

     Scanner info = new Scanner(System.in);  

     // Asks to type initial balance 

     System.out.printf("Please %s: $", "enter the initial balance"); 

     int balance = info.nextInt(); 

     // Asks to type interest rate 

     System.out.printf("Please %s: ", "enter the annual interest rate"); 

     double intRate = info.nextDouble(); 

     // Asks to type number of year client wants to save the money in the bank 

     System.out.printf("Please %s: ", "enter the number of years the client wants to send money in the bank"); 

     int numbOfYears = info.nextInt(); 

     // Calculates formula {balance * [(1 + intRateDecimal)^numbOfYears â€“ 1]} 

     double intRateDecimal = intRate/100; 

     double F1 = 1 + intRateDecimal; 

     double F2 = Math.pow(F1,numbOfYears) - 1; 

     double AmountOfInterest = balance * F2;  

     double BalanceAfterYears = balance + AmountOfInterest; 

     // Shows information 

     System.out.printf("Initial balance        : %s%n" ,balance );  

  

     System.out.printf("Annual Interest Rate   : %5.2f%% %n" ,intRate);  

  

     System.out.printf("Saving years           : %s%n" ,      numbOfYears); 

       

     System.out.printf("---------------- %12s%n", "------------------"); 

        

     System.out.printf("Balance after %s years  : " , numbOfYears); 

        

     System.out.printf("%5.2f%n ", BalanceAfterYears); 

        

        

     

         

  

        

  

         

  

    }  

  

      

  

}  

 

 

 
    
    

