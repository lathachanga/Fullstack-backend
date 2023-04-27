package com.Fullstackbackend.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Fullstackbackend.model.Todo;
import com.Fullstackbackend.service.TodoService;

@RestController
public class TodoController {
     
	 @Autowired
	 TodoService todoservice;
	//
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Todo createTodo(@RequestBody Todo todo) {
		todo.setDate(new Date(System.currentTimeMillis()));
		 return todoservice.addTodo(todo);
		
		
	}
	
	// localhost:8080/todos
	@GetMapping("/todos")
	public List<Todo>  getTodos(){
		return todoservice.FindAllTodo();
		
	}
	@GetMapping("/todo/{id}")
	public Todo getTodo(@PathVariable String id) {
		return todoservice.getOne(id);
		
	}
	
	@PutMapping("/add/{id}")
	public Todo updateTodo(@RequestBody Todo todo,@PathVariable String id ) {
		return todoservice.editTodo(todo,id) ;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletetask(@PathVariable String id) {
		return todoservice.removeTodo(id) ;
		
	}
}
