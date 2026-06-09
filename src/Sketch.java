import processing.core.PApplet;

/**
 * Give user a task when fish is a specific colour.
 * @author Cassandra Lai
 */
public class Sketch extends PApplet {

    float fishX = 313;
    float fishY = 270;

    int c1 = color(51, 102, 255);       // blue
    int c2 = color(255, 255, 0);        // yellow
 
    float fish = (int) random(1,3);        // random generator

    String[] fishSpeech = {"Click me to turn the background black!",
                            "Wow, now the background is black!",
                            "Use the arrow keys to make me swim!",
                            "Yay, now I'm swimming!"};

    int speechIndex = 0;

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(600, 400); 
    }

    @Override
    public void setup() {
        drawTank();
        if (fish == 1){
            drawBlueFish();
        }
        if (fish == 2){
            drawYellowFish();
        }

    background(204, 255, 255);

    }
    
    private void drawTank(){
        fill(204, 102, 0);              // Brown fill, no outline
        noStroke();
        rect(0, 350, 600, 200);
        
        fill(102, 204, 255);              // Blue fill, outline
        stroke(100);
        rect(100, 150, 400, 200);
    }

    private void drawBlueFish(){
        fill(c1);             // Blue fish
        noStroke();
        triangle(320, 250, 350, 230, 350, 270);
        ellipse(300, 250, 70, 50);
        fill(0, 0, 0);
        ellipse(275, 250, 10, 15);
    }

    private void drawYellowFish(){
        fill(c2);             // Yellow fish
        noStroke();
        ellipse(fishX - 13, fishY - 20, 70, 50);
        triangle(fishX + 7, fishY - 20, fishX + 37, fishY - 40, fishX + 37, fishY);
        fill(0, 0, 0);
        ellipse(fishX - 38, fishY - 20, 10, 15);
    }
        
    @Override
    public void draw() {
        drawFishOne();
        drawFishTwo();
    }
    private void drawFishOne(){
        if (fish == 1.0){
            
            // press a certain area with the mouse to change background to black
            if(mousePressed && mouseX > (fishX - 38) && mouseX < (fishX + 37) && 
                    mouseY > (fishY - 20) && mouseY < (fishY + 20)) {
                        
                background(0);
                
                speechIndex = 1;

            }
                drawTank();
                drawBlueFish();
                fill(0);
                textSize(20);
                text(fishSpeech[speechIndex], fishX - 180, fishY - 50);
        }
    }
        
    private void drawFishTwo(){
            if (fish == 2.0){

            // use arrow keys to move fish within the tank
            background(204, 255, 255);
            drawTank();
            speechIndex = 2;

            if(keyPressed){
                if (keyCode == UP){
                    fishY--;
                speechIndex = 3;
                }
                else if (keyCode == DOWN){
                    fishY++;
                    speechIndex = 3;
                }
                else if (keyCode == LEFT){
                    fishX--;
                    speechIndex = 3;
                }
                else if (keyCode == RIGHT){
                    fishX++;
                    speechIndex = 3;
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

            fill(0);
            textSize(20);
            text(fishSpeech[speechIndex], fishX - 180, fishY - 50);
            drawYellowFish();
        }
    }
    

    /** Additional helper methods below */

}
