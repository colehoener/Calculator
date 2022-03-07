import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connector {

    public Connector(){

    }

    public ServerSocket CreateConnection() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        return serverSocket;
    }



}
