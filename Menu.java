package edu.pitt.is17.mjd120.menumanager;
/** Class: Menu
 * 	Author: INFSCI 0017
 *	Created: November 10, 2017
 */

public class Menu {
	// variables creating a new menu name, entree, salad, side, and dessert for this menu
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;

	public Menu(String name, Side side, Entree entree, Salad salad, Dessert dessert) {
		// constructor given only the menu name
		this.name = name;
		entree = null;
		salad = null;
		side = null;
		dessert = null;
	}

	public Menu(String name, Entree entree, Side side) {
		// constructor given menu name, entree, side
		this.name = name;
		this.entree = entree;
		this.side = side;
		salad = null;
		dessert = null;
	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		// constructor given information for complete menu
		this.name = name;
		this.entree = entree;
		this.side = side;
		this.salad = salad;
		this.dessert = dessert;
	}

	public Menu(Entree randEntree, Dessert randDess, Side randSide, Salad randSalad) {
		// TODO Auto-generated constructor stub
	}

	public int totalCalories(){
		// this method sums the total calories for each existing item on the menu
		int sumCals = 0;

		if (entree != null) {
			sumCals += entree.getCalories();
		}
		if (side != null) {
			sumCals += side.getCalories();
		}
		if (salad != null) {
			sumCals += salad.getCalories();
		}
		if (dessert != null) {
			sumCals += dessert.getCalories();
		}

		return sumCals;
	}

	public String description() {
		// this method compiles a complete description of the existing menu items including the names and descriptions
		String menuDescription = "";

		if (entree != null) {
			menuDescription = menuDescription + "Entree: " + entree.getDescription();
		} else {
			menuDescription = menuDescription + "Entree: N/A";
		}

		if (side != null) {
			menuDescription = menuDescription + "\nSide: " + side.getDescription();
		} else {
			menuDescription = menuDescription + "\nSide: N/A";
		}

		if (salad != null) {
			menuDescription = menuDescription + "\nSalad: " + salad.getDescription();
		} else {
			menuDescription = menuDescription + "\nSalad: N/A";
		}

		if (dessert != null) {
			menuDescription = menuDescription + "\nDessert: " + dessert.getDescription();
		} else {
			menuDescription = menuDescription + "\nDessert: N/A";
		}

		return menuDescription;
	}


	// the following are getters and setters for the variables defined above
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entree getEntree() {
		return entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Salad getSalad() {
		return salad;
	}

	public void setSalad(Salad salad) {
		this.salad = salad;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Dessert getDessert() {
		return dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}
}


