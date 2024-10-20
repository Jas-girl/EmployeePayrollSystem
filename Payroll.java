package EmployeePayrollSystem;

public class Payroll {
	Employee e;
	public Payroll() {
		// TODO Auto-generated constructor stub
	}

	public Payroll(Employee e) {
      this.e=e;
	}

	public void work() {
		Employee arr[] = new Employee[3];
		arr[0] = new FullTime("Rahul", 10, 23450f);
		arr[1] = new FullTime("Rhul", 10, 23450);
		arr[2] = new PartTime("Rhul", 10, 12, 45);
//		Payroll p = new Payroll();
		Employee arr1[] = new Employee[2];
		Employee arr2[] = new Employee[arr.length + arr1.length];
		arr1[0] = add("Aman", 30, 3450f);
		arr1[1] = add("ASD", 234, 45, 67);
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			arr2[index++] = arr[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			arr2[index++] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {

			System.out.println(arr2[i].toString());
		}
		remove(arr2,234);

	}

	public Employee add(String name, int id, float salary) {
		return new FullTime(name, id, salary);
	}

	public Employee add(String name, int id, int hours, int hoursrate) {
		return new PartTime(name, id, hours, hoursrate);
	}
	
	
	public void remove(Employee arr2[],int id) {
		System.out.println("After removing the array");
		int count=0;int index=0;
		for (int i = 0; i < arr2.length; i++) {
			if(id!=arr2[i].getId()) {
				count++;
			}
		}
		Employee arr3[] = new Employee[count];
		for (int i = 0; i < arr2.length; i++) {
			if(id!=arr2[i].getId()) {
			  arr3[index++]=arr2[i];
			}
			
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i].toString());
		}
		
		
	}
	

}
