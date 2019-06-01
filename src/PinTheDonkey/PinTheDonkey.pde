  PImage donkey;
  PImage tail;
  void setup(){
   size(550,406);
    donkey = loadImage("donkey.jpg");
   tail = loadImage("tail.png");
   tail.resize(130,130);

  }
  void draw(){
    background(donkey);
    image(tail, mouseX, mouseY);
    rect(0,0,30,30);
    rect(460,130,40,40);
  }
