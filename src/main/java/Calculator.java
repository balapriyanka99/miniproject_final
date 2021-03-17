import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double val1, val2;
        do {
            System.out.println("Calculator using Dev-Ops, select the operation which you wnat to perform ");
            System.out.print("select 1 for Square Root\nselect 2 for Factorial\nselect 3 to Log(base e)\nselect 4 for Power\n" +
                    "select any other key to exit\nEnter your choice: ");
            int ch;
            try {
                ch = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            try {


                switch (ch) {
                    case 1:

                        System.out.print("Enter the number : ");
                        val1 = scanner.nextDouble();
                        System.out.println("Square Root of the number " + val1 +"is:"+cal.squareRoot(val1));
                        break;
                    case 2:
                        System.out.print("Enter the number : ");
                        val1 = scanner.nextDouble();
                        System.out.println("Factorial of the number " + val1 +"is:"+ cal.factorial(val1));
                        break;
                    case 3:
                        System.out.print("Enter the number : ");
                        val1 = scanner.nextDouble();
                        System.out.println("Log of the number " + val1 +"is:"+ cal.log(val1));
                        break;
                    case 4:
                        System.out.print("Enter the first number : ");
                        val1 = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        val2 = scanner.nextDouble();
                        System.out.println("Power Answer is : " + cal.power(val1, val2));
                        break;
                    default:
                        System.out.println("Exit");
                        return;
                }
            } catch (InputMismatchException error) {
                logger.error("Invalid input, Entered value is not a number");
                return;
            }
        } while (true);

    }


    public double squareRoot(double val1) {
        logger.info("[SQUARE ROOT] - " + val1);
        double result = Math.sqrt(val1);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public int factorial(double val1) {
        logger.info("[FACTORIAL] - " + val1);
        int r= 1;
        if(val1 == 1)
            return 1;
        for(int i=2; i<=val1; i++){
            r*=i;
        }
        logger.info("[RESULT - FACTORIAL] - " + r);
        return r;
    }


    public double log(double val1) {
        logger.info("[LOG] - " + val1);
        double r = Math.log(val1);
        logger.info("[RESULT - LOG] - " + r);
        return r;
    }

    public double power(double val1, double val2) {
        logger.info("[POWER] - " + val1 +","+val2);
        double r = Math.pow(val1,val2);
        logger.info("[RESULT - POWER] - " + r);
        return r;
    }

}

