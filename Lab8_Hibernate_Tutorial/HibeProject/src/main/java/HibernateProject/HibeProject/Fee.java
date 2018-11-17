package HibernateProject.HibeProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feeslip")
public class Fee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;
	@Column(name = "regno")
	private int RegNo;
	@Column(name = "firstname")
	private String FirstName;
	@Column(name = "lastname")
	private String LastName;
	@Column(name = "fee_month")
	private String FeeMonth;
	@Column(name = "total_fee")
	private String TotalFee;
	
	public Fee() {}
	
	public Fee(int regNo, String firstName, String lastName, String feeMonth, String totalFee) {
		super();
		RegNo = regNo;
		FirstName = firstName;
		LastName = lastName;
		FeeMonth = feeMonth;
		TotalFee = totalFee;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getRegNo() {
		return RegNo;
	}
	public void setRegNo(int regNo) {
		RegNo = regNo;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFeeMonth() {
		return FeeMonth;
	}
	public void setFeeMonth(String feeMonth) {
		FeeMonth = feeMonth;
	}
	public String getTotalFee() {
		return TotalFee;
	}
	public void setTotalFee(String totalFee) {
		TotalFee = totalFee;
	}
}
