package edu.pitt.is17.mjd120.menumanager;
	/**
	 * Class Salad
	 * author : Marielle Davis
	 * created: 02/18/2017
	 */

public class Salad {
	//variables for item name, description, and calorie count
	public String name;
	public String description;
	public int calories;
	
	public Salad(String name, String description, int calories) {
		//constructor for item given name, description, and calorie count
		this.name = name;
		this.description = description;
		this.calories = calories;
	}
	//the following methods are the getters and setters for the variables 
	//defined above
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
	
	public int getCalories() {
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
}
