package com.cg.eis.pl;
import com.cg.eis.service.Service.*;

import java.util.Scanner;

import com.cg.eis.bean.*;
public class EmployeeDetails implements EmployeeService {
	public static void main(String[] args) {	
		EmployeeDetails ed=new EmployeeDetails();
		ed.get_emp_details();
		ed.find_insurance_scheme();
		ed.display_details();	
	}
	Employee emp;
	@Override
	public void get_emp_details() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id of Employee");
		 int id=sc.nextInt();
		 System.out.println("Enter the Name of Employee");
		 String name=sc.next();
		 System.out.println("Enter the Salary of Employee");
		 int salary=sc.nextInt();
		 System.out.println("Enter the Designation of Employee");
		String designation=sc.next();

		emp=new Employee(id,name,salary,designation);
	}

	@Override
	public void find_insurance_scheme() {
		// TODO Auto-generated method stub
		if(emp.salary>50000) {
			emp.insuranceScheme=emp.salary*6;
		}
		else if(emp.salary>25000) {
			emp.insuranceScheme=emp.salary*4;
		}
		else {
			emp.insuranceScheme=emp.salary*2;

		}
		
	}

	@Override
	public void display_details() {
		// TODO Auto-generated method stub
		System.out.println("The Employee Details are as follows");
		System.out.println("The Employee ID is: "+emp.id);
		System.out.println("The Employee Name is: "+emp.name);
		System.out.println("The Employee Salary is: "+emp.salary+" Rupees");
		System.out.println("The Employee Designation is: "+emp.designation);
		System.out.println("The Best Insurance Scheme as per the Salary is: "+emp.insuranceScheme+" Rupees");
	}


}
