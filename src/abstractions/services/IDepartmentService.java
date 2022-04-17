package abstractions.services;

import java.util.List;
import models.Department;

public interface IDepartmentService {
	List<Department> GetAll();
	void Add(Department department);
}
