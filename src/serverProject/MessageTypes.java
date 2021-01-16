package serverProject;

public enum MessageTypes {

	    CreateLogin, 
	    Login, 
	    Logout, 
	    ChangePassword, 
	    CreateToDo, 
	    DeleteToDo, 
	    GetToDo, 
	    ListToDos, 
	    Result, 
	    Error,
		Ping;
		
	    public static MessageTypes parseType(String typeName) {
	    	
	    	MessageTypes type = null;
	    	
	    	for (MessageTypes value : MessageTypes.values()) {
	    		if (value.toString().equals(typeName)) type = value;
	    	}
	    	return type;
	    }
		
	   
	    public static MessageTypes getType(Message msg) {
	    	
	    	MessageTypes type = null;
	    	if (msg instanceof MessagePing) type = Ping;
	
	    	else if (msg instanceof MessageCreateLogin) type = CreateLogin;
	    	else if (msg instanceof MessageError) type = Error;
	    	return type;
	    }	
		
	}

