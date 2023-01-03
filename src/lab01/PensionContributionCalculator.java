package lab01;

import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {

        //declare constants
        final int salaryCeiling = 6000;
        final double employeeRate55AndBelow = 0.2;
        final double employerRate55AndBelow = 0.17;
        final double employeeRateFrom55to60 = 0.13;
        final double employerRateFrom55to60 = 0.13;
        final double employeeRateFrom60to65 = 0.075;
        final double employerRateFrom60to65 = 0.09;
        final double employeeRateAbove65 = 0.05;
        final double employerRateAbove65 = 0.075;

        //declare variables
        int contributableSalary;
        double employeeContribution;
        double employerContribution;
        double totalContribution;

        //take information from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        int salary = scan.nextInt();
        System.out.print("Enter the age: ");
        int age = scan.nextInt();

        //check final contributable salary ( max = 6000 )
        if (salary > salaryCeiling) {
            contributableSalary = 6000;
        } else {
            contributableSalary = salary;
        }

        //compute contributions
        if (age <= 55) {
            employeeContribution = contributableSalary * employeeRate55AndBelow;
            employerContribution = contributableSalary * employerRate55AndBelow;
        } else if (age <= 60) {
            employeeContribution = contributableSalary * employeeRateFrom55to60;
            employerContribution = contributableSalary * employerRateFrom55to60;
        } else if (age <= 65) {
            employeeContribution = contributableSalary * employeeRateFrom60to65;
            employerContribution = contributableSalary * employerRateFrom60to65;
        } else {
            employeeContribution = contributableSalary * employeeRateAbove65;
            employerContribution = contributableSalary * employerRateAbove65;
        }

        System.out.printf("The employee's contribution is: %.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: %.2f%n", employerContribution);
        System.out.printf("The total contribution is: %.2f%n", (employeeContribution + employerContribution));

    }
}
