package com.raj.Todo;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl implements TodoService{
private TodoService todoservice;

	@Override
	public List<String> retrivetools(String user) {
		List<String> filteredtodo=new ArrayList<>();
		List<Object> alltodos= todoservice.retrivetools(user);
		for(Object todo:alltodos) {
			if(((List<String>) todo).contains("Spring"))
			filteredtodo.add(user);
		}
		return filteredtodo;
	}

	public TodoServiceImpl(TodoService todoserive) {
		this.todoservice=todoserive;
		}
	

}
