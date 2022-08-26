import processing.core.PApplet;

class Ball {

    private int horizontalPosition;
    private int verticalPosition;
    private int speed;

    public int getHorizontalPosition() {
        return horizontalPosition;
    }

    public int getVerticalPosition() {
        return verticalPosition;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHorizontalPosition(int horizontalPosition) {
        this.horizontalPosition = horizontalPosition;
    }

    Ball(int verticalPosition, int speed) {
        this.verticalPosition = verticalPosition;
        this.speed = speed;
    }

}

public class FourBallsUsingOops extends PApplet {

    public static final int WIDTH = 640;

    public static final int HEIGHT = 480;

    public static final int VERTICAL_POSITION_OF_BALL_ONE = HEIGHT / 5;

    public static final int VERTICAL_POSITION_OF_BALL_TWO = 2 * HEIGHT / 5;

    public static final int VERTICAL_POSITION_OF_BALL_THREE = 3 * HEIGHT / 5;

    public static final int VERTICAL_POSITION_OF_BALL_FOUR = 4 * HEIGHT / 5;

    public static final int DIAMETER = 10;

    Ball ball1, ball2, ball3, ball4;


    public static void main(String[] args) {
        PApplet.main("FourBallsUsingOops", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        ball1 = new Ball(VERTICAL_POSITION_OF_BALL_ONE, 1);
        ball2 = new Ball(VERTICAL_POSITION_OF_BALL_TWO, 2);
        ball3 = new Ball(VERTICAL_POSITION_OF_BALL_THREE, 3);
        ball4 = new Ball(VERTICAL_POSITION_OF_BALL_FOUR, 4);
    }

    @Override
    public void draw() {
        move(ball1);
        move(ball2);
        move(ball3);
        move(ball4);
    }

    private void move(Ball ball) {
        ellipse(ball.getHorizontalPosition(), ball.getVerticalPosition(), DIAMETER, DIAMETER);
        int currentHorizontalPosition = ball.getHorizontalPosition() + ball.getSpeed();
        ball.setHorizontalPosition(currentHorizontalPosition);
    }
}
