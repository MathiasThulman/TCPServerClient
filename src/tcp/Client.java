package tcp;

import java.io.IOException;

public interface Client {
    /**
     * connects as client to specified host
     * @param hostname name of host
     * @param port port of host
     * @return connection objekt
     * @throws IOException on connection issues
     */
    Connection connect(String hostname, int port) throws IOException;
}
