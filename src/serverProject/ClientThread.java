package serverProject;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;

public class ClientThread extends Thread {
	
	private final Logger logger = Logger.getLogger("");
	private Socket clientSocket;
	
	public ClientThread (Socket clientSocket) {
		this.clientSocket = clientSocket;
	}
	
@Override
public void run() {
	logger.info("Request from client " + clientSocket.getInetAddress().toString() + " for server: " + clientSocket.getLocalAddress().toString());
	
	while (true)
	try {
	Message msgIn = Message.receive(clientSocket);
	Message msgOut = processMessage(msgIn);
	msgOut.send(clientSocket);
	logger.info("Answered with: " + msgOut.toString());
	} catch (Exception e) {
        logger.severe(e.toString());
    } finally {
    }
 }

private Message processMessage(Message msgIn) {
	
	Message msgOut = null;	
	switch (MessageTypes.getType(msgIn)) {
	case Ping:
		msgOut = new MessageResult(true);
		break;
	case CreateLogin:
		if(msgIn.process() == true)
		msgOut = new MessageResult(true);
		if(msgIn.process() == false)
		msgOut = new MessageResult(false);
	case Error:
		msgOut = new MessageResult(false);
	    break;
	default:
		msgOut = new MessageResult(false);
		
	}
	return msgOut;
   }
}
