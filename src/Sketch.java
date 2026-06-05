import processing.core.PApplet;

/**
 * Template for programs with Processing graphics output.
 * @author Cassandra Lai
 */
public class Sketch extends PApplet {

    float fishX = 313;
    float fishY = 270;

    int c1 = color(51, 102, 255); 
    int c2 = color(255, 255, 0);  
    // float fish = (int)random(1,4);
    int fish = 2;  // for testing

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
        
        int c1 = color(51, 102, 255);       // blue
        int c2 = color(255, 255, 0);        // yellow
        int c3 = color(153, 51, 255);       // purple
        int c4 = color(51, 204, 51);        // green
        

        if (fish == 1){
            fill(c1);             // Blue fish
            noStroke();
            triangle(320, 250, 350, 230, 350, 270);
            ellipse(300, 250, 70, 50);
            fill(0, 0, 0);
            ellipse(275, 250, 10, 15);
            System.out.println("1");
        }
        else if (fish == 2){
            fill(c2);             // Yellow fish
            noStroke();
            triangle(320, 250, 350, 230, 350, 270);
            ellipse(300, 250, 70, 50);
            fill(0, 0, 0);
            ellipse(275, 250, 10, 15);
            System.out.println("2");
        }
        else if (fish == 3){
            fill(c3);             // Purple fish
            noStroke();
            triangle(320, 250, 350, 230, 350, 270);
            ellipse(300, 250, 70, 50);
            fill(0, 0, 0);
            ellipse(275, 250, 10, 15);
            System.out.println("3");
        }
        else if (fish == 4){
            fill(c4);             // Green fish
            noStroke();
            triangle(320, 250, 350, 230, 350, 270);
            ellipse(300, 250, 70, 50);
            fill(0, 0, 0);
            ellipse(275, 250, 10, 15);
            System.out.println("4");
        }
        
    }

    @Override
    public void draw() {
       
        if (fish == 1){
            
            if(mousePressed && mouseX > (fishX - 38) && mouseX < (fishX + 37) && 
                    mouseY > (fishY - 20) && mouseY < (fishY + 20)) {
                        
                System.out.println("click detected");

                background(0);

                fill(204, 102, 0);              // Brown fill, no outline
                noStroke();
                rect(0, 350, 600, 200);
        
                fill(102, 204, 255);              // Blue fill, outline
                stroke(100);
                rect(100, 150, 400, 200);

                fill(c1);             // Blue fish
                noStroke();
                triangle(320, 250, 350, 230, 350, 270);
                ellipse(300, 250, 70, 50);
                fill(0, 0, 0);
                ellipse(275, 250, 10, 15);
            }
        }
        else if (fish == 2){

            background(204, 255, 255);
            
            fill(204, 102, 0);              // Brown fill, no outline
            noStroke();
            rect(0, 350, 600, 200);
        
            fill(102, 204, 255);              // Blue fill, outline
            stroke(100);
            rect(100, 150, 400, 200);
            if(keyPressed){
                if (keyCode == UP){
                    fishY--;
                }
                else if (keyCode == DOWN){
                    fishY++;
                }
                else if (keyCode == LEFT){
                    fishX--;
                }
                else if (keyCode == RIGHT){
                    fishX++;
                }
                    if(fishX < 150){
                        fishX = 150;
                    }
                    else if(fishX > 463){
                        fishX = 463;
                    }
                    else if(fishY < 195){
                        fishY = 195;
                    }
                    else if(fishY > 345){
                        fishY = 345;
                    }
            }

            fill(c2);             // Yellow fish
            noStroke();
            ellipse(fishX - 13, fishY - 20, 70, 50);
            triangle(fishX + 7, fishY - 20, fishX + 37, fishY - 40, fishX + 37, fishY);
            fill(0, 0, 0);
            ellipse(fishX - 38, fishY - 20, 10, 15);
        }
    }

    /** Additional helper methods below */

}
