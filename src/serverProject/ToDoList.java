package serverProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ToDoList {
	
private final ArrayList<ToDoItem> toDoList = new ArrayList<>();
private String listTitle;

public ToDoList(String listTitle) {
	
	this.listTitle = listTitle;
}
	
		
	public String getListTitle() {
		return listTitle;
	}
	
	public void setListTitle(String listTitle) {
		this.listTitle = listTitle;
	}
	

	public void add(ToDoItem toDoItem) {
		synchronized (toDoList) {
			toDoList.add(toDoItem);
		}
	}
	
	public void remove(ToDoItem toDoItem) {
		synchronized (toDoList) {
			for (Iterator<ToDoItem> i = toDoList.iterator(); i.hasNext();) {
				if (toDoItem == i.next()) i.remove();
			}
		}
	
   }
	
	public void printList() {
		Iterator<ToDoItem> i = toDoList.iterator();
		while(i.hasNext()) {
			ToDoItem obj = i.next();
			System.out.println(obj);
	 }
		
	}
}


