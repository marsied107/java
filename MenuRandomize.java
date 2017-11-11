package edu.pitt.is17.mjd120.menumanager;

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	//creates the array lists
	private ArrayList<Side> sides;
	private ArrayList<Entree> entrees;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;
	
	public MenuRandomize(String appetizerFile, String entreeFile, String sideFile, String beerFile){
		this.sides = FileManager.readSide(appetizerFile);
		this.entrees = FileManager.readEntrees(entreeFile);
		this.salads = FileManager.readSalad(sideFile);
		this.desserts = FileManager.readDessert(beerFile);
	}
	
	public Menu randomMenu(){
		Random rand = new Random();
		int min = 0;
		
		int max = sides.size();
		int sideIndex = rand.nextInt((max - min)) + min;
		
		max = entrees.size();
		int entreeIndex = rand.nextInt((max - min)) + min;
		
		max = salads.size();
		int saladIndex = rand.nextInt((max - min)) + min;
		
		max = desserts.size();
		int dessertIndex = rand.nextInt((max - min)) + min;
		
		Menu randomMenu = new Menu("My Random Menu",
				sides.get(sideIndex),entrees.get(entreeIndex),
				salads.get(saladIndex),desserts.get(dessertIndex));
		
		return randomMenu;
	}
}
	