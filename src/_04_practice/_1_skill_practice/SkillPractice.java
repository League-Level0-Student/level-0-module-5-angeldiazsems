package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	
	
	SkillPractice skills = new SkillPractice();
    skills.skill1();
    //skills.skill2();
  //  skills.skill3();
   // skills.skill4();
   // skills.skill5();
}

	
void skill1() {
	String input = JOptionPane.showInputDialog("how many dimes do you have");
	int hi =Integer.parseInt(input);
	
	int coins = hi*10;

JOptionPane.showMessageDialog(null, "you have "+coins+" coins in total");


}















	
}

