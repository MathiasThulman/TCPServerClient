package sensorData;

public interface SensorData {
    /**
     *
     * @return timestamp of object
     */
    long getTimeStamp();

    /**
     *
     * @return value of the object
     */
    float getValue();

    /**
     *
     * @return sensorname
     */
    String getSensorName();
}
