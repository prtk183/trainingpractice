package springpractice1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class TestEmployeeSpring {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource r = new ClassPathResource("SpringConfig.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		
		Employee s = (Employee) factory.getBean("thisid");
		
		s.show();
	}

}
