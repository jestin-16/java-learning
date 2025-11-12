import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, res;
        char op;

        System.out.println("Enter first number:");
        num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        num2 = scanner.nextInt();

        System.out.println("Enter operator (+,-,*,/):");
        op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                res = num1 + num2;
                System.out.println("Result: " + res);
                break;

            case '-':
                res = num1 - num2;
                System.out.println("Result: " + res);
                break;

            case '*':
                res = num1 * num2;
                System.out.println("Result: " + res);
                break;

            case '/':
                if (num2 != 0) {
                    res = num1 / num2;
                    System.out.println("Result: " + res);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;

            default:
                System.out.println("Invalid operator");
        }

        scanner.close();
    }
}
