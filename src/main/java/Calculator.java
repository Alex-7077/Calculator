import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        double First;
        double Second;
        double Result;
        char Operation;
        Scanner reader = new Scanner(System.in);
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome to Alex's calculator!");
        while (true) {
            System.out.println(" ...Press (Enter) to continue...");
            try {
                System.in.read();
            } catch (Exception e) {
            }
            System.out.print("Enter first value: ");
            First = reader.nextDouble();
            System.out.print("Select operator (+, -, *, /): ");
            Operation = reader.next().charAt(0);
            System.out.print("Enter second value: ");
            Second = reader.nextDouble();
            switch (Operation) {
                case '+':
                    Result = First + Second;
                    break;
                case '-':
                    Result = First - Second;
                    break;
                case '*':
                    Result = First * Second;
                    break;
                case '/':
                    Result = First / Second;
                    break;
                default:
                    ;
                    return;


            }
            System.out.printf("Result: " + " " + First + " " + Operation + " " + Second + " = " + Result);

        }
    }
}

