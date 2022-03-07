import java.io.IOException;
import java.net.Socket;

public class Connector {
    public Connector(){

    }

    public Socket CreateConnection() throws IOException {
        Socket socket = new Socket("localhost", 8080);
        return socket;
    }
}

