package util;

import app.TCPFileExchange;
import app.TCPFileExchangeImpl;

import java.io.IOException;

/**
 * UI for fileTransfer
 * expected parameters
 * 1) send file: file name, hostname (recipient), port
 * 2)receive: filename, port
 */
public class TCPFileExchangerUI {
    public static void main(String[] args) throws IOException, InterruptedException {
        if(args.length < 2){
            System.err.println("at least 2 arguments required");
            return;
        }

        String fileName = args[0];
        String hostname = null;
        int port = -1;

        String portString = null;
        if(args.length == 3){ //variante 1: send
            hostname = args[1];
            portString = args[2];
        } else if(args.length == 2) { //variante 2: receive
            portString = args[1];
        }

        port = Integer.parseInt(portString);

        TCPFileExchange tcpFileExchanger = new TCPFileExchangeImpl();
        if(hostname == null){ // variante 2:
            //receive
            tcpFileExchanger.receiveFile(fileName, port);
        } else{
            //send
            tcpFileExchanger.sendFile2Host(fileName,hostname, port);
        }
    }
}
