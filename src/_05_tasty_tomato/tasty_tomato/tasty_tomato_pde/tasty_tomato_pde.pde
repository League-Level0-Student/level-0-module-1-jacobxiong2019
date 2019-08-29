void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#ED072A);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#2DB70F);
    rect(176, 103, 12, 32);
    if (mousePressed)
    {
      fill(200, 200, 200);
      ellipse(90, 200, 50, 50);
    }
    
     
}