package models;

public class Department {

	private Integer id = 1;
	private String name;

	public Department(String name) {
		this.name = name;
	}

	public void setId(Integer id) {
		this.id = id + 1;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "id: " + id + " | Name: " + name + " |";
	}

}
