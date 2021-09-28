import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable
{
	private static final long serialVersionUID = 5864223609725403012L;
	private Integer productId;
	private String productName;
	private Double productPrice;
	

}
