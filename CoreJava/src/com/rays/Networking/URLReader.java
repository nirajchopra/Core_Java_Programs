package com.rays.Networking;

import java.net.*;
import java.io.InputStream;
import java.util.Scanner;

public class URLReader {

    public static void main(String[] args) throws Exception {

        URL u = new URL("https://erp.sunilos.com/NCSA/#/Test");

        System.out.println("Protocol: " + u.getProtocol());
        System.out.println("Host Name: " + u.getHost());
        System.out.println("Port Number: " + u.getPort());
        System.out.println("File Name: " + u.getFile());

        // Open a stream to read from the URL
        InputStream in = u.openStream();

        // Use a Scanner to read the content line by line
        Scanner s = new Scanner(in);

        while (s.hasNext()) {
            String html = s.nextLine();
            System.out.println(html);
        }

        // Close the Scanner
        s.close();
    }

}
