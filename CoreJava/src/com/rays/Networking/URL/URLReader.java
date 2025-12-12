package com.rays.Networking.URL;

import java.net.*;          // URL class ke liye
import java.io.InputStream; // URL se data read karne ke liye
import java.util.Scanner;   // Line-by-line read karne ke liye

public class URLReader {

    public static void main(String[] args) throws Exception {

        // Ek URL object banaya jisme website ka address diya
        URL u = new URL("https://erp.sunilos.com/NCSA/#/Test");

        // URL ke alag-alag parts ko print kar rahe hain
        System.out.println("Protocol: " + u.getProtocol()); // http ya https
        System.out.println("Host Name: " + u.getHost());     // domain name
        System.out.println("Port Number: " + u.getPort());   // port (agar diya ho)
        System.out.println("File Name: " + u.getFile());     // URL ka path part

        // URL se data read karne ke liye stream open kiya
        InputStream in = u.openStream();

        // Scanner se content ko line-by-line read karenge
        Scanner s = new Scanner(in);

        // Jab tak aur lines available hain tab tak print karo
        while (s.hasNext()) {
            String html = s.nextLine();  // Ek line read ki
            System.out.println(html);    // Print ki
        }

        // Scanner close kar diya
        s.close();
    }
}
