# interview_task
Short description:

Folder model contain class Packet, abstract class Sensor and class SensorImpl which extends class Sensor. 

In class Packet I have implemented possibility of creation object with timestamp and some value (1 or 0). Also there we can find method giveRandomPacket() which generate packet in time range between 5 and 10 seconds and value 1 or 0.

Sensor contain 2 methods input() and output() which are overridden in SensorImpl.

In folder app we can find example of main class.

The implementation include unit tests. Methods in SensorImplTest verify the correct operation of the input() and output().




How to run program:

Go to : interview_task/target/classes
And then run: java app.Main
