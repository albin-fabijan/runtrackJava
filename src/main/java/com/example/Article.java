package com.example;

public class Article {
    // Déclaration des attributs
    private int reference; // Référence de l'article
    private String designation; // Désignation de l'article
    private double prixUnitaire; // Prix unitaire de l'article
    private int quantiteStock; // Quantité en stock de l'article

    // Constructeur avec paramètres
    public Article(int reference, String designation, double prixUnitaire, int quantiteStock) {
        this.reference = reference;
        this.designation = designation;
        this.prixUnitaire = prixUnitaire;
        this.quantiteStock = quantiteStock;
    }

    // Constructeur de copie
    public Article(Article a) {
        this.reference = a.reference;
        this.designation = a.designation;
        this.prixUnitaire = a.prixUnitaire;
        this.quantiteStock = a.quantiteStock;
    }

    // Méthodes d'accès aux attributs
    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    // Méthode pour afficher les informations de l'article
    public void affiche() {
        System.out.println("Référence: " + reference);
        System.out.println("Désignation: " + designation);
        System.out.println("Prix Unitaire: " + prixUnitaire);
        System.out.println("Quantité en Stock: " + quantiteStock);
    }
}
