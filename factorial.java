import java.util.Scanner;
    class factorial {
        public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = input.nextInt(); 
            input.close();

            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            } 
           System.out.println("Factorial of " + n + " is: " + factorial);
         }
    }
