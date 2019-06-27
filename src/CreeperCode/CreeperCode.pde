
int x=100;
int y=500;
PImage creeper;
void setup(){
 size(1000,1000); 
 PImage  field = loadImage("green.jpg");
field.resize(1000,1000);
background(field);
creeper=loadImage("aCreeper.png");
creeper.resize(15,15);
image(creeper,x, y);
}

void draw(){
  
if(mousePressed){
 
 

if(isNear(mouseX, x)&&isNear(mouseY,y)){
  fill(#10FF0D);
  print("You found the creeper!");
}
else{
 fill(#FF0D0D); 

}
 ellipse(mouseX,mouseY,10,10);
 
}}
boolean isNear(int a, int b) {
if (abs(a - b) < 25)
     return true;
else
     return false;
}
