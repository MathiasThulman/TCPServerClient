package sensorData;

import java.io.IOException;
import java.io.InputStream;

public interface SensorDataReceiver {
    /**
     * Receive Data from stream and create sensor data objekt
     * @param is
     * @return
     */
    SensorData receiveSensorData(InputStream is) throws IOException;
}
