import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to my Java Calculator!");

    while (true)
    {
        System.out.println("Enter an operation (+, -, *, /, or exit): ");
        String operation = scanner.nextLine();

        if (operation.equals("exit"))
        {
            System.out.println("GoodBye!");
            break;
        }

    System.out.println("First number: ");
    double num1 = getNumber(scanner);

    System.out.println("Second number: ");
    double num2 = getNumber(scanner);

    double result = 0;
    boolean validOperation = true;

     switch (operation)
     {
        case "+":
            result = num1 + num2;
        break;
        case "-":
            result = num1 - num2;
        break;
        case "*":
            result = num1 * num2;
        break;
        case "/":
        if (num2 == 0)
        {
            System.out.println("Error: Division by zero.");
            validOperation = false;
        }
    else
    {
        result = num1 / num2;
    }
    break;
    default: System.out.println("Invalid Operation.");
        validOperation = false;

     }
if (validOperation)
{
    System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
}


    System.out.println("Another operation? (yes/no): ");
    if (!scanner.nextLine().equals("yes"))
    {
        System.out.println("Goodbye!");
        break;
    }

    }
scanner.close();
    }
private static double getNumber(Scanner scanner)
{
    while (true)
    {
    try
    {
            return Double.parseDouble(scanner.nextLine());
    }
    catch (NumberFormatException e)
    {
        System.out.println("Invalid number. Try again: ");
    }
    }
}

}