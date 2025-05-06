//package org.example.ClientServer;
//
//
//import javax.net.ssl.SSLServerSocket;
//import javax.net.ssl.SSLServerSocketFactory;
//import javax.net.ssl.SSLSocket;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//
//public class ClientServer throws IOExceptio {
//    SSLServerSocketFactory ssf = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault(); // SSLServerSocketFactory.getDefault() return ServerSocketFactory, then typecast to SSLServerSocketFactory
//    SSLServerSocket ss = (SSLServerSocket) ssf.createServerSocket(50000); // serverSocketFactory instances have methods used to create sockets, typcasted to SSLServerSocket
//    SSLSocket clientSocket = (SSLSocket) ss.accept(); //A server socket listens for a connection to be made to this socket and accepts it. And typecasted
//
//    BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//
//    String line = in.readLine();
//        System.out.println(line);
//
//        clientSocket.close();
//        ss.close();
//
//    //ServerSocket serverSocket = new ServerSocket(50000);
//    //ServerSocket sslServerSocket = (SSLServerSocket)serverSocket; //to create an SSLServerSocket, must use an SSLServerSocketFactory
//}
