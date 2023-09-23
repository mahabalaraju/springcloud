package com.raj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.raj.Todo.TodoService;
import com.raj.Todo.TodoServiceImpl;
import com.raj.Todo.TodoServiceStub;

@SpringBootTest
class ZspringEvent3ApplicationTests {

	@Test
	public void usingAStub() {
		TodoService todo = new  TodoServiceStub();
		TodoServiceImpl todod=new TodoServiceImpl(todo);	
		List<String> todos=todod.retrivetools("ranga");
		assertEquals(2, todos.size());
			
		
	}

}
