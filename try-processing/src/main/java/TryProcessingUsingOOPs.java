import processing.core.PApplet;

class Circle{
    int x;
    int speed;

    Circle(){
        this.x = 0;
        this.speed = 0;
    }

}

public class TryProcessingUsingOOPs extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    Circle c1,c2,c3,c4;

    public static void main(String[] args) {
        PApplet.main("TryProcessingUsingOOPs",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
         c1 = new Circle();
         c2 = new Circle();
         c3 = new Circle();
         c4 = new Circle();
    }

    @Override
    public void draw(){
        drawCircle(c1,1,0.2f);
        drawCircle(c2,2,0.4f);
        drawCircle(c3,3,0.6f);
        drawCircle(c4,4,0.8f);
    }

    private void drawCircle(Circle c,int speed,float h) {
        ellipse(c.x,HEIGHT*h,DIAMETER,DIAMETER);
        c.x += speed ;
    }
}
