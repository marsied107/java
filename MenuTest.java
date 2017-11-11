package edu.pitt.is17.mjd120.menumanager;

import java.io.FileNotFoundException;

public class MenuTest {

	public static void main(String[] args) throws FileNotFoundException {
		MenuRandomize randomize = new MenuRandomize("data/entree.txt",
				"data/side.txt","data/salad.txt","data/dessert.txt");
			Menu myMenu = randomize.randomMenu();
			System.out.println(myMenu.description()+"\nTotal calories"+
								myMenu.totalCalories());
		}


}

