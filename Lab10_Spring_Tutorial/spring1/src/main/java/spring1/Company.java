package spring1;

import java.util.Date;

public class Company {
	private String companyName;
	private Date creationDate;
	private int numberOfEmployees;
	
	
	public String getCompanyName() {
		return companyName;
	}
		public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public String toString() {
		return "Company [companyName=" + this.companyName + ", creationDate=" + this.creationDate + ", numberOfEmployees="
				+ this.numberOfEmployees + "]";
	}

}
