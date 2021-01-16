package serverProject;


public class MessageResult extends Message{
	
private Boolean result = false;

public MessageResult(Boolean result) {
	super(MessageTypes.Result);
	this.result = result;
	}
	
	public boolean getResult() {
		return result;
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return type.toString() +  '|' + result;
	}

	@Override
	public boolean process() {
		boolean result = true;
		return result;
		
	}
	
}
