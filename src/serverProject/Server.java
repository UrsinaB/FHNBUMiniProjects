package serverProject;



import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;


public class Server {
	
	public static void main(String[] args) throws Exception {
		 
		Logger logger = Logger.getLogger("");
		
				try (ServerSocket listener = new ServerSocket(5002, 10, null)) {
					logger.info("Listening on port " + 5002);

					while (true) {
						Socket socket = listener.accept();
						ClientThread client = new ClientThread(socket);
						client.start();
					}
				} catch (Exception e) {
					System.err.println(e);
				}
			}
	  }

		
	  
	
	
	

		
		
		
		
  

	

		

	

		
	
		
		
