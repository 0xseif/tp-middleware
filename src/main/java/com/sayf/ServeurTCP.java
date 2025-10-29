package com.sayf;


import com.sayf.model.Voiture;

import java.net.ServerSocket;

public class ServeurTCP {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Serveur démarré, en attente de connexion...");

            MiddlewareTCP middleware = new MiddlewareTCP();
            while (true) {
                Object receivedObject = middleware.recevoirObjet(serverSocket);
                if (receivedObject instanceof Voiture voiture) {
                    System.out.println("Voiture reçue : " + voiture);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

