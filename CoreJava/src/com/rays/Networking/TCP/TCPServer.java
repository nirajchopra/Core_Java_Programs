package com.rays.Networking.TCP;

import java.io.*;
import java.net.*;

public class TCPServer {
	
    public static void main(String[] args) throws Exception {
		
        // ServerSocket class ek TCP server banata hai jo client ka wait karega
        ServerSocket server = new ServerSocket(1235);  
        
        // Server console par message print karega ki woh client ka wait kar raha hai
        System.out.println("server waiting for a clinet...");  
        
        // accept() method client ki request accept karta hai
        // Yeh method tab tak rukta hai (blocking call) jab tak client connect nahi hota
        Socket client = server.accept();  
        System.out.println("client connected");
        
        // Client se data receive karne ke liye input stream
        BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));  
        
        // Client ko data bhejne ke liye output stream
        DataOutputStream out = new DataOutputStream(client.getOutputStream());  
        
        // Server client ko ek message send karega
        out.writeBytes("hello client\n");  
        
        // Client se ek line receive karna (readLine() jab tak '\n' nahi milta tab tak wait karega)
        String s = in.readLine();  
        System.out.println("received from client: " + s);  
        
        // Client connection close karna
        client.close();  
        
        // Server band karna
        server.close();  
        System.out.println("server closed");  
    }
}
