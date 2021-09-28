import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class ProductTest {
	public static Session getSession()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		return factory.openSession();
	}

	public static void main(String[] args) {
		Session session = getSession();
		
		Product product=new Product();
		product.setProductId(101);
		product.setProductPrice(150000D);
		
		Product result = (Product)session.get(Product.class, product);

		System.out.println(result);
		
		session.close();

	}

}
