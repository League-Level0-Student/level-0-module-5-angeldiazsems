package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class robotslave {
public static void main(String[] args) {
	
	robotslave hello = new robotslave();
	hello.hi.penDown();	
	hello.hi.setSpeed(200);
	String input2 = JOptionPane.showInputDialog("What color do you want OBEDIENT ROBOT to draw? (blue, green, red)");

			if( input2.equals("red")) {
hello.hi.setPenColor(Color.RED);}
			
			else if( input2.equals("green")) {
				hello.hi.setPenColor(Color.GREEN);}
			
			else if( input2.equals("blue")) {
				hello.hi.setPenColor(Color.BLUE);}
			
			
			
			
			
	
	String input = JOptionPane.showInputDialog("What shape do you want OBEDIENT ROBOT"
			+ " to draw (he is not working againist his will) square, circle, or triangle?");
	
	if(input.equals("square")) {
		hello.drawSquare();
	}
	else if( input.equals("triangle")) {
		hello.drawTriangle();
	}
	else if( input.equals("circle")) {
		hello.drawCircle();
	}
	
	
	
	
	
}
Robot hi = new Robot();
 void drawSquare(){
	for (int i = 0; i < 4; i++) {
	hi.move(90);
	hi.turn(90);
		}

 }
 
void drawTriangle() {
	for (int i = 0; i < 3; i++) {
		hi.move(125);
		hi.turn(125);
	}
 }


void drawCircle() {
	for (int i = 0; i < 360; i++) {
	hi.move(1);
	hi.turn(1);
	}	
}








}





