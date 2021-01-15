package serverProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Logger;


public abstract class Message {
	
	private static Logger logger = Logger.getLogger("");
	protected MessageTypes type;
	
	private String message;
	
	public Message(MessageTypes type) {
		this.type = type;
	}
	
	public MessageTypes getType() {
		return type;
	}
	
	public void send(Socket socket) {
		
		OutputStreamWriter out;
		try {
			
			out = new OutputStreamWriter (socket.getOutputStream());
			logger.info("Sending message: " + this.toString());
			out.write(this.toString() + "\n");
			out.flush();
		} catch (Exception e) {
			logger.warning(e.toString());
		}
	}
		
public static Message receive(Socket socket) {
	BufferedReader in;
	Message msg = null;
	
	try {
		in = new BufferedReader (new InputStreamReader(socket.getInputStream()));
		String msgIn = in.readLine();
		logger.info("Receiving message: " + msgIn);
		
    	
		
		String[] parts = msgIn.split("\\|");
		
		if (parts[0].equals(MessageTypes.Ping.toString())) {
			msg = new MessagePing(parts[0]);
		} else if (parts[0].equals(MessageTypes.CreateLogin.toString())) {
			msg = new MessageCreateLogin(parts[1], parts[2]);
		
			
		}
		
} catch (Exception e) {
	logger.warning(e.toString());
}
	return msg;
	}

	
}
	
	
	




