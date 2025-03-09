 import java.util.Scanner;
 class largest_num {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number1: ");
        float n1 = input.nextFloat(); 

        System.out.print("Enter number2: ");
        float n2 = input.nextFloat(); 

        System.out.print("Enter number3: ");
        float n3 = input.nextFloat(); 

        input.close();

        float largest = (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ?     n2 : n3);
       
        System.out.println("Largest numbers: " +largest);
       }
}
