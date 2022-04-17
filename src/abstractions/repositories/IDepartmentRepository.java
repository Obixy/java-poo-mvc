package abstractions.repositories;

import java.util.List;
import models.Department;

public interface IDepartmentRepository {
	List<Department> GetAll();
	void Add(Department department); 
}
