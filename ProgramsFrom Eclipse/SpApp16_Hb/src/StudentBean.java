import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
public class StudentBean
{
	private HibernateTemplate ht;
	public void setHt(HibernateTemplate ht)
	{
		this.ht=ht;
	}
	//business method1
	public void saveStudent(Student s)
	{
		ht.save(s);//insert
	}
	//business method2
	public void loadStudents()
	{
		List l=ht.loadAll(Student.class);//select
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			Student s=(Student)it.next();
			System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getMarks());
			System.out.println("==============");
		}
	}
	
}