
package assignmentpart1.pkg2;
import java.util.Scanner;
/**
 *
 * @Eden Kendo-Pindi
 */
public class AssignmentPart12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  


          Scanner info = new Scanner(System.in);  

         // Asks to type in item price(1) and discount ratio(2) 

         System.out.printf("Please %s:", "enter the item price"); 

         Double itemPrice = info.nextDouble();  

          

         System.out.printf("Please %s:", "enter the discount ratio");  

         Double discRatio = info.nextDouble();  

          

         // Divides discount ratio by 100 

         Double decimalRatio = discRatio /100;  

          

         // Calculates the price before tax 

         Double priceTax = itemPrice * decimalRatio;  

         Double priceBeforeTax = itemPrice - priceTax;  

          

         //Calculates the federal and provincial tax 

         Double fedTax = 0.05 * priceBeforeTax; 

          

         Double provTax = 0.09975 * priceBeforeTax; 

          

         //Calculates the final price 

         Double finalPrice = priceBeforeTax + fedTax + provTax; 

          

  

           

        // Shows the item price, discount ratio,price before tax, federal tax, provincial tax, and the final price 

         System.out.printf("Original price      : %6.2f$%n", itemPrice);  

  

         System.out.printf("Discount ratio      : %6.2f%% %n", discRatio);  

  

         System.out.printf("Price Before Tax    : %6.2f$ %n", priceBeforeTax); 

          

         System.out.printf("------------------------------------ %n"); 

          

         System.out.printf("Federal tax         : %6.2f%n", fedTax); 

           

         System.out.printf("Provincial tax      : %6.2f%n", provTax); 

          

         System.out.printf("Final Price         : %6.2f$%n", finalPrice); 

          

        

  

    }  

  

      

  

}  

 
