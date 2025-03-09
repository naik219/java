import java.util.Scanner;
class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle: ");
        float P = input.nextFloat(); 

        System.out.print("Enter time: ");
        float T = input.nextFloat(); 

        System.out.print("Enter rate: ");
        float R = input.nextFloat(); 

        input.close();

        float SI = (P*T*R)/100; 
        System.out.println("simple_interest : " + SI );
    }
}
