package sensorData;

import java.io.IOException;
import java.io.OutputStream;

public interface SensorDataSender {
    /**
     * sends sensor data set
     * @param data
     *
     */
    void sendSensorData(SensorData data, OutputStream os) throws IOException;
}
