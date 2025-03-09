import java.util.Scanner;
    class Temperature {
          public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
 
            System.out.print("Enter Temperature in  Fahrenheit: ");
            float F = input.nextFloat(); 

            input.close();

            float C = (F - 32)*5/9; 

         System.out.println("Temperature in celsius: " + C);
         }
   }
