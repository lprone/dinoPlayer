package hardware;

import utils.RobotSingleton;

import java.awt.Color;
import java.awt.Robot;

public class ScreenController {

    private static Robot robot;

    public ScreenController() {
        robot = RobotSingleton.getInstance();
    }

    public Color viewScreen(int x, int y) {
        return robot.getPixelColor(x, y);
    }

}
