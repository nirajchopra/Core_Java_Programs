package com.rays.Networking.MultiThreadingEcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient1 {
    public static void main(String[] args) throws IOException {

        // Server se connection banaya
        // 127.0.0.1 = localhost (same computer)
        // 5643 = EchoServer ka port number
        Socket client = new Socket("127.0.0.1", 5643);  //Loopback address and port number pass kiya.

        // Server ko data bhejne ke liye PrintWriter
        // true = auto flush (message turant server ko chala jata hai)
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        // Server se messages receive karne ke liye BufferedReader
        BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));

        System.out.println("Client Started");

        // User se input lene ke liye keyboard Reader
        BufferedReader stdIn = new BufferedReader(
                new InputStreamReader(System.in));

        // Pehla user input read karo
        String line = stdIn.readLine();

        // Jab tak user input deta rahe, loop chalta rahega
        while (line != null) {

            // User ka input server ko send karo
            out.println(line);

            // Server se echo response print karo
            System.out.println("Echo:" + in.readLine());

            // Agar user "Bye" likhe to connection band kar do
            if ("Bye".equals(line)) {
                break;
            }

            // Next input read karo
            line = stdIn.readLine();
        }

        // Sab streams aur socket close kar rahe hain
        out.close();
        in.close();
        stdIn.close();
        client.close();

    }
}
