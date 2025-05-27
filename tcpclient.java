import java.net.*;
import java.io.*;

class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            Socket client = server.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String line = in.readLine();
                if (line == null) break;
                System.out.println("Client: " + line);
                System.out.print("You: ");
                out.println(userInput.readLine());
            }
            in.close();
            out.close();
            userInput.close();
            client.close();
            server.close();
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}

//Client:
class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.print("You: ");
                out.println(userInput.readLine());
                String serverMsg = in.readLine();
                if (serverMsg == null) break;
                System.out.println("Server: " + serverMsg);
            }
            in.close();
            out.close();
            userInput.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}