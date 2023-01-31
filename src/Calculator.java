import java.util.Scanner;

public class Calculator {
        public static void main (String[]args){

            System.out.println("Welcome to Alex's Calculator");
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter first value: ");
            double First = reader.nextDouble();

            System.out.print("Select operation e.g. +;-;/;*;/. ");
            String Operation = reader.nextLine();

            System.out.print(" ");
            String OperationN = reader.nextLine();

            System.out.print("Enter second value: ");
            double Second = reader.nextDouble();
            char op;
            double ans;

            op = reader.next().charAt(0);

            switch(op) {
                case '+': ans = First + Second;
                    break;
                case '-': ans = First - Second;
                    break;
                case '*': ans = First * Second;
                    break;
                case '/': ans = First / Second;
                    break;
                default: System.out.printf("Error! Enter correct operator");
                    return;
            }
            System.out.printf(First + " " + op + " " + Second + " = " + ans);
        }
    }


