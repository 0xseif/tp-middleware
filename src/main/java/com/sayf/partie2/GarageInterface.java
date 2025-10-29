package com.sayf.partie2;

import java.rmi.RemoteException;
import com.sayf.model.Voiture;
import java.rmi.Remote;


public interface GarageInterface extends Remote {
    void recevoirVoiture(Voiture voiture) throws RemoteException;
}