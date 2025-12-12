package com.rays.Networking.URL;

import java.io.*;
import java.net.*;
import java.util.*;

public class URLWriter {

    public static void main(String[] args) throws Exception {

        // URL object banaya jisme website ka address diya
        URL url = new URL("https://erp.sunilos.com/NCSA/#/Test");

        // Server ko bhejne wala data
        String question = "java";

        // URL connection open kiyaa (server se connect hone ke liye)
        URLConnection conn = url.openConnection();

        // Server ko data bhejna hai isliye output enable kiya
        conn.setDoOutput(true);

        // Server ko data send karne ke liye OutputStreamWriter banaya
        OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

        // Data send kiya (q=java)
        out.write("q=" + question);

        // Stream close kar diya
        out.close();

        // Connection ko establish kiya
        conn.connect();

        // Server se data read karne ke liye InputStream
        InputStream iStr = conn.getInputStream();

        // Scanner use kiya jo line-by-line HTML content read karega
        Scanner in = new Scanner(iStr);

        System.out.print("URL contents ***");

        // Server ka response line by line print karna
        while (in.hasNext()) {
            String html = in.nextLine();
            System.out.println(html);
        }

        // Scanner close kar diya
        in.close();
    }
}
