package serverProject;

public class MessageCreateLogin extends Message {
	
	private String userName;
	private String password;
	
	public MessageCreateLogin(String userName, String password) {
		super(MessageTypes.CreateLogin);
		this.userName = userName;
		this.password = password;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
		
	}

	public String toString() {
		return type.toString() + '|' + userName + '|' + password;
	}

@Override
	public boolean process() {
			boolean result = false;
			if (userName != null && password != null) {
				
			UserAccount newUserAccount = new UserAccount(userName, password, null);
			UserAccount.add(newUserAccount);
			result = true;
			}
				return result;
	}			
}


		
