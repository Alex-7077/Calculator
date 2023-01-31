import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

            double First;
            double Second;
            double Result;
            char Operation;
            Scanner reader = new Scanner(System.in);
            Scanner scnr = new Scanner(System.in);
            // public void pressEnterToContinue();
            System.out.println("Welcome to Alex's calculator!");
        while (true)  {
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
            System.out.print("Do yo want to continue ? (Y/n)>");
            if ("exit".equals(command)) {
                System.out.println("Good Bye!");
                break;

            }
            scnr.close();
        }
        private static void printTime() {
            System.out.printf("%1tT\n", new Date());
        }

        private static void printDate() {
            System.out.printf("%1tY-%1$tm-%1$td\n", new Date());
        }

        private static void printListCommand() {
            System.out.println(
                    "'help'\tprint list commands;\n" +
                            "'exit'\texit from programm;\n" +
                            "'date'\tprint today's date;\n" +
                            "'time'\tprint current time;");
        }
    }
                  }
    }
}


