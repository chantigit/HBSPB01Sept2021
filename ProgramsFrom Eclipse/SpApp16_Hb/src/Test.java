import org.springframework.context.*;
import org.springframework.context.support.*;
public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spconfig.xml");
		Object o=context.getBean("id4");
		StudentBean ob=(StudentBean)o;
		
		/*
		Student s=new Student();
		s.setStudentId(302);
		s.setStudentName("Ajay");
		s.setMarks(400);
		
		
		ob.saveStudent(s);
		*/
		ob.loadStudents();
	}
}
