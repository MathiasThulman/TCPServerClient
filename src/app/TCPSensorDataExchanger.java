package app;

import sensorData.SensorData;

import java.io.IOException;

public interface TCPSensorDataExchanger {
    /**
     * send sensor data to a specified host
     * @param data
     * @param hostname
     * @param port
     */
    void sendSensorDate(SensorData data, String hostname, int port) throws IOException;

    /**
     * receive data on listening port
     * @param port
     */
    void receiveSensorData(int port) throws IOException;
}
