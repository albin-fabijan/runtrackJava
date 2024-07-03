package com.example;

public class Client extends Personne {
    private double chiffreAffaire;

    public Client(int identite, String nomSocial, String adresse, double chiffreAffaire) {
        super(identite, nomSocial, adresse);
        this.chiffreAffaire = chiffreAffaire;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Chiffre d'Affaire: " + chiffreAffaire);
    }
}
