package tcp;

import java.io.IOException;

public interface Server {
    /**
     * accepts connections from clients
     * @param port specofied port to listen on
     * @return returns connection ojbect
     * @throws IOException
     */
    Connection acceptConnection(int port) throws IOException;
}
