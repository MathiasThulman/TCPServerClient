package app;

import fileExchange.FileExchanger;
import fileExchange.FileReceiver;
import fileExchange.FileSender;
import tcp.Client;
import tcp.Connection;
import tcp.Server;
import tcp.TCPConnector;

import java.io.IOException;

public class TCPFileExchangeImpl implements TCPFileExchange {
    @Override
    public void sendFile2Host(String filename, String hostName, int port) throws IOException {
        // create connection
        Client client = new TCPConnector();
        Connection connection = client.connect(hostName, port);

        //send file
        FileSender fs = new FileExchanger();
        fs.sendFile(filename, connection.getOutPutStream());
    }

    @Override
    public void receiveFile(String filename, int port) throws IOException {
        //accept connection
        Server server = new TCPConnector();
        Connection connection = server.acceptConnection(port);

        //receive file
        FileReceiver fr = new FileExchanger();
        fr.receiveFile(filename, connection.getInputStream());
    }
}
