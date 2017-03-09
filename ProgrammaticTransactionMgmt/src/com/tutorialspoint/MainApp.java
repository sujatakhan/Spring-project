package com.tutorialspoint;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

		
		System.out.println("------Records creation--------" );
		studentJDBCTemplate.create("Zara", 11, 99, 2016);
		studentJDBCTemplate.create("Shreyansh", 17, 75, 2016);
		studentJDBCTemplate.create("Sujata", 33, 88, 2015);
		
		 System.out.println("------Listing all the records--------" );
		 List<StudentMarks> studentMarks=studentJDBCTemplate.listStudents();
		 for(StudentMarks marks: studentMarks){
			 System.out.print("ID : " + marks.getId() );
	         System.out.print(", Name : " + marks.getName() );
	         System.out.print(", Marks : " + marks.getMarks());
	         System.out.print(", Year : " + marks.getYear());
	         System.out.println(", Age : " + marks.getAge());
		 }
	}

}
