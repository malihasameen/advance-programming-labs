package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Company company = (Company) context.getBean("cmp1");
		System.out.println(company.toString());
		
		Employee emp = (Employee) context.getBean("emp1");
		
		System.out.println(emp.toString());
	}

}
