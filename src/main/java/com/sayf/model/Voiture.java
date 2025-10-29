package com.sayf.model;

import java.io.Serializable;

public class Voiture implements Serializable {
    private String marque;
    private String modele;
    private int annee;
    @Override
    public String toString() {
        return "Voiture [marque=" + marque + ", modele=" + modele + ", annee=" + annee + "]";
    }
    public Voiture(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }



}
