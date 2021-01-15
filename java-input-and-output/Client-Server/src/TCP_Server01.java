import java.net.*;
import java.io.*;

public class TCP_Server01 {

    public static void main(String args[]) {

        // Declare local variables to hold 	   	    // input / output and data streams
        InputStream is;
        OutputStream os;
        DataInputStream disFromClient;
        DataOutputStream dosToClient;

        // Declare socket on which server 	   	    // listens and client socket which
        // is obtained when a connection is made
        Socket clientSocket;
        ServerSocket listenSocket;

        // Variables for client message, the 		   // integer value it sends
        // and server port
        String clientMessage;
        int clientInt;
        int serverPort = 7896;
        try {
            // Create the server socket – then waits and ‘listens’ for 			 // connection requests by calling ‘accept’. When ‘accept’ gets 			 // a connection request from a client it makes the connection 			 // and returns a ‘socket’ for use between server / client
            listenSocket = new ServerSocket(serverPort);
            System.out.println("Waiting for client...");
            clientSocket = listenSocket.accept();

            // Extract the input / output streams from the socket and set
            // up associated ‘data’ streams
            is = clientSocket.getInputStream();
            os = clientSocket.getOutputStream();
            disFromClient = new DataInputStream(is);
            dosToClient = new DataOutputStream(os);

            // Get the message and int value from the client
            clientMessage = disFromClient.readUTF();
            clientInt = disFromClient.readInt();

            // Modify message and int value and sent then back to client
           dosToClient.writeUTF("From Server: " + clientMessage);
            dosToClient.writeInt(clientInt+30);

            clientSocket.close();
        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
    } // main
}
