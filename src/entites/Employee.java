package entites;

public class Employee {

	public String name;
	public double GrossSalary;
	public double Tax;

	public double NetSalary() {
		return GrossSalary - Tax;
	}

	public void IncreaseSalary(double percentage) {
		double x = (GrossSalary - Tax) + (GrossSalary * percentage / 100);
		System.out.printf("Updated data: %s, $ %.2f\n", name, x);		

	}
	
	public String toString () {
		return name
			   + ", $ "
			   + String.format("%.2f\n", NetSalary());
				
	}
	
}
