import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch
 boolean gameOver=false;
 int x=0;
 int y=0;
 PImage donkey;
  PImage tail;
  void setup(){
   size(550,406);
    donkey = loadImage("donkey.jpg");
   tail = loadImage("tail.png");
   tail.resize(130,130);
Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to

  }
  void draw(){
    if((dist(0, 0, mouseX, mouseY) < 30) || gameOver){
      
    background(donkey);
    }
    else{
      background(0);
    }
    image(tail, x, y);
   if(mousePressed && !gameOver){
   gameOver=true;
     x=mouseX;
    y=mouseY;
    if((x>460)&&(x<500)&&(y>130)&&(y<170)){
      if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
    }
    
   }
    rect(0,0,30,30);
    rect(460,130,40,40);
  
  }
