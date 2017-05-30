import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import rs.bg.spring.service.CustomerService;
import rs.bg.spring.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service=context.getBean("customerService",CustomerService.class);
		
		System.out.println(service.findAll().get(0).getName());

	}

}
