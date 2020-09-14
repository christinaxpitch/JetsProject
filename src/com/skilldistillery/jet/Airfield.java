package com.skilldistillery.jet;

import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Airfield {

	private List<Jet> jetArray;
	
	public Airfield() {
		jetArray = new ArrayList<>();
	}
	
	public void listFleet() {
		int counter = 1;
		for (int i = 0; i < jetArray.size(); i++) {
			System.out.println(counter + " : " + jetArray.get(i));
			counter++;
		}
	}
	
	public void flyFleet() {
		for (Jet jet : jetArray) {
			jet.fly();
		}
		
	}
	
	public void maxSpeedJet() {
		double max = 0;
		String fastest = null;
		for (Jet jet : jetArray) {
			if (jet.getSpeed() > max) {
				max = jet.getSpeed();
				fastest = jet.toString();
			}
		} System.out.println("The fastest jet is: " + fastest);
		
	}
	
	public void maxRangeJet() {
		int max = 0;
		String longest = null;
		for (Jet jet : jetArray) {
			if (jet.getRange() > max) {
				max = jet.getRange();
				longest = jet.toString();
			}
		}System.out.println("The jet with the longest range is: " + longest);
	}
	
	public void loadCargo(){
		for (int i = 0; i < jetArray.size(); i++) {
			Jet current = jetArray.get(i);
			if (current instanceof CargoJet) {
				((CargoJet) current).loadCargo();
			}
			
			
		}
		
	}
	
	public void fighterJetsFight() {
		for (int i = 0; i < jetArray.size(); i++) {
			Jet current = jetArray.get(i);
			if (current instanceof FighterJet) {
				((FighterJet) current).fight();
			}
		}
	}

	public List<Jet> jetFileList() {
		try ( BufferedReader br= new BufferedReader(new FileReader("JetList"))) {
				String line;
				while ((line = br.readLine()) != null) {
					String[] fields = line.split(", ");
					Jet plane = null;
					switch (fields[4]) {
					case "cargo":
						plane = new CargoJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
						jetArray.add(plane);
						break;
					case "fighter":
						plane = new FighterJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
						jetArray.add(plane);
						 break;
					case "commercial":
						plane = new CommercialJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
						jetArray.add(plane);
						break;
					
					}
						
		}br.close(); }
			catch (IOException e) {
		  System.err.println(e.getMessage());
			}
		return jetArray;
	}
	
//	public void jetFileList() {
//	try ( BufferedReader br= new BufferedReader(new FileReader("JetList"))) {
//			String line;
//			while ((line = br.readLine()) != null) {
//				String[] fields = line.split(", ");
//				Jet plane = null;
//				if(fields[4].contains("cargo")) {
//					plane = new CargoJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
//					jetArray.add(plane);
//				}
//				if(line.contains("Fighter") || line.contains("FIGHTER") || line.contains("fighter")) {
//					plane = new FighterJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
//					jetArray.add(plane);
//				 }
//				if (line.contains("Commercial") || line.contains("COMMERCIAL") || line.contains("commercial"))
//					plane = new CommercialJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]), Long.parseLong(fields[3]));
//					jetArray.add(plane);
//			}
//				
//	br.close(); }
//		catch (IOException e) {
//	  System.err.println(e.getMessage());
//		}
//	}

		public void add(Scanner scanner) {
			boolean keepGoing = true;
			while (keepGoing) {
			System.out.println("\u2708\t\u2708\t\u2708\t\u2708\t\u2708\t\u2708\t");
			System.out.println("Which type of Jet would you like to add?");
			System.out.println("1. Cargo Jet");
			System.out.println("2. Fighter Jet");
			System.out.println("3. Commercial Jet");
			System.out.println("4. Main Menu");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("NEW CARGO JET:");
				System.out.println("Enter the Jet model: ");
				String model = scanner.next();
				System.out.println("Enter the jet speed (in mph):");
				double speed = scanner.nextDouble();
				System.out.println("Enter the jet range (in miles): ");
				int range = scanner.nextInt();
				System.out.println("Enter the price of the jet: ");
				long price = scanner.nextLong();
				Jet newCargo = new CargoJet(model, speed, range, price);
				jetArray.add(newCargo);
				System.out.println(newCargo.getModel() + " has been added to the fleet!");
				break;
			case 2:
				System.out.println("NEW FIGHTER JET:");
				System.out.println("Enter the Jet model: ");
				model = scanner.next();
				System.out.println("Enter the jet speed (in mph):");
				speed = scanner.nextDouble();
				System.out.println("Enter the jet range (in miles): ");
				range = scanner.nextInt();
				System.out.println("Enter the price of the jet: ");
				price = scanner.nextLong();
				Jet newFighter = new FighterJet(model, speed, range, price);
				jetArray.add(newFighter);
				System.out.println(newFighter.getModel() + " has been added to the fleet!");
				break;	
			case 3:
				System.out.println("NEW COMMERCIAL JET:");
				System.out.println("Enter the Jet model: ");
				model = scanner.next();
				System.out.println("Enter the jet speed (in mph):");
				speed = scanner.nextDouble();
				System.out.println("Enter the jet range (in miles): ");
				range = scanner.nextInt();
				System.out.println("Enter the price of the jet: ");
				price = scanner.nextLong();
				Jet newCommercial = new FighterJet(model, speed, range, price);
				jetArray.add(newCommercial);
				System.out.println(newCommercial.getModel() + " has been added to the fleet!");
				break;	
			case 4: 
			default:
					keepGoing=false;
					break;
			}
			}
			
		}
		
		public void remove () {
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("This is the current fleet: ");
			listFleet();
			System.out.println("Please enter the number of the Jet you want to remove: ");
			int choice = scanner2.nextInt();
			jetArray.remove(choice);
			System.out.println(jetArray.get(choice-1).getModel() + " has been removed! The fleet is now " + jetArray.size() + " jets.");
		}
	
}


