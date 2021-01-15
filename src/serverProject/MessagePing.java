package serverProject;


public class MessagePing extends Message{
	
	private String userName;

	
	public MessagePing(String userName) {
		super(MessageTypes.Ping);
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	@Override
	public String toString() {
		return type.toString() +  '|' + userName;
	}	
}

