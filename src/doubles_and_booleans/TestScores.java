package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String answer= JOptionPane.showInputDialog("What is your test score?" );
double i = Double.parseDouble(answer);
if( i>70) {
	JOptionPane.showMessageDialog(null, "Wowwww! You must have studied for this test!");
	
}
else {
	JOptionPane.showMessageDialog(null, "Dude you need to study more.");	
}
	}

}
