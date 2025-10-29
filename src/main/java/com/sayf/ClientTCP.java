package com.sayf;

import com.sayf.model.Voiture;

public class ClientTCP {
    public static void main(String[] args) {
        try {
            Voiture voiture = new Voiture("Renault", "Clio", 2023);
            MiddlewareTCP middleware = new MiddlewareTCP();

            System.out.println("Envoi de la voiture au serveur...");
            middleware.envoyerObjet("localhost", 12345, voiture);
            System.out.println("Voiture envoyée avec succès!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

