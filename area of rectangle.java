import java.util.Scanner;
class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        float l = input.nextFloat(); 

        System.out.print("Enter width: ");
        float b = input.nextFloat(); 

        input.close();

        float area = l * b; 

        System.out.println("Area of rectangle: " + area);
    }
}
