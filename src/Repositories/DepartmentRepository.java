package Repositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import models.Department;

public class DepartmentRepository {
	List<Department> departments = new ArrayList(Arrays.asList(new Department("Obixy")));
	
	public List<Department> GetAll(){
		return departments;
	}
	
	public void Add(Department department) {
		department.setId(departments.size());
		departments.add(department);
	}
}