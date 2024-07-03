package com.example;

import java.util.Date;

public class Commande {
    private int numeroCommande;
    private Date dateCommande;
    private Client client;

    public Commande(int numeroCommande, Date dateCommande, Client client) {
        this.numeroCommande = numeroCommande;
        this.dateCommande = dateCommande;
        this.client = client;
    }

    public int getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(int numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void affiche() {
        System.out.println("Numéro de Commande: " + numeroCommande);
        System.out.println("Date de Commande: " + dateCommande);
        client.affiche();
    }
}

