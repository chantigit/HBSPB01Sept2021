
public class Customer 
{
	private Integer customerId;
	private String password;
	private String customerName;
	private Integer itemsInCart;
	private Long phoneNumber;
	
	public Customer() {
	}

	public Customer(Integer customerId, String password, String customerName, Integer itemsInCart, Long phoneNumber) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.customerName = customerName;
		this.itemsInCart = itemsInCart;
		this.phoneNumber = phoneNumber;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getItemsInCart() {
		return itemsInCart;
	}

	public void setItemsInCart(Integer itemsInCart) {
		this.itemsInCart = itemsInCart;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", password=" + password + ", customerName=" + customerName
				+ ", itemsInCart=" + itemsInCart + ", phoneNumber=" + phoneNumber + "]";
	}

	

}
