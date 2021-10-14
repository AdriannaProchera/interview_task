package model;

public class SensorImpl extends Sensor {

    private Packet currentPacket;
    private Packet previousPacket;

    public SensorImpl(){
        this.previousPacket = new Packet();
    }

    public void setCurrentPacket(Packet currentPacket) {
        this.currentPacket = currentPacket;
    }

    public void setPreviousPacket(Packet previousPacket) {
        this.previousPacket = previousPacket;
    }

    @Override
    public Packet input(Packet packet) {
        setCurrentPacket(packet);
        return currentPacket;
    }


    @Override
    public String output() {
        if(previousPacket.equals(new Packet())){
            setPreviousPacket(currentPacket);
            return currentPacket.toString();
        }
        if(previousPacket.getValue() != currentPacket.getValue()){
            setPreviousPacket(currentPacket);
            return currentPacket.toString();
        }
        setPreviousPacket(currentPacket);
        return "";
    }


}
