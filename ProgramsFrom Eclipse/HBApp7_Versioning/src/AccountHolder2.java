import java.sql.Timestamp;

public class AccountHolder2
{
	private Integer accountNumber;
	private String accountHolderName;
	private Double amountInAccount;
	private String city;
	private Long phoneNumber;
	//Version Variable 
	private Timestamp ts;

	public AccountHolder2() {
	}
	public AccountHolder2(Integer accountNumber, String accountHolderName, Double amountInAccount, String city,
			Long phoneNumber) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.amountInAccount = amountInAccount;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public Double getAmountInAccount() {
		return amountInAccount;
	}
	public void setAmountInAccount(Double amountInAccount) {
		this.amountInAccount = amountInAccount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}

}