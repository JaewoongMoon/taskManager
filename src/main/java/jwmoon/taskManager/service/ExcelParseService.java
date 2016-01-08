package jwmoon.taskManager.service;

import java.util.ArrayList;
import java.util.List;

import jwmoon.taskManager.domain.Task;

public class ExcelParseService implements ParseService {
	
	public List<Task> getList() {
		
		return new ArrayList<Task>(); 
	}
	
	public static void main(String[] args) {
		System.out.println("TEST.,..");
	}

}
