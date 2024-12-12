package model.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
	private List<Integer> list = new ArrayList<>();
	
	public PrintService() {};
	
	public void addValue(int value) {
		list.add(value);
	}
	
	public void printList() {
		System.out.println("Lista: " + list);
	}
}
