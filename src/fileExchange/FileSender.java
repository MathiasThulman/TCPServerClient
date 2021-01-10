package fileExchange;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public interface FileSender {
    /**
     * send for from a local program over and output stream to maybe another process or client
     *@param filename = local file name
     *@param os connection/ stream to remote entity with
     */
    void sendFile(String filename, OutputStream os) throws IOException;
}
