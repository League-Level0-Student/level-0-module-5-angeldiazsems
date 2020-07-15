int x = 500;
int x2point0 = 300;
int y = 500;
void setup() {
  size(1000,1000);
}

int direction = 1;
void draw() {
  background(#359303);
  
  
  
  for (int i = 0; i < 8; i++) {
    noFill();
   
    ellipse(x,y,(500-i*65),(500-i*65));
  
   ellipse(x2point0,y,(500-i*65),(500-i*65));

}
  x-=5*direction;
 x2point0+=5*direction;
  

 rect(0,0,0,1000);
 if(x<0||x>1000){
direction*=-1;
 }
  
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
