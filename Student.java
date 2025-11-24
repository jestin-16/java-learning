import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        String name = sc.nextLine();
        System.out.println("Enter the mark :");
        int mark = sc.nextInt();
        if (mark > 50)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        sc.close();
    }
}