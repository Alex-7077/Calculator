import java.util.Scanner;

public class Calculator {
        public static void main (String[]args){

            System.out.println("Welcome to Alex's Calculator");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first value: ");
            int First = sc.nextInt();

            System.out.print("\"Select operation e.g. \"+;-;/;*\"\"");
            String Operation = sc.nextLine();

            System.out.print(" ");
            String OperationN = sc.nextLine();

            System.out.print("Enter second value: ");
            int Second = sc.nextInt();

            System.out.println("Result: " + First + " " + Operation + OperationN + " " + Second + " " + "=");
        }
    }


