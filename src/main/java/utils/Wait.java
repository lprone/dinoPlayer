package utils;

public class Wait {

    public static void Wait10Seconds() {
        wait(10000);
    }

    public static void Wait5Seconds() {
        wait(5000);
    }

    public static void Wait3Seconds() {
        wait(3000);
    }

    public static void Wait2Seconds() {
        wait(2000);
    }

    public static void Wait500MilliSeconds() {
        wait(500);
    }

    public static void Wait300MilliSeconds() {
        wait(300);
    }

    public static void Wait200MilliSeconds() {
        wait(200);
    }

    public static void Wait100MilliSeconds() {
        wait(100);
    }

    public static void Wait50MilliSeconds() {
        wait(50);
    }

    public static void Wait20MilliSeconds() {
        wait(20);
    }

    public static void Wait10MilliSeconds() {
        wait(10);
    }

    public static void Wait5MilliSeconds() {
        wait(5);
    }

    public static void Wait4MilliSeconds() {
        wait(4);
    }

    public static void Wait3MilliSeconds() {
        wait(3);
    }

    public static void Wait2MilliSeconds() {
        wait(2);
    }

    public static void Wait1MilliSeconds() {
        wait(1);
    }

    private static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
