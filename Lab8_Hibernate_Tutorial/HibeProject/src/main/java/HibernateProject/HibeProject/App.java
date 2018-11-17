package HibernateProject.HibeProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App {
	
	protected static SessionFactory factory;
	
	public void setup() {
		factory = new Configuration()
				 .configure()
				 .addAnnotatedClass(Fee.class)
				 .buildSessionFactory();
	}
	
	public void create() {
		
		//Fee feeSlip = new Fee(1,"Maliha","Sameen","January","Rs.1245");
		Fee feeSlip = new Fee();
		feeSlip.setRegNo(1745);
		feeSlip.setFirstName("Maliha");
		feeSlip.setLastName("Sameen");
		feeSlip.setFeeMonth("January");
		feeSlip.setTotalFee("Rs.1245");
		
		
		System.out.println("Creating a Fee Slip!");
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();

		session.save(feeSlip);
		
		session.getTransaction().commit();
		session.close();
		System.out.println("Fee Slip Saved!");
	}
	
	public void display() {
		Session session = factory.openSession();
		int Id = 5;
		
		System.out.println("Display Fee Slip!");
		
		Fee feeSlip = session.get(Fee.class, Id);

		System.out.println("FeeSlip for RegNo=" + feeSlip.getRegNo() + " [FirstName = " + feeSlip.getFirstName() + ", LastName = "
				+ feeSlip.getLastName() + ", FeeMonth = " + feeSlip.getFeeMonth() + ", TotalFee = " + feeSlip.getTotalFee() + "]");

		session.close();
	}
	
	public void update() {
		Fee feeSlip = new Fee();
		feeSlip.setId(4);
		feeSlip.setRegNo(1745);
		feeSlip.setFirstName("Sana");
		feeSlip.setLastName("Naz");
		feeSlip.setFeeMonth("February");
		feeSlip.setTotalFee("Rs.1500");
		
		System.out.println("Updating Fee Slip for RegNo = " + feeSlip.getRegNo());
		Session session = factory.openSession();
		session.beginTransaction();

		session.update(feeSlip);

		session.getTransaction().commit();
		session.close();
		System.out.println("Fee Slip Updated!");
	}
	
	public void delete() {
		Fee feeSlip = new Fee();
		feeSlip.setId(6);
		
		System.out.println("Delete Fee Slip for Id = " + feeSlip.getId());
		Session session = factory.openSession();
		session.beginTransaction();

		session.delete(feeSlip);
		
		session.getTransaction().commit();
		session.close(); 
		System.out.println("Fee Slip Deleted!");
	}
	
	public void exit() {
		factory.close();
	}
    public static void main( String[] args ) {
    	App feeManager = new App();
		feeManager.setup();
		
		feeManager.create();
		feeManager.display();
		feeManager.update();
		feeManager.delete();
		
		feeManager.exit();
    }
}
