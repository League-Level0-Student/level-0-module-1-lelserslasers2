void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill (#F70505);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (#05F72B);
    rect(176, 103, 12, 32);
    if (mousePressed){
      fill (#F7FAF8);
      ellipse(125, 200, 100, 100);
    }
    else{
      fill (#F70505);
      ellipse(150, 200, 150, 150);
    }
    
}