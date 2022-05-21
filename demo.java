package demo;
import java.util.Scanner;
public class demo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first name is: ");
        String firstname = scanner.next();
        System.out.println("your first name is :" + firstname);
        System.out.println("enter the last name is: ");
        String lastname = scanner.next();
        System.out.println("your last name is :" + lastname);
        System.out.println("enter the salary is: ");
        double salary = scanner.nextDouble();
        System.out.println("your salary is :" + salary);
        System.out.println("enter age is: ");
        int age = scanner.nextInt();
        System.out.println("your age is :" + age);
    }

}
