package logic;

import event.DinoAction;
import event.DinoSensor;

import static utils.Wait.Wait10Seconds;

public class DinoLogic {

    final DinoAction dinoAction;
    final DinoSensor dinoSensor;

    public DinoLogic() {
        dinoAction = new DinoAction();
        dinoSensor = new DinoSensor();
    }

    public void start() {
        Wait10Seconds();
        dinoAction.run();
        while (true) {
            if (!dinoSensor.isJumping()) {
                System.out.println(System.currentTimeMillis() + "On Floor");
                if (dinoSensor.seeCactus()) {
                    System.out.println(System.currentTimeMillis() + "Jump Cactus");
                    dinoAction.jump();
                } else {
                    if (dinoSensor.seeBird()) {
                        System.out.println(System.currentTimeMillis() + "Bend Bird");
                        dinoAction.bend();
                    }
                }
            }
        }
    }
}
