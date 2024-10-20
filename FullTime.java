package EmployeePayrollSystem;

public class FullTime extends Employee {
private float monthlySalary;

FullTime(String name,int id,float monthlySalary){
	super(name,id);
	this.monthlySalary=monthlySalary;
}
@Override
float calculateSalary() {
	System.out.print("Full time ");
	return monthlySalary;
}

}
