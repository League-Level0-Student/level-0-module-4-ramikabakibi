void setup(){
 PImage face = loadImage("salah.jpg");
 size(1000,600);
    face.resize(1000,600);
    background(face); 
}
void draw(){
 fill(#FFFFFF);
  ellipse(510,112,30,30); 
 fill(#0A0A0A);
 if(mouseX<498){
   mouseX=498;
 }
 if(mouseX>522){
   mouseX=522;
 }
 if(mouseY<99){
   mouseY=99;
 }
 if(mouseY>124){
   mouseY=124;
 }
 ellipse(mouseX,mouseY,15,15);
 fill(#FFFFFF);
 ellipse(570,118,30,30);
 fill(#0A0A0A);
 ellipse(mouseX+60,mouseY, 15,15);
}
