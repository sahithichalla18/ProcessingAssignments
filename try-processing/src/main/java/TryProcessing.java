import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int ball1 = 0 ;
    int ball2 = 0 ;
    int ball3 = 0 ;
    int ball4 = 0 ;

    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw(){
        ellipse(ball1,HEIGHT*0.2f,DIAMETER,DIAMETER);
        ball1++;
        ellipse(ball2,HEIGHT*0.4f,DIAMETER,DIAMETER);
        ball2+=2;
        ellipse(ball3,HEIGHT*0.6f,DIAMETER,DIAMETER);
        ball3+=3;
        ellipse(ball4,HEIGHT*0.8f,DIAMETER,DIAMETER);
        ball4+=4;
    }
}
