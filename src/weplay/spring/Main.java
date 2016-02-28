package weplay.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ApplicationContext factory = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		
		HelloWorld hw = (HelloWorld) ac.getBean("helloWorld");
		
		hw.hello();
	}
	
	public static String testString(){
		return "weplay";
	}
}
