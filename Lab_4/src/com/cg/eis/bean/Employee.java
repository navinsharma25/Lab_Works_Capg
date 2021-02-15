package com.cg.eis.bean;

import java.io.*;
import java.util.*;

public class Employee {
	public int id;
	public String name;
	public int salary;
	public String designation;
	public int insuranceScheme;
	
	public Employee(int id,	String name,int salary,	String designation	) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;

	}
}
