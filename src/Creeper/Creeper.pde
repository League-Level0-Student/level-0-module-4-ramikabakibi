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
}

void draw(){
  image(creeper,x, y);
}
