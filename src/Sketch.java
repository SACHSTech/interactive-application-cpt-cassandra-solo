import processing.core.PApplet;

/**
 * Template for programs with Processing graphics output.
 * @author Cassandra Lai
 */
public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(600, 400); 
    }

    @Override
    public void setup() {
        background(204, 255, 255);
        fill(204, 102, 0);              // Brown fill, no outline
        noStroke();
        rect(0, 350, 600, 200);
        
        fill(102, 204, 255);              // Blue fill, outline
        stroke(100);
        rect(100, 150, 400, 200);
        
        fill(255, 153, 51);             // Orange fish
        noStroke();
        triangle(320, 250, 350, 230, 350, 270);
        ellipse(300, 250, 70, 50);
        fill(0, 0, 0);
        ellipse(275, 250, 10, 15);
        
    }

    @Override
    public void draw() {

    }

    /** Additional helper methods below */

}
