package event;

import hardware.KeyboardController;
import utils.Wait;

public class DinoAction {

    final KeyboardController keyboardController;

    public DinoAction() {
        keyboardController = new KeyboardController();
    }

    public void run() {
        keyboardController.pressSpaceKey();
        Wait.Wait2MilliSeconds();
        keyboardController.releaseSpaceKey();
    }

    public void jump() {
        keyboardController.pressUpKey();
        Wait.Wait2MilliSeconds();
        keyboardController.releaseUpKey();
    }

    public void bend() {
        keyboardController.pressDownKey();
        Wait.Wait2Seconds();
        keyboardController.releaseDownKey();
    }
}
