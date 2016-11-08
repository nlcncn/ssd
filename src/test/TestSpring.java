package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.IndexBO;

public class TestSpring {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		IndexBO s = (IndexBO) ctx.getBean("indexBO");
		System.out.println(s.test());

	}
}
