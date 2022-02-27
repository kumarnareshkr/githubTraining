package collections;

public class Employee {
private String name;
private int id;
private String department;
private float salary;
public Employee(String name, int id, String department, float salary) {
	super();
	this.name = name;
	this.id = id;
	this.department = department;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary + "]";
}

}
