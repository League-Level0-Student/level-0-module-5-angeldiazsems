package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	
	
	SkillPractice skills = new SkillPractice();
    skills.skill1();
    skills.skill2();
   skills.skill3();
    skills.skill4();
    skills.skill5();
}

	
void skill1() {
	String input = JOptionPane.showInputDialog("how many dimes do you have");
	int hi =Integer.parseInt(input);
	int coins = hi*10;
JOptionPane.showMessageDialog(null, "you have "+coins+" coins in total");
String input2 = JOptionPane.showInputDialog("How tall are you in inches?");
int hi2 = Integer.parseInt(input2);
if(hi2 < 36) {
	JOptionPane.showMessageDialog(null, "You need to eat your Wheaties(boomer joke)");
}

}

void skill2() {
	
	for(int i = 0; i < 30; i++ ) {
		if(i%3 == 2) {
		System.out.println(i);
		}
	}
}

void skill3() {
	
	Random ran = new Random();
	int cody = ran.nextInt(20);
	System.out.println(cody);
	Random road = new Random();
	int sauer = ran.nextInt(10);
	System.out.println(sauer);

JOptionPane.showMessageDialog(null, "the difference between the two numbers is "+(cody-sauer));
	
	
}

void skill4() {
	
	String input = JOptionPane.showInputDialog("What city do you live in");
	if(input .equals ("San Diego")) {	
		JOptionPane.showMessageDialog(null, "you live in americas fineist city");
	}
	else {	
		JOptionPane.showMessageDialog(null, "move to san diego");
	}
	
	int cars = 3;
	if(cars == 0) {
		
		JOptionPane.showMessageDialog(null, "I bet you use public transportion");
	}

	else if(cars == 1) {
	
	JOptionPane.showMessageDialog(null, " the maker of your is cody sauer, and the model the colby 3000");
	}
	else if(cars<1) {
		
		JOptionPane.showMessageDialog(null, "Your cars have "+cars*4+ " wheels");
	}
}

void skill5() {
	String input = JOptionPane.showInputDialog("whats the name of your school");

	JOptionPane.showMessageDialog(null, input+" is a fantastic school");
	
	
}









	
}

