package Tests;

import org.junit.Assert;
import org.junit.Test;
import sensorData.SensorData;
import sensorData.SensorDataExchanger;
import sensorData.SensorDataSender;
import tcp.Connection;
import tcp.TCPConnector;

import java.io.*;
import java.net.Socket;

import static org.junit.Assert.*;

public class SensorDataListTest {

    public InputStream getInputStream() throws IOException {
        Connection c = new TCPConnector();
        return c.getInputStream();
    }

    public OutputStream getOutputStream() throws IOException {
        Connection c = new TCPConnector();
        return c.getOutPutStream();
    }

    @Test
    void validTest1(){

    }
}