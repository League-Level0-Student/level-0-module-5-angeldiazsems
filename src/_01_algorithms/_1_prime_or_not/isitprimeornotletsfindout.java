package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class isitprimeornotletsfindout {
public static void main(String[] args) {
	
	
String input =	JOptionPane.showInputDialog("Give me a number");
	

int hi = Integer.parseInt(input);

boolean isprime = true;
	
for (int i = 2; i < hi; i++) {
	
	if(hi%i==0) {
		
		isprime = false;
	
		JOptionPane.showMessageDialog(null, "That number is not prime");
		
		break;
	
	}

	isprime = true;
JOptionPane.showMessageDialog(null, "That number is prime");
break;
	}
	
	
	
	
}	
	
	

	
}

