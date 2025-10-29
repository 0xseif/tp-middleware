package com.sayf.partie2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.sayf.model.Voiture;

public class ClientRMI {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            GarageInterface garage = (GarageInterface) registry.lookup("garage");
            Voiture voiture = new Voiture("Renault", "Clio", 2023);
            garage.recevoirVoiture(voiture);
            System.out.println("Voiture envoyée avec succès!");



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
