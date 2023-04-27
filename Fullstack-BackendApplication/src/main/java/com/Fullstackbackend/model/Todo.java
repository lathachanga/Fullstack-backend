package com.Fullstackbackend.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="Todos")
public class Todo {
      @Id
	 private String id;
	 private String name;
	 private String description;
	 private Date date;
	 private Boolean completed;
	 private String assignTo;
	 
	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", description=" + description + ", date=" + date + ", completed="
				+ completed + ", assignTo=" + assignTo + "]";
	}
	public Todo() {
		super();
	}
	public Todo(String id, String name, String description, Date date, Boolean completed, String assignTo) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.date = date;
		this.completed = completed;
		this.assignTo = assignTo;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getAssignTo() {
		return assignTo;
	}
	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}
	
	 
}
