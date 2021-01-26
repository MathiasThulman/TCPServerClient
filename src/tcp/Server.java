package tcp;

import java.io.IOException;

public interface Server {
    /**
     * accepts connections from clients
     * @param port specified port to listen on
     * @return returns connection ojbect
     * @throws IOException
     */
    Connection acceptConnection(int port) throws IOException;
}
