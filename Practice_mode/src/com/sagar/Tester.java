package com.sagar;

class Employee{
	public int employeeId;
	private double basicSalary;
	private double totalSalary;
	public Employee(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double calculateTotalSalary(int bonusPercent) {
		//line 22
		return totalSalary;
	}
}

public class Tester {
	public static void main(String[] args) {
		Employee employee = new Employee(2150);
		employee.employeeId = 101;
		employee.calculateTotalSalary(8);
		// line 32
	}
}