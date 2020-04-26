package model;

public class LoginCls implements java.io.Serializable{
	private String emailid;
	private String password;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validate()
	{
		if(password.equals("admin"))
		{
			return true;
		}
		else{
			return false;
		}
	}

}
