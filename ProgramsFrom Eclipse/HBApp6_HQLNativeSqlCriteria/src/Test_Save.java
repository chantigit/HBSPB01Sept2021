import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test_Save {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer customer1=new Customer(101,"pass1","Ajay1",10,9849098491L);
		Customer customer2=new Customer(102,"pass1","Ajay2",11,9849098492L);
		Customer customer3=new Customer(103,"pass1","Ajay3",12,9849098493L);
		Customer customer4=new Customer(104,"pass1","Ajay4",13,9849098494L);
		Customer customer5=new Customer(105,"pass1","Ajay5",14,9849098495L);
		Customer customer6=new Customer(106,"pass1","Ajay6",15,9849098496L);
		Customer customer7=new Customer(107,"pass1","Ajay7",16,9849098497L);
		Customer customer8=new Customer(108,"pass1","Ajay8",17,9849098498L);
		Customer customer9=new Customer(109,"pass1","Ajay9",18,9849098499L);
		Customer customer10=new Customer(110,"pass1","Ajay10",19,9849098490L);

		session.save(customer1);
		session.save(customer2);
		session.save(customer3);
		session.save(customer4);
		session.save(customer5);
		session.save(customer6);
		session.save(customer7);
		session.save(customer8);
		session.save(customer9);
		session.save(customer10);
		
		System.out.println("Object saved into DB successfully");
		tx.commit();
		session.close();
		factory.close();

	}

}
