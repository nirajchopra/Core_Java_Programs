package com.rays.Networking.MultiThreadingEcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// Har ek connected client ke liye separate thread banega
public class MultiThreadingEchoServer extends Thread {

    public Socket client = null;

    // Constructor - jab client connect hoga tab uska socket yaha aayega
    public MultiThreadingEchoServer(Socket clientSocket) {
        this.client = clientSocket;
    }

    @Override
    public void run() {
        try {
            // Client ko data send karne ke liye PrintWriter
            // true matlab autoflush = har message turant client tak jayega
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            // Client se data receive karne ke liye BufferedReader
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String inputLine;

            // Jab tak client kuch bhej raha hai, tab tak loop chalega
            while ((inputLine = in.readLine()) != null) {

                System.out.println("Server received: " + inputLine);

                // Server message ko echo kar raha hai (client ko wapas bhej raha hai)
                out.println(inputLine + "..." + inputLine);

                // Agar client "Bye." bhej de, toh connection band kar do
                if ("Bye.".equalsIgnoreCase(inputLine)) {
                    break;
                }
            }

            // Streams aur socket close karna
            out.close();
            in.close();
            client.close();

        } catch (Exception e) {
            System.err.println("IOException in client communication: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        boolean isRunning = true;

        try {
            // Server port 5643 par start ho raha hai
            serverSocket = new ServerSocket(5643);
            System.out.println("Echo Server Started on port 5643");

            // Infinite loop - har naye client ke liye wait karega
            while (isRunning) {

                // Jab koi client connect karega toh accept() return karega
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress());

                // Har client ke liye ek naya thread create karein
                MultiThreadingEchoServer echoServer = new MultiThreadingEchoServer(clientSocket);

                // Thread ko start karna (run() method alag thread me chalega)
                echoServer.start();
            }

        } catch (IOException e) {
            System.err.println("Could not start server: " + e.getMessage());

        } finally {
            if (serverSocket != null) {
                try {
                    // Server socket close karne ki koshish
                    serverSocket.close();
                } catch (IOException e) {
                    System.err.println("Could not close server: " + e.getMessage());
                }
            }
        }

        System.out.println("Echo Server Stopped");
    }

}
