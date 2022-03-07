import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        Connector connection = new Connector();
        ServerSocket serverSocket = connection.CreateConnection();
        Logger log = new Logger();
        Socket client = serverSocket.accept();

        while(!client.isClosed()) {
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String calculation;

            calculation = in.readLine();

            log.LogItem(calculation);

            System.out.println("Total calculations for this session is " + log.GetTotalCalculation());
        }
    }

}
