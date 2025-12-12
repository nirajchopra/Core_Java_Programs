package com.rays.Networking.UDP;

import java.net.*;
import java.io.*;

public class UDPServer {

    public static void main(String[] args) throws Exception {

        // 4445 port par ek UDP socket create kiya (yahaan server sunega)
        DatagramSocket socket = new DatagramSocket(4445);
        System.out.println("Server is up and waiting for a client...");

        // Client se aane wala data store karne ke liye 256 bytes ka buffer
        byte[] bt = new byte[256];

        // DatagramPacket banaya, jisme client ka message store hoga
        DatagramPacket packet = new DatagramPacket(bt, bt.length);

        // Server wait karega jab tak client message nahi bhejta
        socket.receive(packet);

        // Client ka message bytes se String me convert kiya
        String received = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Receive from client : " + received);

        // Server ka reply message
        String response = "Hello from UDP Server..!";

        // Reply ko bytes me convert kiya (kyunki UDP bytes me send karta hai)
        bt = response.getBytes();

        // Server client ko wapas reply bhej raha hai (client ka address + port use karke)
        packet = new DatagramPacket(bt, bt.length, packet.getAddress(), packet.getPort());

        // Packet ko client ko send kiya
        socket.send(packet);

        // Socket close kar diya
        socket.close();
        System.out.println("Server closed...");
    }
}
