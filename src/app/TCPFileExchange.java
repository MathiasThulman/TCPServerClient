package app;

import java.io.IOException;

public interface TCPFileExchange {
    /**
     * send file from local entity to remot hsot via TCP
     * @param filename
     * @param hostName
     * @param port
     */
    void sendFile2Host(String filename, String hostName,int port) throws IOException;

    /**
     * receive conent from a TCP connection and write it to a local file
     * @param filename local file name
     * @param Port listening port
     */
    void receiveFile(String filename, int Port) throws IOException;
}
