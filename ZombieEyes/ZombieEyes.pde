void setup(){
  PImage face = loadImage("cat_face.jpg");
  face.resize(width, height);
  image(face, 0, 0);
  size(1000,1000);
  fill (#EA11D2);
  ellipse(400,450,75,75);
  ellipse(600,450,75,75);
  fill (#0A0A0A);
  ellipse(400,450,10,10);
  ellipse(600,450,10,10);
}

void draw(){
  fill (mouseX/4, mouseY/4, (mouseX-mouseY)/4);
  ellipse(400,450,75,75);
  ellipse(600,450,75,75);
  fill (#0A0A0A);
  ellipse(400,450,10,10);
  ellipse(600,450,10,10);
}