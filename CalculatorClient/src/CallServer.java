import java.io.*;
import java.net.Socket;

public class CallServer {
    Socket server = null;
    BufferedReader br = null;
    PrintWriter out = null;

    public CallServer(Socket socket) throws IOException {
        this.server = socket;
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    public void Call(String msg) {

        out.println(msg);

    }
}
