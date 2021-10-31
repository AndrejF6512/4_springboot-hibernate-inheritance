package com.andrej.hibernate.joined;

import javax.persistence.Entity;

@Entity
public class Bike extends Vehicle {

    private int derailleur;

    public int getDerailleur() {
        return derailleur;
    }

    public void setDerailleur(int derailleur) {
        this.derailleur = derailleur;
    }
}
