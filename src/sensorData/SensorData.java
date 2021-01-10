package sensorData;

public interface SensorData {
    // returnss time stamp of measurement
    long getTimeStamp();

    //return value measured by sensor
    float getValue();

    //returns name of the Sensor
    String getSensorName();
}
