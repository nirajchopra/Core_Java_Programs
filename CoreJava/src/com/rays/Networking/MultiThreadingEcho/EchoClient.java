package com.rays.Networking.MultiThreadingEcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

    public static void main(String[] args) throws IOException {

        // Server ke saath connection banaya
        // 127.0.0.1 = localhost (same machine)
        // 5643 = Echo server ka port number
        Socket client = new Socket("127.0.0.1", 5643);

        // Server ko data send karne ke liye PrintWriter
        // true = auto flush (har baar message turant server ko bheja jayega)
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        // Server se response read karne ke liye BufferedReader
        BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));

        System.out.println("Client Started");

        // User (keyboard) se input lene ke liye stdIn
        BufferedReader stdIn = new BufferedReader(
                new InputStreamReader(System.in));

        // Pehla line user se read karo
        String line = stdIn.readLine();

        // Jab tak user input deta rahe, loop chalti rahegi
        while (line != null) {

            // User ka input server ko send karein
            out.println(line);

            // Server se echo response print karein
            System.out.println("Echo: " + in.readLine());

            // Agar user "Bye" likhe to connection close kar do
            if ("Bye".equals(line)) {
                break;
            }

            // Next line user se input lo
            line = stdIn.readLine();
        }

        // Sab streams aur socket band kar do
        out.close();
        in.close();
        stdIn.close();
        client.close();
    }
}
