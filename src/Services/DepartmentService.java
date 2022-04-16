package Services;

import java.util.List;

import Repositories.DepartmentRepository;
import models.Department;

public class DepartmentService {

	private DepartmentRepository repo;

	public DepartmentService(DepartmentRepository repo) {
		this.repo = repo;
	}

	public List<Department> GetAll() {
		return repo.GetAll();
	}

	public void Add(Department department) {
		repo.Add(department);
	}
}