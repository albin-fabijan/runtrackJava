package com.example;

public abstract class Personne {
    protected int identite;
    protected String nomSocial;
    protected String adresse;

    protected Personne(int identite, String nomSocial, String adresse) {
        this.identite = identite;
        this.nomSocial = nomSocial;
        this.adresse = adresse;
    }

    public int getIdentite() {
        return identite;
    }

    public void setIdentite(int identite) {
        this.identite = identite;
    }

    public String getNomSocial() {
        return nomSocial;
    }

    public void setNomSocial(String nomSocial) {
        this.nomSocial = nomSocial;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    protected void affiche() {
        System.out.println("Identité: " + identite);
        System.out.println("Nom Social: " + nomSocial);
        System.out.println("Adresse: " + adresse);
    }
}
