import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationProcess {

	public static void main(String[] args) throws Exception {
		
		Product product=new Product(501,"Laptop",35000D);

		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("prod1.txt"));
		oos.writeObject(product);
		
		oos.close();
	}

}
