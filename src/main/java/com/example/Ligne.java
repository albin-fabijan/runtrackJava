package com.example;

public class Ligne {

    private Commande commande; // La commande associée à la ligne
    private Article article; // L'article associé à la ligne
    private int quantiteCommande; // La quantité commandée de l'article

    public Ligne(Commande commande, Article article, int quantiteCommande) {
        this.commande = commande;
        this.article = article;
        this.quantiteCommande = quantiteCommande;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getQuantiteCommande() {
        return quantiteCommande;
    }

    public void setQuantiteCommande(int quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }

    public void affiche() {
        commande.affiche();
        article.affiche();
        System.out.println("Quantité Commandée: " + quantiteCommande);
    }
}
