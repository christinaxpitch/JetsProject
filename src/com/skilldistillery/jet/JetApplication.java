package com.skilldistillery.jet;

import java.util.Scanner;

public class JetApplication {

	
	private Airfield airfield = new Airfield();
	private Scanner scanner = new Scanner(System.in);
	
//	user story #1: main method to launch 
	public static void main(String[] args) {
		JetApplication ja = new JetApplication();
		ja.launch();
	}

	public void launch() {
		airfield.jetFileList();
		displayMenu(scanner);
	}
//	user story #4: user menu
	public void displayMenu(Scanner scanner) {
		boolean keepGoing = true;
		System.out.println(" \u2708 Welcome to Christina's Air Fleet! \u2708");
		while (keepGoing){
			System.out.println("  ==========================");
			System.out.println("1. List all jets in the fleet");
			System.out.println("2. Fly the fleet ");
			System.out.println("3. View the fastest jet");
			System.out.println("4. View the jet with the longest range ");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Fight!");
			System.out.println("7. Add a jet to the fleet ");
			System.out.println("8. Remove a jet from the fleet");
			System.out.println("9. Quit");
			System.out.println("\u2708\t\u2708\t\u2708\t\u2708\t\u2708\t\u2708\t");
			System.out.println("  ==========================");
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("This is the current fleet:");
				airfield.listFleet();
				break;
			case 2:
				airfield.flyFleet();
				break;
			case 3:
				airfield.maxSpeedJet();
				break;
			case 4:
				airfield.maxRangeJet();
				break;
			case 5:
				airfield.loadCargo();
				break;
			case 6:
				airfield.fighterJetsFight();
				break;
			case 7:
				airfield.add(scanner);
				break;
			case 8:
				airfield.remove();
				break;
			case 9:
				System.out.println("You have decided to quit. Goodbye!");
				keepGoing=false;
				break;
			default:
				System.out.println("Invalid menu option.");
			}
			
			
			
			
		}
		


	}
}
