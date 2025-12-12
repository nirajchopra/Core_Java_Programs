package com.rays.Networking.MultiThreadingEcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadingEchoServer extends Thread {

	public Socket client = null;

	public  MultiThreadingEchoServer(Socket clientSocket) {
		this.client = clientSocket;
	}

	@Override
	public void run() {
		try {
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				System.out.println("Server received: " + inputLine);

				out.println(inputLine + "..." + inputLine);

				if ("Bye.".equalsIgnoreCase(inputLine)) {
					break;
				}
			}
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
			serverSocket = new ServerSocket(5643);
			System.out.println("Echo Server Started on port 5643");

			while (isRunning) {
				Socket clientSocket = serverSocket.accept();
				System.out.println("New client connected:" + clientSocket.getInetAddress());

				MultiThreadingEchoServer echoServer = new MultiThreadingEchoServer(clientSocket);
				echoServer.start();
			}
		} catch (IOException e) {
			System.err.println("Could not start server: " + e.getMessage());

		} finally {
			if (serverSocket != null) {
				try {
					serverSocket.close();
				} catch (IOException e) {
					System.err.println("Could not close server: " + e.getMessage());

				}
			}
		}
		System.out.println("Echo Server Stopped");
	}

}