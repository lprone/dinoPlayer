package hardware;

import utils.RobotSingleton;
import utils.Wait;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyboardController {

    private static Robot robot;

    public KeyboardController() {
        robot = RobotSingleton.getInstance();
    }

    public void pressSpaceKey() {
        robot.keyPress(KeyEvent.VK_SPACE);
    }

    public void pressDownKey() {
        robot.keyPress(KeyEvent.VK_DOWN);
    }

    public void pressUpKey() {
        robot.keyPress(KeyEvent.VK_UP);
    }

    public void releaseSpaceKey() {
        robot.keyRelease(KeyEvent.VK_SPACE);
    }

    public void releaseUpKey() {
        robot.keyRelease(KeyEvent.VK_UP);
    }

    public void releaseDownKey() {
        robot.keyRelease(KeyEvent.VK_UP);
    }

}
