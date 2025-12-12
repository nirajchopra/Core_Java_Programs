package com.rays.Networking.TCP;

import java.io.*;
import java.net.*;

public class TCPServer {
	
public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(1235);
		
		System.out.println("server waiting for a clinet...");
		
		Socket client = server.accept();
		System.out.println("client connected");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		
		out.writeBytes("hello client\n");
		
		String s = in.readLine();
		System.out.println("received from client" + s);
		client.close();
		server.close();
		System.out.println("server closed");
		
	}

}
