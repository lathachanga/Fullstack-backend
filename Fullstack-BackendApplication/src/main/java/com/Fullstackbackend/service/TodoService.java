package com.Fullstackbackend.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Fullstackbackend.model.Todo;
import com.Fullstackbackend.repository.TodoRepository;

@Service
public class TodoService {

	
	 @Autowired
	   TodoRepository repo;
	 
	 public Todo addTodo(Todo todo) {
		 return repo.save(todo);
	 }
	 
	 public List<Todo> FindAllTodo(){
		return repo.findAll();
		 
	 }
	 
	 public Todo getOne(String id) {
		return  repo.findById(id).get();
		 
	 }
	 
	 public Todo editTodo(Todo todo, String id) {
		Todo existingTodo= repo.findById(todo.getId()).get();
		existingTodo.setName(todo.getName());
		existingTodo.setDescription(todo.getDescription());
		existingTodo.setDate(new Date(System.currentTimeMillis()));
		existingTodo.setCompleted(todo.getCompleted());
		existingTodo.setAssignTo(todo.getAssignTo());
		
		return repo.save(existingTodo);
		 
	 }
	 
	 public String removeTodo(String id) {
		 repo.deleteById(id);
		return "deleted sucessfully  "+id;
		 
	 }
}


