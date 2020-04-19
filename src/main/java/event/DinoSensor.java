package event;

import utils.Point;
import hardware.ScreenController;

public class DinoSensor {

    private static final Point CACTUS = new Point(220, 463);
    private static final int MAX_DISTANCE_CACTUS = 30;

    private static final Point BIRD = new Point(280, 387);
    private static final int MAX_DISTANCE_BIRD = 1;

    private static final Point DINO_1 = new Point(63, 460);
    private static final Point DINO_2 = new Point(95, 480);
    private static final Point DINO_3 = new Point(125, 433);
    private static final Point DINO_4 = new Point(139, 425);

    public static final int NIGHT_OBJECT_COLOR = 172;
    public static final int DAY_OBJECT_COLOR = 83;

    private final ScreenController screenController;

    public DinoSensor() {
        screenController = new ScreenController();
    }

    public boolean seeBird() {
        return analyze(BIRD, MAX_DISTANCE_BIRD);
    }

    public boolean seeCactus() {
        return analyze(CACTUS, MAX_DISTANCE_CACTUS);
    }

    public boolean isJumping() {
        return !dinoIsOnFloor();
    }

    private boolean dinoIsOnFloor() {
        return detect(DINO_1)
                && detect(DINO_2)
                && detect(DINO_3)
                && detect(DINO_4);
    }

    private boolean analyze(Point objectPosition, int xDistance) {
        for (int x = 0; x < xDistance; x += 2) {
            if (detect(objectPosition.getX() + x, objectPosition.getY())
                    || detect(objectPosition.getX() + xDistance + x, objectPosition.getY())) {
                return true;
            }
        }
        return false;
    }

    private boolean detect(Point point) {
        return detect(point.getX(), point.getY());
    }

    private boolean detect(int x, int y) {
        int redLevel = screenController.viewScreen(x, y).getRed();
        boolean isObject = redLevel == NIGHT_OBJECT_COLOR || redLevel == DAY_OBJECT_COLOR;
//        System.out.println("x = " + x + ", y = " + y + " ,redLevel= " + redLevel + " ,isObject= " + isObject);
        return isObject;
    }


}