import javax.swing.JOptionPane;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String answer=JOptionPane.showInputDialog(null, "Pick any number");
		int x=Integer.parseInt(answer);
boolean isPrime=true;
		for(int i=2;i<x/2;i++) {
	if(x%i==0) {
		isPrime=false;
		break;
	}
	
}
		if(isPrime) {
			JOptionPane.showMessageDialog(null, "Your number is prime");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your number is not prime");
		}
		
	}

}
