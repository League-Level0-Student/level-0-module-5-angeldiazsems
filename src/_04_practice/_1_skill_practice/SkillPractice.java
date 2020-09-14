package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	
	
	SkillPractice skills = new SkillPractice();
    skills.skill1();
    skills.skill2();
   skills.skill3();
   // skills.skill4();
   // skills.skill5();
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











	
}

