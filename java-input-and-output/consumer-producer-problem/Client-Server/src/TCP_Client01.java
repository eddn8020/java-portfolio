import java.net.*;
import java.io.*;

public class TCP_Client01 {

    public static void main(String args[]) {
        // Declare some local variables:
        String serverName = "localhost";
        Socket s = null;
        int serverPort = 7896;

        // Local variables to hold input / output 		    // stream and data stream objects
        InputStream isFromServer = null;
        OutputStream osToServer = null;
        DataInputStream disFromServer = null;
        DataOutputStream dosToServer = null;

        // Create socket and extract input / output streams from socket

        // Set up message to be sent and declare 		    // variable to hold replies
        String message = "Hello TCP server ....";
        String reply;
        int returnedInt;
        try {
            // Create socket and extract input / output streams from socket
            s = new Socket(serverName, serverPort);
            isFromServer = s.getInputStream();
            osToServer = s.getOutputStream();

            // Create data streams based on basic input / output 		   // streams
            disFromServer = new DataInputStream(isFromServer);
            dosToServer = new DataOutputStream(osToServer);

            // Send the message and an integer value to the server
            dosToServer.writeUTF(message);
            dosToServer.writeInt(200);
        } catch (Exception e) {

        }
        try {
            // Receive reply message and reply integer from server 		 // and print
            reply = disFromServer.readUTF();
            returnedInt = disFromServer.readInt();

            System.out.println("Received: '" + reply + "' Returned int: " + returnedInt);
            s.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    } // main
}
