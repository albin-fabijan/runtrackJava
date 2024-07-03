package com.example;

public abstract class Personne {
    protected int identite; // Identifiant de la personne
    protected String nomSocial; // Nom social de la personne
    protected String adresse; // Adresse de la personne

    protected Personne(int identite, String nomSocial, String adresse) {
        this.identite = identite;
        this.nomSocial = nomSocial;
        this.adresse = adresse;
    }

    // Méthode pour obtenir l'identité de la personne
    public int getIdentite() {
        return identite;
    }

    // Méthode pour définir l'identité de la personne
    public void setIdentite(int identite) {
        this.identite = identite;
    }

    // Méthode pour obtenir le nom social de la personne
    public String getNomSocial() {
        return nomSocial;
    }

    // Méthode pour définir le nom social de la personne
    public void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    // Méthode pour obtenir l'adresse de la personne
    public String getAdresse() {
        return adresse;
    }

    // Méthode pour définir l'adresse de la personne
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Méthode pour afficher les informations de la personne
    protected void affiche() {
        System.out.println("Identité: " + identite);
        System.out.println("Nom Social: " + nomSocial);
        System.out.println("Adresse: " + adresse);
    }
}
