package com.rays.Networking.TCP;

import java.io.*;
import java.net.*;

public class TCPClient {
	
    public static void main(String[] args) throws Exception {

        // Server se connect hone ke liye Socket object banaya
        // "localhost" matlab same computer par server chal raha hai
        // 1235 wohi port number hai jisme server listen kar raha hai
        Socket client = new Socket("localhost", 1235);  
        System.out.println("connected to server");
        
        // Server se data read karne ke liye input stream
        BufferedReader in = new BufferedReader(
                new InputStreamReader(client.getInputStream()));  
        
        // Server ko data bhejne ke liye output stream
        DataOutputStream out = new DataOutputStream(client.getOutputStream());  
        
        // Server ko ek message send kar diya
        out.writeBytes("hello server\n");  // \n zaroori hai warna server readLine() block ho jayega
        
        // Server se ek line receive karna
        String s = in.readLine();  
        System.out.println("received from server: " + s);  
        
        // Client connection close kar diya
        client.close();  
        System.out.println("client closed");  

    }
}
