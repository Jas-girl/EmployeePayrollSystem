package EmployeePayrollSystem;

public class PartTime extends Employee {
private int hours; private int hoursrate;
PartTime(String name,int id,int hours,int hoursrate){
	super(name,id);
	this.hours=hours;
	this.hoursrate=hoursrate;
}
@Override
float calculateSalary() {
	System.out.print("Part time ");
	return hours*hoursrate;
}

}
