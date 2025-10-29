package com.sayf.partie2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import com.sayf.model.Voiture;

public class GarageImpl extends UnicastRemoteObject implements GarageInterface {
    
    public GarageImpl() throws RemoteException {
        super();

    }

    @Override
    public void recevoirVoiture(Voiture voiture) throws RemoteException {
        System.out.println("Voiture reçue: " + voiture);
    }
}