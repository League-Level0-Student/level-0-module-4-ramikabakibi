package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel=0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String answer= JOptionPane.showInputDialog("What kind of pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for(int i=0;i<1000;i++) {
int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "water", "talk a walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if( task==0) {
food();	
}
	if(task==1) {
		water();
	}
	if(task==2) {
		walk();
	}
	if(happinessLevel>10) {
		JOptionPane.showMessageDialog(null, "You love  your pet!");
		break;
	}
			}
		// 6. If you determine the happiness level is large enough, tell the

			//    user that he loves his pet and use break; to exit for loop.

	}

	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void food() {
		JOptionPane.showMessageDialog(null, "Your pet is now full!");
		happinessLevel+=2;
		System.out.println(happinessLevel);
	}
	static void water() {
		JOptionPane.showMessageDialog(null, "Your pet is not thirsty anymore!");
		happinessLevel+=3;
		System.out.println(happinessLevel);
	}
	static void walk() {
		JOptionPane.showMessageDialog(null, "Your pet is well exercised!");
		happinessLevel+=6;
		System.out.println(happinessLevel);
	}
}
