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
	    	
	    	MessageTypes type = MessageTypes.Error;
	    	
	    	for (MessageTypes value : MessageTypes.values()) {
	    		if (value.toString().equals(typeName)) type = value;
	    	}
	    	return type;
	    }
		
	   
	    public static MessageTypes getType(Message msg) {
	    	
	    	MessageTypes type = MessageTypes.Error;
	    	
	    	if (msg instanceof MessagePing) type = Ping;
	
	    	else if (msg instanceof MessageResult) type = Result;
	    	return type;
	    }	
		
	}

