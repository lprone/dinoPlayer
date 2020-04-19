package utils;

import java.awt.AWTException;
import java.awt.Robot;

public class RobotSingleton {
    private static Robot robot;

    public static synchronized Robot getInstance() {
        if (robot == null) {
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }
        }
        return robot;
    }

    private RobotSingleton() {
    }
}
