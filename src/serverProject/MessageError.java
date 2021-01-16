package serverProject;

public class MessageError extends Message {

	public MessageError() {
		super(MessageTypes.Error);
	}

	@Override
	public boolean process() {
		boolean result = true;
		return result;
	}

}
