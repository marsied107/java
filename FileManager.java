package edu.pitt.is17.mjd120.menumanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
	public static ArrayList<Side> readSide(String fileName){
		ArrayList<Side> list = new ArrayList<Side>();
		try{
			Scanner s = new Scanner(new File(fileName));
			while(s.hasNextLine()){
				String line = s.nextLine();
				String[] lineParts = line.split("@@");
				String name = lineParts[0];
				String desc = lineParts[1];
				int cal = Integer.parseInt(lineParts[2]);
				Side a = new Side(name,desc,cal);
				list.add(a);
			}
			s.close();
		}
		catch(FileNotFoundException fnfe){fnfe.printStackTrace();}
		return list;
	}
	public static ArrayList<Entree> readEntrees(String fileName){
		ArrayList<Entree> list = new ArrayList<Entree>();
		try{
			Scanner s = new Scanner(new File(fileName));
			while(s.hasNextLine()){
				String line = s.nextLine();
				String[] lineParts = line.split("@@");
				String name = lineParts[0];
				String desc = lineParts[1];
				int cal = Integer.parseInt(lineParts[2]);
				Entree e = new Entree(name,desc,cal);
				list.add(e);
			}
			s.close();
		}
		catch(FileNotFoundException fnfe){fnfe.printStackTrace();}
		return list;
	}
	public static ArrayList<Salad> readSalad(String fileName){
		ArrayList<Salad> list = new ArrayList<Salad>();
		try{
			Scanner s = new Scanner(new File(fileName));
			while(s.hasNextLine()){
				String line = s.nextLine();
				String[] lineParts = line.split("@@");
				String name = lineParts[0];
				String desc = lineParts[1];
				int cal = Integer.parseInt(lineParts[2]);
				Salad salad = new Salad(name,desc,cal);
				list.add(salad);
			}
			s.close();
		}
		catch(FileNotFoundException fnfe){fnfe.printStackTrace();}
		return list;
	}
	public static ArrayList<Dessert> readDessert(String fileName){
		ArrayList<Dessert> list = new ArrayList<Dessert>();
		try{
			Scanner s = new Scanner(new File(fileName));
			while(s.hasNextLine()){
				String line = s.nextLine();
				String[] lineParts = line.split("@@");
				String name = lineParts[0];
				String desc = lineParts[1];
				int cal = Integer.parseInt(lineParts[2]);
				Dessert b = new Dessert(name,desc,cal);
				list.add(b);
			}
			s.close();
		}
		catch(FileNotFoundException fnfe){fnfe.printStackTrace();}
		return list;
	}
}
