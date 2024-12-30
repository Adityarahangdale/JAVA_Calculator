import java.util.Scanner;

public class sircalc {
    Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        calculator obj2 = new calculator();

        int input, choice = 1;
        int num1, num2;
        System.out.println("Enter the first Number\t");

        do {
            System.out.println("--------------------------");
            System.out.println("------- CALCULATOR -------");
            System.out.println("--------------------------");
            System.out.println("Press-1: To Add Two Numbers");
            System.out.println("Press-2: To Sub Two Numbers");
            System.out.println("Press-3: To Multiply Two Numbers");
            System.out.println("Press-4: To Modulo  Two Numbers");
            System.out.println("Press-5: To Divide  Two Number");
            System.out.println("Press 6: Exit From Apllication");

            System.out.print("Enter your choice: ");
            input = obj1.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter First Number");
                    num1 = obj1.nextInt();
                    System.out.println("Enter The Second number");
                    num2 = obj1.nextInt();
                    System.out.println("Adition Of Two Number Is\t" +(num1 + num2));
                    break;
                case 2:
                    System.out.println("Enter First Number");
                    num1 = obj1.nextInt();
                    System.out.println("Enter The Second number\t");
                    num2 = obj1.nextInt();
                    System.out.println("Subtraction Of Two Number Is\t" +(num1-num2));
                    break;
                case 3:
                    System.out.println("Enter First Number");
                    num1 = obj1.nextInt();
                    System.out.println("Enter The Second number\t");
                    num2 = obj1.nextInt();
                    System.out.println("Multiplication Of Two Number Is\t" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Enter First Number");
                    num1 = obj1.nextInt();
                    System.out.println("Enter The Second number\t");
                    num2 = obj1.nextInt();
                    System.out.println(" Modulo Division Of Two Number Is\t" + (num1 % num2));
                    break;
                case 5:
                    System.out.println("Enter First Number");
                    num1 = obj1.nextInt();
                    System.out.println("Enter The Second number\t");
                    num2 = obj1.nextInt();
                    System.out.println("Division Of Two Number Is\t" + (num1 / num2));
                    break;
                case 6:
                    System.out.println("Exiting the application. Goodbye!");
                    choice = 0;
                    break;
                default:
                    System.out.println("Invalid input! Please try again.");
            }

            if (choice == 1) {
                System.out.print("Do you want to perform 1another operation? (1-Yes / 0-No): ");
                choice = obj1.nextInt();
            }
        } while (choice == 1);


    }
}