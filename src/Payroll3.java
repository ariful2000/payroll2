import java.util.Scanner;

public class Payroll3 {
    public static void main(String[] args) {

        String firstName, lastName;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter employee's first name: ");
        firstName = input.nextLine();

        System.out.println("Enter employee's last name: ");
        lastName = input.nextLine();

        System.out.println("Enter number of hours " + firstName.toUpperCase() + " " + lastName.toUpperCase() + " worked:");
        double  hours = input.nextDouble();

        System.out.println("Enter hourly rate of pay:");
        double  pay = input.nextDouble();

        double  gross_pay = pay * hours;

        System.out.println("Enter federal tax rate:");
        double  fedTax = input.nextDouble();
        double fedTaxRate = fedTax;

        double deductions = fedTaxRate/100 * gross_pay;

        double net_pay = gross_pay - deductions;

        System.out.println("Hours worked: " + hours);

        System.out.println("Hourly rate: " + pay);

        System.out.println("Gross pay: " + gross_pay);

        System.out.println("Tax deducted: " + deductions);

        System.out.println("Net pay: " + net_pay);

        System.out.println("Hello World 1000");

    }
}
