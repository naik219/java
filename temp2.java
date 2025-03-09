import java.util.Scanner;
    class temperature2 {
          public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
 
            System.out.print("Enter Temperature in  Celsius: ");
            float C = input.nextFloat(); 

            input.close();

            float F = (C * 9/5) + 32; 

         System.out.println("Temperature in Fahrenheit: " + F);
         }
   }
