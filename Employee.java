package com.var2;

public class Employee {

	int empId;
	String empName;

	 String employeeCompany;
	 
	  final String nationality="Indian";

	public static void main(String[] args) {

		Employee upendra = new Employee();
		upendra.empId = 1;
		upendra.empName = "Upendra";
		upendra.employeeCompany = "TCS";
		System.out.println("Upendra details");
		System.out.println("Id is " + upendra.empId);
		System.out.println("Name is " + upendra.empName);
		System.out.println("Upendra company is" + upendra.employeeCompany);
		System.out.println("Nationality "+upendra.nationality);
		
		System.out.println("----------------------------------------");
		Employee surendra = new Employee();
		surendra.empId = 2;
		surendra.empName = "surendra";
		surendra.employeeCompany = "TCS";

		System.out.println("surendra details");
		System.out.println("Id is " + surendra.empId);
		System.out.println("Name is " + surendra.empName);
		System.out.println("surendra company is" + surendra.employeeCompany);
		System.out.println("----------------------------------------");

		// upendra switched company
//		upendra.nationality="USA";
		upendra.employeeCompany = "Infosys";

		System.out.println("Once again upendra details");
		System.out.println("Id is " + upendra.empId);
		System.out.println("Name is " + upendra.empName);
		System.out.println("Upendra company is" + upendra.employeeCompany);
		System.out.println("Nationality "+upendra.nationality);
		System.out.println("----------------------------------------");

		System.out.println("Once again surendra details");
		System.out.println("Id is " + surendra.empId);
		System.out.println("Name is " + surendra.empName);
		System.out.println("surendra company is" + surendra.employeeCompany);

	}

}
