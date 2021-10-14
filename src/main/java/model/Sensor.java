package model;

public abstract class Sensor {

    public abstract Packet input(Packet packet);
    public abstract String output() throws InterruptedException;

}
