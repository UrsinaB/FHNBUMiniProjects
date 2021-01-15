package serverProject;

import java.util.ArrayList;
import java.util.Iterator;

import serverProject.ToDoItem.Priority;

public class TestToDoList {
	
	public static void main(String[] args) {
		
		final ArrayList<ToDoItem> toDoList = new ArrayList<>();
		
		
		ToDoItem myFirstItem = new ToDoItem(0, null, null, null);
		myFirstItem.setToDoTitle("sleeping");
		myFirstItem.setDescription("Sleep more. You need it");
		myFirstItem.setPriority(Priority.HIGH);
		
		toDoList.add(myFirstItem);
		
		ToDoItem mySecondItem = new ToDoItem(0, null, null, null);
		mySecondItem.setToDoTitle ("eating");
		mySecondItem.setDescription("eat more");
		mySecondItem.setPriority(Priority.MEDIUM);
		
		toDoList.add(mySecondItem);
	

		Iterator<ToDoItem> i = toDoList.iterator();
		while(i.hasNext()) {
			ToDoItem obj = i.next();
			System.out.println(obj);
	 }
   }	
}

