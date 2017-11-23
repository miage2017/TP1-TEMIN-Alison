package fr.unice.miage.m1.sd.tp1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur_Jouet{

	
public static void main(String[] zero) {
		
		ServerSocket socketserver  ;
		Socket socketduserveur ;

		try {
		
			socketserver = new ServerSocket(12000);
			socketduserveur = socketserver.accept(); 
			System.out.println("Connexion d'un client");
		        socketserver.close();
		        socketduserveur.close();

		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}

	

