package serverProject;

import java.util.ArrayList;
import java.util.Iterator;

public class UserAccount {
	
	private static final ArrayList<UserAccount> accounts = new ArrayList<>();
	
	private String userName;
	private String password;
	private ToDoList toDoList;
	
	public  UserAccount(String userName, String password, ToDoList toDoList) {
		
		this.userName = userName;
		this.password = password;
		this.toDoList = toDoList;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public ToDoList getToDoList() {
		return toDoList;
	}
	
	public void setToDoList(ToDoList toDoList) {
		this.toDoList = toDoList;
	}
	
	public static void add(UserAccount useraccount) {
		synchronized (accounts) {
			accounts.add(useraccount);
		}
	}
	
	public static void remove(UserAccount useraccount) {
		synchronized (accounts) {
			for (Iterator<UserAccount> i = accounts.iterator(); i.hasNext();) {
				if (useraccount == i.next()) i.remove();
			}
		}
	}
	
	public UserAccount getExistingAccount(String userName) {
			for (UserAccount useraccount : accounts) {
				if (useraccount.userName.equals(userName)) {	
					return useraccount;
			}
		}
			return null;
	}
	
	
	
}





