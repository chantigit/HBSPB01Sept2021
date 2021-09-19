package com.chanti.model;

public class Customer 
{
	private String name;
	private String mailId;
	private String password;
	private String rePassword;
	//NPC,PC,S+G,toS,HC,EQ
	public Customer() {
	}
	public Customer(String name, String mailId, String password, String rePassword) {
		super();
		this.name = name;
		this.mailId = mailId;
		this.password = password;
		this.rePassword = rePassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRePassword() {
		return rePassword;
	}
	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mailId=" + mailId + ", password=" + password + ", rePassword=" + rePassword
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mailId == null) ? 0 : mailId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((rePassword == null) ? 0 : rePassword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (mailId == null) {
			if (other.mailId != null)
				return false;
		} else if (!mailId.equals(other.mailId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (rePassword == null) {
			if (other.rePassword != null)
				return false;
		} else if (!rePassword.equals(other.rePassword))
			return false;
		return true;
	}
	
}
