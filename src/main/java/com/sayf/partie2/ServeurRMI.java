package com.sayf.partie2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServeurRMI {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            
            GarageImpl garage = new GarageImpl();
            
            registry.rebind("garage", garage);
            
            System.out.println("Serveur RMI prêt");
        } catch (Exception e) {
            System.err.println("Erreur serveur: " + e.toString());
            e.printStackTrace();
        }
    }
}