package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) throws InterruptedException {
	

	
	String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	String cook = JOptionPane.showInputDialog("How long do you want to cook your popcorn?");
	int time = Integer.parseInt(cook);
	
	Popcorn popcorn = new Popcorn(flavor);
	Microwave microwave = new Microwave();
	
	microwave.putInMicrowave(popcorn);
	microwave.setTime(time);
	microwave.startMicrowave();
	
	
	
}
}
