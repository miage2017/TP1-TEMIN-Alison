package fr.unice.miage.m1.sd.tp1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur_Multi {
public static void main(String[] zero){
		
		ServerSocket socket;
		try {
		socket = new ServerSocket(12000);
		Thread t = new Thread(new Accepter_clients(socket));
		t.start();
		System.out.println("Serveur ok");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

class Accepter_clients implements Runnable {

	   private ServerSocket socketserver;
	   private Socket socket;
	   private int nbrclient = 1;
		public Accepter_clients(ServerSocket s){
			socketserver = s;
		}
		
		public void run(){
			while(true) {
	        	try {
					socket = socketserver.accept(); // Un client se connecte on l'accepte
	        		System.out.println("Connexion d'un client !");
					this.service_client();
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		}
		public void service_client() throws UnsupportedEncodingException, IOException {
				int i = 0 ; 
			String nouveau_message = "";
			while (nouveau_message   != null && !nouveau_message.equals("finish")) {
				InputStreamReader isr = new InputStreamReader(socket.getInputStream(), "UTF-8");
				
				BufferedReader flux_entrant = new BufferedReader(isr);
				nouveau_message = flux_entrant.readLine();
				System.out.println("ligne " + i +" " + nouveau_message);
				i++;
			}
	      
}
}
