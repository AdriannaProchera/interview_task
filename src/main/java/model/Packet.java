package model;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Packet {

    private final long timestamp;
    private final int value;

    public Packet(long timestamp, int value) {
        this.timestamp = timestamp;
        this.value = value;
    }

    public Packet(){
        this.timestamp = 0;
        this.value = -1;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return timestamp + ": " + value + "\n";
    }

    public static Packet giveRandomPacket() throws InterruptedException {
            double n = Math.random();
            Random ran = new Random();

            int time = ran.nextInt(6) + 5;
            int number = 0;
            TimeUnit.SECONDS.sleep(time);

            if (n < 0.5) {
                n = 0;
                number = (int) n;
            } else {
                n = 1;
                number = (int) n;
            }

            long timestamp = System.currentTimeMillis() / 1000;
            return new Packet(timestamp, number);
    }
}
