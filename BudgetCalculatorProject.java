import java.util.Scanner;

public class BudgetCalculator
{
    public static void main(String [] args)
    {
        final double SALARY = 4000.0;
        final double SAVINGS_PERCENT = 0.20;
        final double RENT_PERCENT = 0.10;
        final double GROCERIES_PERCENT = 0.15;
        final double ENTERTAINMENT_PERCENT = 0.10;
        Scanner console = new Scanner(System.in);

        System.out.println("Enter your monthly salary:");
        int monthlySalary = console.nextInt();

        double savedAmount;
        double rentAmount;
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double remainingBalance;

        savedAmount = monthlySalary * SAVINGS_PERCENT;
        rentAmount = monthlySalary * RENT_PERCENT;
        groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        remainingBalance = monthlySalary - totalExpenses;

        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Amount saved: " + savedAmount);
        System.out.println("Amount spent on rent: " + rentAmount);
        System.out.println("Amount spent on groceries: " + groceriesAmount);
        System.out.println("Amount spent on entertainment: " + entertainmentAmount);
        System.out.println("Total expenses: " + totalExpenses);
        System.out.println("Remaining balance: " + remainingBalance);
    }
}