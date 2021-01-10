package sensorData;

import java.util.ArrayList;

public interface SensorDataList{
    /**
     * saves Sensor Data in a list
     * @return
     * returns average of all sensor data
     * returns the amount of saved objekts
     * returns the Average of a certain sensor
     */
    void add(SensorData data);
    SensorData get(int g);
    long getAverage();
    int getLength();
    long getAverageOfSensor(String SensorName);
}
