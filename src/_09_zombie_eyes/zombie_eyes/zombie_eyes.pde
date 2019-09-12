
void setup() {
size(500,500);
PImage face = loadImage("zombie.jpeg");
face.resize(width, height);
image(face, 0, 0);
}
void draw() {
  fill(255,mouseX,mouseY);
  ellipse(170,85,105,75);
  ellipse(275,75,75,55);
  fill(#0F0101);
  ellipse(170,85,15,15);
  ellipse(275,75,15,15);
 

}