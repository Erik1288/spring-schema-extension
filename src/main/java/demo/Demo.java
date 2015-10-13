package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tutorial.spring.schema.extension.Company;

public class Demo {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("demo/demo.xml");

        Company company = (Company) context.getBean("tudouluobo");

        String msg = String.format("%s,%s,%d", company.getId(), company.getName(), company.getAge());

        System.out.println(msg);
    }
}
