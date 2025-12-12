package com.rays.Networking.TCP;

import java.io.*;
import java.net.*;

public class TCPClient {
	
	public static void main(String[] args) throws Exception {

		Socket client = new Socket("localhost", 1235);
		System.out.println("connected to server");
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		out.writeBytes("hello server");

		String s = in.readLine();
		System.out.println("received from server" + s);

		client.close();
		System.out.println("client closed");

	}

}
