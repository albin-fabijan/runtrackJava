package com.example;

public class Client extends Personne {
    private double chiffreAffaire;

    public Client(int identite, String nomSocial, String adresse, double chiffreAffaire) {
        super(identite, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    // Getter pour le chiffre d'affaire
    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    // Setter pour le chiffre d'affaire
    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    // Méthode d'affichage des informations du client
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Chiffre d'Affaire: " + chiffreAffaire);
    }
}
