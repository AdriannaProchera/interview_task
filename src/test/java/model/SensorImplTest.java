package model;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SensorImplTest {

    SensorImpl sensor = new SensorImpl();

    @BeforeEach
    void setUp() {
        sensor = new SensorImpl();
    }
    
    @Test
    public void inputTest() throws InterruptedException {
        //given
        Packet expectedPacket = Packet.giveRandomPacket();
        //when
        Packet actualPacket = sensor.input(expectedPacket);
        //then
        assertEquals(expectedPacket, actualPacket);
    }
    @Test
    public void inputTestFailure() throws InterruptedException {
        //given
        Packet randomPacket = Packet.giveRandomPacket();
        //when
        Packet expectedPacket = sensor.input(Packet.giveRandomPacket());
        //then
        assertNotEquals(expectedPacket, randomPacket);
    }

    @Test
    public void outputTest() throws InterruptedException {
        //given
        Packet currentPacket = Packet.giveRandomPacket();
        //when
        sensor.setCurrentPacket(currentPacket);
        //then
        assertEquals(currentPacket.toString(), sensor.output());
    }

    @Test
    public void outputTestFailure() throws InterruptedException {
        //given
        Packet firstPacket = Packet.giveRandomPacket();
        Packet secondPacket = Packet.giveRandomPacket();
        //when
        sensor.setCurrentPacket(firstPacket);
        //then
        assertNotEquals(sensor.output(), secondPacket.toString());
    }

}