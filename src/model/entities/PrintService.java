package model.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T>{
	
	private List<T> list = new ArrayList<>();
	
	public PrintService() {};
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public void printList() {
		System.out.println("Lista: " + list);
	}
}
