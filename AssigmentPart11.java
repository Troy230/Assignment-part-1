
package assigmentpart1.pkg1;
import java.util.Scanner;
/**
 *
 * @Eden Kendo-Pindi
 */
public class AssigmentPart11 {

 
      
    public static void main(String[] args) { 

          Scanner info = new Scanner(System.in); 

          // Asks your name, age, gender, department. 

          System.out.printf("Please %s:", "enter your name"); 

         String Name = info.nextLine(); 

          System.out.printf("Please %s:", "enter your age"); 

         String Age = info.nextLine(); 

          System.out.printf("Please %s:", "enter your gender"); 

         String Gender = info.nextLine(); 

          System.out.printf("Please %s:", "enter your department"); 

         String Department = info.nextLine(); 

           

         // Shows what you typed in 

         System.out.printf("Name           : %s%n" , Name); 

         System.out.printf("Age            : %s%n" , Age); 

         System.out.printf("Gender         : %s%n" , Gender); 

         System.out.printf("Department     : %s%n" , Department); 

         

    } 

     

} 

 
    
    

