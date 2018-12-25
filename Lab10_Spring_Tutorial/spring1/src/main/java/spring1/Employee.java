package spring1;

import java.util.List;

public class Employee {
	private List employeeName;

	public List getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(List employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + this.employeeName + "]";
	}

}
