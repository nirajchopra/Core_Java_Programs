package com.rays.Networking.UDP;

import java.net.*;
import java.io.*;

public class UDPClient {

    public static void main(String[] args) throws IOException {

        // Client apna socket bana raha hai (apne port par)
        DatagramSocket socket = new DatagramSocket();

        // Jo message server ko bhejna hai usko bytes me convert kiya
        byte[] bt = "Hello from UDP client!".getBytes();

        // Server ka IP address (localhost / apna computer)
        InetAddress address = InetAddress.getByName("127.0.0.1");

        // Packet banaya jisme data + server ka address + server ka port diya
        DatagramPacket packet = new DatagramPacket(bt, bt.length, address, 4445);

        // Server ko packet bhej diya
        socket.send(packet);

        // Server ke reply ke liye buffer ready kiya
        bt = new byte[256];

        // Empty packet banaya jisme server ka reply store hoga
        packet = new DatagramPacket(bt, bt.length);

        // Server ke reply ka wait karega
        socket.receive(packet);

        // Server ka reply bytes se String me convert kiya
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Quote of the moment : " + received);
    }
}
