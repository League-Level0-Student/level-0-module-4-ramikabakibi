package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JOptionPane.showMessageDialog(null, "You are at the edge of a forest at night. The path branches off in three directions: one leads to a bear, the other one leads to a sword, and the last oen leads to a small creek");
int firstchoice = JOptionPane.showOptionDialog(null, "Which path will you choose?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "bear", "sword", "creek" }, null);
if(firstchoice==0) {
	bear();
}
if(firstchoice==1) {
	sword();
}
if(firstchoice==2) {
	creek();
}
	}
static void bear() {
	JOptionPane.showMessageDialog(null, "You venture bravely and confront the bear, only to be eaten in one gulp. Sorry, you lose!");
}
static void creek() {
	JOptionPane.showMessageDialog(null, "You see the creek is alligator infested, but a path of rocks lead safely across. Will you venture across it or will you go back to the start?");
	int creekorback = JOptionPane.showOptionDialog(null, "Which path will you choose?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "go across", "go back",}, null);
	if(creekorback==0) {
		JOptionPane.showMessageDialog(null, "You try to step carefully across the rocks but slip into an alligator's mouth. Sorry, you lose!");
	}
	if(creekorback==1){
		int firstchoice = JOptionPane.showOptionDialog(null, "Which path will you choose?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "bear", "sword", "creek" }, null);	
	}

}
static void sword() {
	JOptionPane.showMessageDialog(null, "You see a glimmering sword ahead of you, stuck in the dirt. You pull it out, and out of the bushes comes a one eyed monster. Will you fight it or retreat back?");
	int attackorretreat = JOptionPane.showOptionDialog(null, "Which path will you choose?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "fight it!!", "retreat",  }, null);
	if(attackorretreat==0) {
		JOptionPane.showMessageDialog(null, "You stand up to the monster and charge it. He swipes at you, but you roll and dodge it. You swing your sword chopping off the monsters legs. You win!");
	}
	if(attackorretreat==1) {
		JOptionPane.showMessageDialog(null, "You retreat back to the edge of the forest");
		int firstchoice = JOptionPane.showOptionDialog(null, "Which path will you choose?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "bear", "sword", "creek" }, null);
	
	}

}

}
