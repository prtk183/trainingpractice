package springpractice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployeeSpring {
	
	public static void main(String[] args) {
	
		
	ApplicationContext acx = new ClassPathXmlApplicationContext("EmployeeSpringConfig.xml");
	
	Employee eone = (Employee) acx.getBean("helloEmployee");
	
	eone.show();
	
	
	}

	/*
	 *    <dependency>
    	<groupId>org.springframework</groupId>
    	<artifactId>spring-context</artifactId>
    	<version>5.0.5.RELEASE</version>
	</dependency>
	 * 
	 */
}
