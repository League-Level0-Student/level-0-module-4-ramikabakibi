package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class OwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
JOptionPane.showMessageDialog(null, "You are at the edge of a forest at night. The path branches off in three directions: one leads to a bear, the other one leads to a sword, and the last oen leads to a small creek");
int firstchoice = JOptionPane.showOptionDialog(null, "Which path will you choose?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "bear", "sword", "creek" }, null);

	}
void bear() {
	JOptionPane.showMessageDialog(null, "You venture bravely and confront the bear, only to be eaten in one gulp. Sorry, you lose!");
}

}
