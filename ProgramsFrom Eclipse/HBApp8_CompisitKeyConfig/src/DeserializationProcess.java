import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationProcess {

	public static void main(String[] args) throws Exception {
		
		Product product=null;

		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("prod1.txt"));
		
		product=(Product)ois.readObject();
		
		ois.close();
		System.out.println(product);
	}

}
