package org.example.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Socket {
    public void EstablishConnection() throws IOException {
        ServerSocket serverSocket = new ServerSocket(50000);
        Socket socket = serverSocket.accept();
        System.out.println("Established connection from " + socket.getRemoteSocketAddress());

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String line = in.readLine();
        System.out.println("Server received: " + line);


    }
}
