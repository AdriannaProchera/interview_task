package app;

import model.Packet;
import model.SensorImpl;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        SensorImpl sensorImpl = new SensorImpl();

        System.out.println("First example:");
        Packet packet1 = new Packet(1,1);
        Packet packet2 = new Packet(2,1);
        Packet packet3 = new Packet(3,1);
        Packet packet4 = new Packet(4,0);
        Packet packet5 = new Packet(5,1);
        Packet packet6 = new Packet(6,1);
        Packet packet7 = new Packet(7,0);
        Packet packet8 = new Packet(8,0);

        sensorImpl.input(packet1);
        System.out.print(sensorImpl.output());
        sensorImpl.input(packet2);
        System.out.print(sensorImpl.output());
        sensorImpl.input(packet3);
        System.out.print(sensorImpl.output());
        sensorImpl.input(packet4);
        System.out.print(sensorImpl.output());
        sensorImpl.input(packet5);
        System.out.print(sensorImpl.output());
        sensorImpl.input(packet6);
        System.out.print(sensorImpl.output());
        sensorImpl.input(packet7);
        System.out.print(sensorImpl.output());
        sensorImpl.input(packet8);
        System.out.print(sensorImpl.output());

        System.out.println("Second example:");
        for(int i = 0; i < 20; i++) {
            Packet packet = Packet.giveRandomPacket();
            sensorImpl.input(packet);
            System.out.print(sensorImpl.output());
        }

    }
}

