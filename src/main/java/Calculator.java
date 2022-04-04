import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        while(true){
            System.out.print("DevOps-Calculator, Choose the appropriate option perform your required operation\n");
            System.out.print("Press 1 to find factorial\nPress 2 to find Square root\nPress 3 to find power\nPress 4 to find natural logarithm\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (choice) {
                case 1:
                    // do factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of "+number1+" is : " + factoral(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // find square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" is : " + sqroot(number1));
                    System.out.println("\n");


                    break;
                case 3:
                    // find power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1+ " raised to power "+number2+" is : " + power(number1, number2));
                    System.out.println("\n");
                    break;
                case 4:
                    // find natural log
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural log of "+number1+" is : " + naturalLog(number1));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        }
    }
    public static double factoral(double number1) {
        double facto = 1;
        for(int i = 1; i <= number1; ++i)
        { facto *= i;   }
        return  facto;
    }



    public static double sqroot(double number1) {
        double result = Math.sqrt(number1);
        return result;
    }


    public static double power(double number1, double number2) {
        double result = Math.pow(number1,number2);
        return result;
    }

    public static double naturalLog(double number1) {
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        return result;
    }


}