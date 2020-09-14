## Jets Project
### Overview
This week three project brings everything we have learned so far together in a working simulation of an airfield. The objective of this program is to create a fleet of jets from a text file, and to organize the jets based on their type and capabilities while creating a menu for the user to see data on the fleet. Jet is an abstract class, so we can extend upon it for different types of jets.

#### Lessons Used
*Array lists
*Static/non static methods
*Objects
*Pass by value
*Interfaces
*Abstract classes
*Implements
*Extends
*Constructors
*Getters/Setters
*Exceptions
*File Reader/Buffered Reader

####How to Run - Instructions  
1. The user is greeted by the program's welcome message and the main menu of options
2. The user can pick options by inputting their menu choice, which includes listing all jets in the fleet, seeing the fastest jet, adding a jet, etc.
3. If the user wishes to add a jet, they will be prompted by a sub menu on which type of jet they would like to add (cargo, commercial, or fighter). From here, they are asked for user input for the jet and after all is taken in, the new jet is added to the array list.
4. The main menu is in a switch statement inside of a while loop, so the menu will keep prompting the user for another option until the user decides to quit the program.

#### The Method to the Madness
1. I set up the Jet abstract class with four fields for a jet (model, speed, range, price). The getters & setters, and to string method was also in this class. The purpose of this class is so that other types of jets ca extend this class, and take in the information from this parent "Jet" class.
2. I created three other types of jet classes which extended Jet.
3. A text file was created and I inputted the information for five jets. In the Airfield class, I created a filereader so that the information can be put into the array list from the file.
4. The static main method in the JetApplication calls upon the launch method, which runs the program.
5. In the launch method, I first created the welcome message to the user with the main menu. The user input for menu choice is taken in by a scanner and the switch statement allows the method the user picked to be executed.
6. The methods for getting the jet with the maximum speed and the jet with the longest range is in Airfield, along with other methods to give the user data on the fleet. For each of these methods, I used for loops.
7. The user is able to add and remove jets to the fleet, and see the changing array size once altered. 

ENJOY!
