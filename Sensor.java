
public class Sensor {

    public enum SensorType {
        Volt,Current,Tempertue,Us
    }

    /**
     * @param sensorType
     */

    public SensorType SnsrTpe;
    public Sensor(SensorType sensorType) {
        SnsrTpe = sensorType;
    }
}
