import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Demo Tcp Server Started!");
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket clientSocket = serverSocket.accept();
        System.out.println("Demo Tcp Client Connected!");
        OutputStream outputStream = clientSocket.getOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream, true);
        for (int i= 0; i < 100; i++){
            System.out.println("Sending Data Package: 'ASELS:16.70|'");
            printWriter.printf("ASELS:16.70|");
            Thread.sleep(1000);
        }
        System.out.println("Demo Tcp Server Stopped!");
    }
}
