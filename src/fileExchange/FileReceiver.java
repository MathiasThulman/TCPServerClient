package fileExchange;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileReceiver {
    /**
     * Received content from input stream writes it to local file
     * @param filename local file name
     * @param is content provider
     */
    void receiveFile(String filename, InputStream is) throws IOException;
}
