import ddf.minim.*;
Minim minim;
AudioPlayer sound;
void setup(){
  minim = new Minim(this);
  sound = minim.loadFile("ding.wav");
  size(1000,1000);
  fill(#DBA10D);
  ellipse(500,500,1000,1000);
  fill(#ED242B);
  ellipse(500,500,900,900);
  fill(#FFF308);
  ellipse(500,500,800,800);
 

}

void draw(){
  if (mousePressed){
  PImage pepperoni = loadImage("Pepperoni_Slice.jpg");
  pepperoni.resize(50, 50);
  image(pepperoni, mouseX,mouseY);
  sound.play();
  sound.rewind();
  }
}