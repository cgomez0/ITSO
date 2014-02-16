package com.itso.example;

public class UserManagedBean {
	private String name;
	private String location;
	
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		this.location = location;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String clear(){
		setName(null);
		setLocation(null);
		return "clear";
	}
	public String submit(){
		return "submit";
	}
}
