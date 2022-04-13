package calculator;
import java.util.InputMismatchException;
import org.apache.logging.log4j.LogManager;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
public class Calculator {

    private static final Logger meralogger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator meracalculator = new Calculator();
        Scanner scn = new Scanner(System.in);
        double phelanumber1, dusranumber2;
        while(true) {
            System.out.print("\nDevopsCalculator, Choose to perform operation");
            System.out.print("\nPress 1 to find factorial\nPress 2 to find Square root\nPress 3 to find power\nPress 4 to find natural logarithm\nPress 5 to exit\nEnter your choice: ");
            int mychoice;
            try {
                mychoice = scn.nextInt();
            } catch (InputMismatchException error) {
                System.out.print("\nyou were supposed to enter an integer, you stupid\n");
                return;
            }

            if (mychoice==1) {
                System.out.print("\nnumber daalo : ");
                phelanumber1 = scn.nextDouble();
                System.out.print("\nFactorial of " + phelanumber1 + " is : " + meracalculator.calculatefactoral(phelanumber1) + "\n");
            }
            else if(mychoice==2) {
                // find square root
                System.out.print("\nnumber daalo : ");
                phelanumber1 = scn.nextDouble();
                System.out.print("\nSquare root of " + phelanumber1 + " is : " + meracalculator.calculatesqroot(phelanumber1) + "\n");
            }
            else if(mychoice==3) {
                // find power
                System.out.print("\nphela number daalo : ");
                phelanumber1 = scn.nextDouble();
                System.out.print("\ndusra number daalo : ");
                dusranumber2 = scn.nextDouble();
                System.out.print(phelanumber1 + " raised to power " + dusranumber2 + " is : " + meracalculator.calculatepower(phelanumber1, dusranumber2) + "\n");
            }
            else if(mychoice==4) {
                // find natural log
                System.out.print("\nnumber daalo : ");
                phelanumber1 = scn.nextDouble();
                System.out.print("\nNatural log of " + phelanumber1 + " is : " + meracalculator.calculatenaturalLog(phelanumber1) + "\n");
            }
                else{
                    System.out.println("\nExiting....Bye bye");
                    return;
                }
            }
        }
  //  }


    public double calculatefactoral(double phelanumber1) {
        meralogger.info("[FACTORIAL] - " + phelanumber1);
        double res = calculatefact(phelanumber1);
        meralogger.info("[RESULT - FACTORIAL] - " + res);
        return res;
    }



    public double calculatesqroot(double phelanumber1) {
        meralogger.info("[SQ ROOT] - " + phelanumber1);
        double answer = Math.sqrt(phelanumber1);
        meralogger.info("[RESULT - SQ ROOT] - " + answer);
        return answer;
    }


    public double calculatepower(double phelanumber1, double dusranumber2) {
        meralogger.info("[POWER - " + phelanumber1 + " RAISED TO] " + dusranumber2);
        double result = Math.pow(phelanumber1,dusranumber2);
        meralogger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double calculatenaturalLog(double phelanumber1) {
        meralogger.info("[NATURAL LOG] - " + phelanumber1);
        double answer = 0;
        try {

            if (phelanumber1 <0 ) {
                answer = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                answer = Math.log(phelanumber1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        meralogger.info("[RESULT - NATURAL LOG] - " + answer);
        return answer;
    }
    public double calculatefact(double num) {
        double answer = 1;
        int i=1;
        while( i <= num)
        { answer*= i;
        i++;}
        return answer;
    }
}