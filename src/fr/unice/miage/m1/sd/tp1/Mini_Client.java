package fr.unice.miage.m1.sd.tp1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Mini_Client {

	public static void main(String[] arg) throws UnsupportedEncodingException, IOException {
		try {
			Socket socket = new Socket("127.0.0.1",12000);
			
            DataInputStream entree=new DataInputStream(socket.getInputStream());
            PrintStream sortie=new PrintStream(socket.getOutputStream());
            String nom = "client";
            sortie.println(nom);
            sortie.flush();
           String nomClient=entree.readLine();
		
}
		catch ( IOException e) {System.out.println(e); }
		
	}
	
	

		
       
}

