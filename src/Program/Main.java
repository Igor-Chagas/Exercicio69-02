package Program;

import java.util.Scanner;

import entites.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.print("Wich percentage to increase salary? ");
		
		double percentage = sc.nextDouble();
		System.out.println();
		employee.IncreaseSalary(percentage);
		
				
		sc.close();
	}

}
