package com.raj.Todo;

import java.util.List;

import org.assertj.core.util.Arrays;

public class TodoServiceStub implements TodoService {

	@Override
	public List<Object> retrivetools(String user) {
		return Arrays.asList("learn Sprign mvc");
		
	}

}
