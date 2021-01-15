package serverProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ToDoItem {
	
	public enum Priority{LOW, HIGH, MEDIUM};

	private static int highestID = -1;

	private final int ID;
	private String toDoTitle;
	private Priority priority;
	private String description;
	
	
	private static int getNextID() {
		return ++highestID;
	}
	
	public ToDoItem (int ID, String toDoTitle, Priority priority, String description) {
		
		this.ID = getNextID();
		this.toDoTitle = toDoTitle;
		this.priority = priority;
		this.description = description;
	}

	
	// getters and setters
	
	public int getID() {
		return ID;
	}
	
	public void setToDoTitle(String toDoTitle) {
		this.toDoTitle = toDoTitle;
	}
	
	public String getToDoTitle() {
		return toDoTitle;
	}
	
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	
	public Priority getPriority() {
		return priority;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	
	@Override
	public String toString() {
		
		return "ID: " + ID + "\n" + "Title: " + toDoTitle + "\n"  + "Description: " + description + "\n"  + "Priority: " + priority + "\n";
	
		}

   }	
		
	



