package fileExchange;

import java.io.*;

public class FileExchanger implements FileSender, FileReceiver {

    @Override
    public void sendFile(String fileName, OutputStream os) throws IOException {
        //open file
        FileInputStream fis = new FileInputStream(fileName);
        this.streamData(fis, os);
        os.close();
    }

    @Override
    public void receiveFile(String fileName, InputStream is) throws IOException {
        //opens outputstream to create file
        FileOutputStream fos = new FileOutputStream(fileName);
        this.streamData(is, fos);
    }

    private void streamData(InputStream is, OutputStream os) throws IOException {
        int read = 0;
        do{
            read = is.read();
            if(read != -1){
                os.write(read);
            }
        } while(read != -1);
    }
}
