import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = s.nextInt();
        System.out.println("Enter the second number:");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
        s.close();
    }
}
